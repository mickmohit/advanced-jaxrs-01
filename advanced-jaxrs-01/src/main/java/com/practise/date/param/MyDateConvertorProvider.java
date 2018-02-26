package com.practise.date.param;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.ext.ParamConverter;
import javax.ws.rs.ext.ParamConverterProvider;

public class MyDateConvertorProvider implements ParamConverterProvider {

	@Override
	public <T> ParamConverter<T> getConverter(Class<T> rawtype, Type arg1, Annotation[] arg2) {
		// TODO Auto-generated method stub
		if(rawtype.equals(MyDate.class))
		{
			return (ParamConverter<T>) new ParamConverter<MyDate>()
			{

				/*@Override
				public T fromString(String value) {
					MyDate dateParamModel = new MyDate();
					dateParamModel.setDateAsString(value);
					return (T) dateParamModel;
				}

				@Override
				public String toString(T bean) {
					return ((MyDate) bean).getDateAsString();
				}
*/
				@Override
				public MyDate fromString(String value) {
					// TODO Auto-generated method stub
					MyDate dateParamModel = new MyDate();
					dateParamModel.setDateAsString(value);
					return (MyDate) dateParamModel;
				}

				@Override
				public String toString(MyDate bean) {
					// TODO Auto-generated method stub
					return ((MyDate) bean).getDateAsString();
				}
				
			};
		}
		return null;
	}

}
