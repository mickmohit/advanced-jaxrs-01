package com.practise.date.param;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("date/{dateString}")
public class DateResource {

	 //@PathParam("dateString")	private String pathParamExample;
	//http://localhost/messenger/bapi/date/2017-08-02T13:31
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getRequestedDate(@PathParam("dateString") MyDate mydate)
	{
	return "it works" + mydate.getDate();	
	}
	
}
