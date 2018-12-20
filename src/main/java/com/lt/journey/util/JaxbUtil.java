package com.lt.journey.util;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class JaxbUtil {
	
	@SuppressWarnings("unchecked")
	public static <T> T xmlToBean(String XML, Class<T> load) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(load);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		return (T) unmarshaller.unmarshal(new StringReader(XML));
	}
	
}
