package com.bot.duckduckapi;
import com.google.gson.Gson;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")
public class WikiResource 
{
    @Inject
    @RestClient
    MyRemoteService myWikiRest;

    @Path("/find/{topic}")
    @GET
    @Produces({MediaType.TEXT_PLAIN})
    public String hello(@PathParam("topic") String topic)
    {
        WikiModel result=myWikiRest.getTopic(topic,"json","1","1");
        return result.getAbstract();
    }

}