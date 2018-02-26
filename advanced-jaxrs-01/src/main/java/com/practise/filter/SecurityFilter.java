package com.practise.filter;


import java.io.IOException;
import java.util.List;
import java.util.StringTokenizer;

/*import com.sun.jersey.spi.container.ContainerRequest;
import com.sun.jersey.spi.container.ContainerRequestFilter;*/

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

import org.glassfish.jersey.internal.util.Base64;


@Provider
public class SecurityFilter implements ContainerRequestFilter  {

	private static final String AUTHORIZATION_HEADER="Authorization";
	private static final String AUTHORIZATION_HEADER_PREFIX="Basic ";
	private static final String SECURED_URL_PREFIX="securedy";
	
	

	@Override
	public void filter(ContainerRequestContext requestcontext) throws IOException{
		// TODO Auto-generated method stub
		if(requestcontext.getUriInfo().getPath().contains(SECURED_URL_PREFIX)){
			List<String> authHeader= requestcontext.getHeaders().get(AUTHORIZATION_HEADER);
			if( authHeader!=null && authHeader.size()>0)
			{
				String authToken=authHeader.get(0);
				authToken=authToken.replaceFirst(AUTHORIZATION_HEADER_PREFIX, "");
				String stringDecode=Base64.decodeAsString(authToken);
				StringTokenizer token= new StringTokenizer(stringDecode, ":");
				String username= token.nextToken();
				String password= token.nextToken();
				
				if("user".equals(username) && "password".equals(password)){return ;}
			}
			
			Response unauthorisedStatus= Response.status(Response.Status.UNAUTHORIZED)
										.entity("User cannot access").build();
			requestcontext.abortWith(unauthorisedStatus);
			}
	}

}
