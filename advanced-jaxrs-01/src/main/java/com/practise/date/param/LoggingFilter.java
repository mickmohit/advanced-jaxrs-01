package com.practise.date.param;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;

@Provider
public class LoggingFilter implements ContainerRequestFilter, ContainerResponseFilter {

	@Override
	public void filter(ContainerRequestContext arg0) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Request Headers");
		System.out.println("Headers::" +arg0.getHeaders());
	}

	@Override
	public void filter(ContainerRequestContext arg0, ContainerResponseContext arg1) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Response Headers");
		System.out.println("Headers::" +arg1.getHeaders());
	}

}
