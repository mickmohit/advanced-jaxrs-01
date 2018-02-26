package com.practise.date.param;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/bapi")
public class MyRestApi extends ResourceConfig {

	
	public MyRestApi(){
	
	packages("com.practise.date.param");
	packages("com.messenger.resources"); 
	packages("com.messenger.model"); 
	// Register my custom provider - not needed if it's in my.package.
    register(MyDateConvertorProvider.class);
    
	}
}


