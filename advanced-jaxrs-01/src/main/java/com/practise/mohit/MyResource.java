package com.practise.mohit;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("test")
@Singleton 
public class MyResource {

	private int count;
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String testmethod()
	{
	return "it works";	
	}
	
	@GET
	@Path("te")
	@Produces(MediaType.TEXT_PLAIN)
	public String testmethod1()
	{
		count++;
	return "it works_" +count+"_times";	
	}
	
}
