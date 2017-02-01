package br.com.wswork.resources;

import br.com.wswork.business.UserBusiness;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/user")
@Produces("application/json; charset=UTF-8")
public class UserResource {

  @EJB
  private UserBusiness userBusiness;

  @GET
  @Path("/all")
  public Response getListUser(){
    return Response.ok(userBusiness.getUsers()).build();
  }

}
