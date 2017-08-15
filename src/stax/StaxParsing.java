package stax;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class StaxParsing {

	public static void main(String[] args) {
		XMLInputFactory factory= XMLInputFactory.newInstance();
		try {
			XMLEventReader eventReader=factory.createXMLEventReader(new FileReader("input.txt"));
			while(eventReader.hasNext())
			{
				XMLEvent event = eventReader.nextEvent();
				//What type of xml element it is
				switch(event.getEventType())
				{
				//alphabets
				case XMLStreamConstants.START_ELEMENT:StartElement startElement = event.asStartElement();
	            //letter      
				String qName = startElement.getName().getLocalPart();
	                  
	                  if (qName.equalsIgnoreCase("alphabets")) {
	                      System.out.println("Start Element :"+qName);
	                  }
	                  break;
	
				 case XMLStreamConstants.CHARACTERS:Characters characters = event.asCharacters();
				 //for Data
				 if(characters != null)
				 System.out.println("Letter: " + characters.getData());
				 break;
				 
				 case XMLStreamConstants.END_ELEMENT:EndElement endElement = event.asEndElement();
				 if(endElement.getName().getLocalPart().equalsIgnoreCase("letter")) {
	                  System.out.println("End Element : letter");
	                  System.out.println();
	               }
	               break;
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (XMLStreamException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
