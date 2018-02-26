package com.practise.mohit;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("{pathParam}/rest")
public class ResourceParam {

 @PathParam("pathParam")	private String pathParamExample;
 @QueryParam("queryParam")	private String queryParamExample;

 @GET
	@Produces(MediaType.TEXT_PLAIN)
	public String testmethod()
	{
	return "it works"+ "pathParamExample=" +pathParamExample+ "queryParamExample"+queryParamExample;	
	}
 //http://localhost/messenger/webapi/value/rest?queryParam=queryValue
}
