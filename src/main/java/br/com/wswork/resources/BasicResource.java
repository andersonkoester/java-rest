package br.com.wswork.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/")
@Produces("application/json; charset=UTF-8")
public class BasicResource {

  @GET
  @Path("json")
  public Response getJson(){
    return Response.ok(null).build();
  }
}
