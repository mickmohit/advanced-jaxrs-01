package com.practise.date.param;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Date;

import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;

@Provider
//@Produces(MediaType.TEXT_PLAIN)
@Produces("text/shortdate")
public class DateMessageBodyWriter implements MessageBodyWriter<Date> {

	@Override
	public long getSize(Date arg0, Class<?> arg1, Type arg2, Annotation[] arg3, MediaType arg4) {
		// TODO Auto-generated method stub
		return -1;
	}

	@Override
	public boolean isWriteable(Class<?> type, Type arg1, Annotation[] arg2, MediaType arg3) {
		// TODO Auto-generated method stub
		return Date.class.isAssignableFrom(type);
	}

	@Override
	public void writeTo(Date date, Class<?> type, Type arg2, Annotation[] arg3, MediaType mt,
			MultivaluedMap<String, Object> mvm, OutputStream out) throws IOException, WebApplicationException {
		// TODO Auto-generated method stub
		String shortDate=date.getDate()+ "_"+ date.getMonth() + "_" + date.getYear();
		//out.write(date.toString().getBytes());
		out.write(shortDate.getBytes());
	}

}
