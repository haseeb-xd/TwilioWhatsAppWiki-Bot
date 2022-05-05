package com.haseeb;
import com.twilio.Twilio;
import com.twilio.twiml.MessagingResponse;
import com.twilio.twiml.messaging.Body;
import com.twilio.twiml.messaging.Message;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import static spark.Spark.*;

public class SmsApp
{

    public static final String ACCOUNT_SID = "Find your SID on TWILIO CONSOLE";
    public static final String AUTH_TOKEN = "Find your TOKEN ON TWILIO CONSOLE";

    static boolean check=true;


    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
    }


    public static void main(String[] args)
    {
        
        port(getHerokuAssignedPort());
        
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);


        if(check)
        {
            com.twilio.rest.api.v2010.account.Message message = com.twilio.rest.api.v2010.account.Message.creator(
                            new com.twilio.type.PhoneNumber("whatsapp:+ put your phone number here"), 
                            new com.twilio.type.PhoneNumber("whatsapp:+14155238886"), 
                            "Welcome to WikiBot made by *Haseeb Ansari*, Type the keyword you want to search")
                    .create();
            check=false;
        }

        post("/sms", (req, res) ->
        {

            res.type("application/xml");
            String message= req.queryParams("Body").toString();
            String urlAdd= message.replaceAll(" ", "%20");
            System.out.println(urlAdd   +"url add!");



            URL url = new URL("https://gentle-depths-51344.herokuapp.com/hello/find/"+urlAdd);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setDoOutput(true);
            con.connect();
            int responseCode = con.getResponseCode();
            System.out.println("Response code of the object is "+responseCode);

            InputStream inputStream;
            if (200 <= responseCode && responseCode <= 299)
            {
                inputStream = con.getInputStream();
            }
            else
            {
                inputStream = con.getErrorStream();
            }

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                            inputStream));

            StringBuilder response = new StringBuilder();
            String currentLine;

            while ((currentLine = in.readLine()) != null)
                response.append(currentLine);

            in.close();

            message=response.toString();


            if(message==null || message.equals("") || message.equals(" "))
            {
                message="Try something else, could not find this on WikiPedia";
            }


            Body body = new Body
                    .Builder(message)
                    .build();

            Message sms = new Message
                    .Builder()
                    .body(body)
                    .build();



            MessagingResponse twiml = new MessagingResponse
                    .Builder()
                    .message(sms)
                    .build();
            return twiml.toXml();
        });

    }

}