import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ConfigParser {
	public void getDisplay(String name) {
		System.out.println("Hello "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File inputFile = new File("/home/samuel/workspace/FrameWorks/src/config.xml");
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser saxParser;
		try {
			saxParser = factory.newSAXParser();
			ConfigHandler userhandler = new ConfigHandler();
			saxParser.parse(inputFile, userhandler);
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class ConfigHandler extends DefaultHandler {
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		System.out.println("startElement");
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out.println("endElement");
	}

	@Override
	public void characters(char ch[], int start, int length) throws SAXException {
		System.out.println("characters");
	}
}