package com.practise.date.param;

import java.util.Calendar;
import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("write")
public class ReaderParamResource {

	@GET
	@Path("wr")
	@Produces(MediaType.TEXT_PLAIN)
	public Date testmethod()
	{
	return Calendar.getInstance().getTime();
	}
	
	@POST
	@Path("reader")
	@Produces(MediaType.TEXT_PLAIN)
    public String sayHello(Hello hello)
    {
        return "Hello " + hello.getName();
    }

	
}
