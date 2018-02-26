package com.practise.rest.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.eclipse.persistence.oxm.MediaType;

import com.messenger.model.Message;

public class RestApiClient {
	
	public static void main (String [] args)
	{
		 Client client= ClientBuilder.newClient();
	        //Response response=     client.target("http://localhost/advanced-jaxrs-01/webapi/messages/1").request().get();
		 WebTarget baseUrl=client.target("http://localhost/messenger/bapi/");
	     WebTarget msgTarget=  baseUrl.path("messages");
	     WebTarget singlemsgTarget=msgTarget.path("{messageId}");
	     
	     Message msg1=singlemsgTarget.resolveTemplate("messageId", "1").request().get(Message.class);
	     Message msg2=singlemsgTarget.resolveTemplate("messageId", "2").request().get(Message.class);
	     

	     Message msg= new Message(4,"My JAX RS Message","Mohit");
	   Response postreq=  msgTarget.request().post(Entity.json(msg));
	     //Above entity to wrap the msg object, as it needed to convert obj into entity 

	     Response msg3=singlemsgTarget.resolveTemplate("messageId", "3").request().put(Entity.json(msg));
	   
		 /*Response response=  client.target("http://localhost/messenger/bapi/messages/2").request().get();
	        Message mess=response.readEntity(Message.class);
	        System.out.println(mess.getMessage());
	        System.out.println(response);*/
	     System.out.println(msg1.getMessage());
	     System.out.println(msg2.getMessage());
	    
	     System.out.println("PUT::"+msg3.readEntity(Message.class).getMessage());
	     
	     //Read Entity here to parseas we have to read response from server
	     System.out.println(postreq.readEntity(Message.class).getMessage());
	     
	}
}
