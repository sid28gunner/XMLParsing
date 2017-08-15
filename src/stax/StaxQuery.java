package stax;

import java.io.FileReader;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;

public class StaxQuery {

	public static void main(String[] args) {
		try {
			XMLInputFactory factory = XMLInputFactory.newInstance();
	        XMLEventReader eventReader = factory.createXMLEventReader(new FileReader("input.txt"));
	         
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
