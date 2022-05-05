package com.bot.duckduckapi;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Singleton
@RegisterRestClient(baseUri = "https://api.duckduckgo.com")
public interface MyRemoteService 
{
    @GET
    @Path("/")
    WikiModel getTopic(@QueryParam("q") String q, @QueryParam("format") String format, @QueryParam("no_html") String no_html, @QueryParam("skip_disambig") String skip_disambig);
}
