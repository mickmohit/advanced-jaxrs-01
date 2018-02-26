package com.practise.date.param;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.Provider;

@Provider
public class MyMessageBodyReader implements MessageBodyReader<Hello> {
   /* @Override
    public boolean isReadable(Class<?> type, Type genericType,
                              Annotation[] annotations, MediaType mediaType) {
        return (type == Hello.class);
    }
    @Override
    public Hello readFrom(Class<Hello> type, Type genericType,
                          Annotation[] annotations, MediaType mediaType,
                          MultivaluedMap<String, String> httpHeaders,
                          InputStream inputStream)
            throws IOException, WebApplicationException
    {
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(inputStream))) {
            String name = br.readLine();
            Hello hello = new Hello();
            hello.setName(name);
            return hello;
        }
    }*/
	@Override
	public boolean isReadable(Class<?> type, Type arg1, Annotation[] arg2, MediaType arg3) {
		// TODO Auto-generated method stub
		return (type == Hello.class);
	}
	@Override
	public Hello readFrom(Class<Hello> arg0, Type arg1, Annotation[] arg2, MediaType arg3,
			MultivaluedMap<String, String> arg4, InputStream inputStream) throws IOException, WebApplicationException {
		// TODO Auto-generated method stub
		try (BufferedReader br = new BufferedReader(
                new InputStreamReader(inputStream))) {
            String name = br.readLine();
            Hello hello = new Hello();
            hello.setName(name);
            return hello;
        }
	}
}