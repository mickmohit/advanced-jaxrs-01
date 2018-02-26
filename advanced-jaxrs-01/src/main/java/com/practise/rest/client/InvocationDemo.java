package com.practise.rest.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.eclipse.persistence.oxm.MediaType;

public class InvocationDemo {

	public static void main (String[] args)
	{
		InvocationDemo demo= new InvocationDemo();
		Invocation inn=demo.preparerequestForMessagebyyear(2018);
		Response res= inn.invoke();
		System.out.println(res);
	}

	private static Invocation preparerequestForMessagebyyear(int year) {
		// TODO Auto-generated method stub
		Client client= ClientBuilder.newClient();
	return	client.target("http://localhost/messenger/bapi/").path("messages").queryParam("year",year)
				 .request().buildGet();
	}
	
}
