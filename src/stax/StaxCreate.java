package stax;

import java.io.IOException;
import java.io.StringWriter;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

public class StaxCreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
	         //root element
			StringWriter stringWriter = new StringWriter();

	         XMLOutputFactory xMLOutputFactory = XMLOutputFactory.newInstance();
	         XMLStreamWriter xMLStreamWriter = xMLOutputFactory.createXMLStreamWriter(stringWriter);
	         
	         xMLStreamWriter.writeStartDocument();
	         xMLStreamWriter.writeStartElement("alphabets");
	   
	         xMLStreamWriter.writeStartElement("letters");	
	         xMLStreamWriter.writeCharacters("A");
	         xMLStreamWriter.writeEndElement();
	         
	         xMLStreamWriter.writeStartElement("letters");	
	         xMLStreamWriter.writeCharacters("B");
	         xMLStreamWriter.writeEndElement();
	         xMLStreamWriter.writeEndElement();
	         
	         xMLStreamWriter.writeEndDocument();

	         xMLStreamWriter.flush();
	         xMLStreamWriter.close();

	         String xmlString = stringWriter.getBuffer().toString();

	         stringWriter.close();

	         System.out.println(xmlString);
	}
		catch (XMLStreamException e) {
	         e.printStackTrace();
	   }
		catch (IOException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      }
	}
}
