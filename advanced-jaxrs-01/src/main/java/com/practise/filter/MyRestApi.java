package com.practise.filter;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/wbapi")
public class MyRestApi extends ResourceConfig {

	
	public MyRestApi(){
	
	packages("com.practise.filter");
	
	// Register my custom provider - not needed if it's in my.package.
 //   register(MyDateConvertorProvider.class);
    
	}
}


