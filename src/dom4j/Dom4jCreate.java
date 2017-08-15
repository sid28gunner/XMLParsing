package dom4j;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class Dom4jCreate {

	public static void main(String[] args) {
		try {
		Document doc= DocumentHelper.createDocument();
		Element root = doc.addElement("alphabets");
		root.addElement("letter").addText("A");
		root.addElement("letter").addText("B");
		root.addElement("letter").addText("C");
		root.addElement("letter").addText("D");
		
		OutputFormat format = OutputFormat.createPrettyPrint();
        XMLWriter writer;
        writer = new XMLWriter( System.out, format );
        writer.write( doc );
        }
		catch (UnsupportedEncodingException e) {
	         e.printStackTrace();
	      } catch (IOException e) {
	         e.printStackTrace();
	      }
}
}
