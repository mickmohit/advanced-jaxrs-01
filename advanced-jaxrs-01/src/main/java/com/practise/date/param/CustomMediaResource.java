package com.practise.date.param;

import java.util.Calendar;
import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("CMR")
public class CustomMediaResource {

	@GET
	@Path("wr")
	@Produces(value={MediaType.TEXT_PLAIN, "text/shortdate"})
	public Date testmethod()
	{
	return Calendar.getInstance().getTime();
	}
	
	
	
	
}
