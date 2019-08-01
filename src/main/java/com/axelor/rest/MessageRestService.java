package com.axelor.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/message")
public class MessageRestService{

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String printString()
	{
		return "Hello";
	}
	
	/*
	 * @GET
	 * 
	 * @Path("/{param}") public Response printMessage(@PathParam("param") String
	 * msg) { String result = "Restful example : " + msg;
	 * System.out.println(result); return
	 * Response.status(200).entity(result).build(); }
	 */
}
