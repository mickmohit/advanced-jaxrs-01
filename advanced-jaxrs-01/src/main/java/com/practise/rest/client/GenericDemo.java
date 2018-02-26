package com.practise.rest.client;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

import com.messenger.model.Message;

public class GenericDemo {
	
	public static void main(String[] args)
	{
		Client client= ClientBuilder.newClient();
	List<Message> res=	client.target("http://localhost/messenger/bapi/").path("messages").queryParam("year",2018)
				 .request().get(new GenericType<List<Message>> () {});
	
	System.out.println(res);

	}

}
