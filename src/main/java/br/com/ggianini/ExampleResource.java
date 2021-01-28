package br.com.ggianini;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ExampleResource {

    @GET
    public String greet() {
        return "Hello World";
    }

    @GET
    @Path("/{name}")
    public String greet(@PathParam("name") String name) {
        return "Hello " + name + "!";
    }

}