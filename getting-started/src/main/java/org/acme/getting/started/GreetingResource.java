package org.acme.getting.started;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @Inject
    GreetingService service;

    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("/greeting/{name}")
    public String greeting(String name) {
        return "<h1>" + service.greeting(name) + "</h1>";
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String hello() {
        return "<h1>hello</h1>";
    }
}