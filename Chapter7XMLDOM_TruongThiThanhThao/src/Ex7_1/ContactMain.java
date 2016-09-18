package Ex7_1;
/*
 * Author : Truong Thi Thanh Thao
 * Date : 16 Sept 2016
 * Version 1.0
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ContactMain {
	// get information contact in xml file
	public static Contact getContact(Node node) {
		Contact contact = new Contact();
		if (node.getNodeType() == Node.ELEMENT_NODE) {
			Element element = (Element) node;
			String name = element.getElementsByTagName("name").item(0)
					.getTextContent();
			String phone = element.getElementsByTagName("phone").item(0)
					.getTextContent();
			contact = new Contact(name, phone);
		}
		return contact;
	}
	//show list contact into screen
	public static List<Contact> printContact(List<Contact> list)
			throws ParserConfigurationException {
		String pathFile = "src/Ex7_1/contact.xml";
		File xmlFile = new File(pathFile);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dbBuilder;

		try {
			dbBuilder = dbFactory.newDocumentBuilder();
			Document doc = dbBuilder.parse(xmlFile);
			doc.getDocumentElement().normalize();
			NodeList nodeList = doc.getElementsByTagName("contact");
			// XML is loaded as Document in memory, lets convert it to Object
			// List
			list = new ArrayList<>();
			for (int i = 0; i < nodeList.getLength(); i++) {
				list.add(getContact(nodeList.item(i)));
			}
			// lets print list information
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).toString());
			}
		} catch (SAXException | IOException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
		return list;
	}
	/*
	 * remove a contact from list contact in xml
	 * input name
	 * output notification
	 */
	public static String remove(String name)
			throws ParserConfigurationException, IOException, SAXException,
			TransformerException {

		Document doc = getDoc();
		Element rootElement = doc.getDocumentElement();

		NodeList nodes = rootElement.getChildNodes();
		for (int i = 0; i < nodes.getLength(); i++) {

			Element contact = (Element) nodes.item(i);
			// <name>
			Element nameContact = (Element) contact
					.getElementsByTagName("name").item(0);
			String pName = nameContact.getTextContent();
			if (pName.equals(name)) {
				rootElement.removeChild(contact);

				TransformerFactory transformerFactory = TransformerFactory
						.newInstance();
				Transformer transformer = transformerFactory.newTransformer();
				DOMSource source = new DOMSource(doc);
				StreamResult result = new StreamResult(new File(
						"src/Ex7_1/contact.xml"));

				transformer.transform(source, result);

				return name + " was removed";
			}
		}
		return name + " was not found";
	}
	//create document to write xml
	public static Document getDoc() throws ParserConfigurationException,
			FileNotFoundException, SAXException, IOException {
		DocumentBuilderFactory docFactory = DocumentBuilderFactory
				.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

		// root elements
		Document doc = docBuilder.newDocument();

		Element rootElement;
		File xmFile = new File("src/Ex7_1/contact.xml");

		if (xmFile.isFile()) {
			doc = docBuilder.parse(new FileInputStream(xmFile));
			doc.getDocumentElement().normalize();

		} else {
			rootElement = doc.createElement("contacts");
			doc.appendChild(rootElement);
		}

		return doc;
	}
	/*
	 * write contact into document xml
	 * input: list contact, contact
	 * output: list contact
	 */
	public static List<Contact> addContact(List<Contact> list, Contact contact)
			throws ParserConfigurationException, IOException,
			TransformerException, SAXException {

		list.add(contact);

		Document doc = getDoc();
		Element rootElement = doc.getDocumentElement();
		// contact
		Element contact1 = doc.createElement("contact");
		rootElement.appendChild(contact1);

		// name element
		Element name1 = doc.createElement("name");
		name1.appendChild(doc.createTextNode(contact.name));
		contact1.appendChild(name1);

		// phone element
		Element phone1 = doc.createElement("phone");
		phone1.appendChild(doc.createTextNode(contact.phone));
		contact1.appendChild(phone1);

		// write the content into xml file
		// writeTheContentXML();

		TransformerFactory transformerFactory = TransformerFactory
				.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(doc);
		StreamResult result = new StreamResult(
				new File("src/Ex7_1/contact.xml"));
		transformer.transform(source, result);

		System.out.println("Finished add contact!!");
		return list;
	}
	/*
	 * write to xml
	 */
	public static void writeTheContentXML() throws FileNotFoundException,
			ParserConfigurationException, SAXException, IOException,
			TransformerException {
		Document doc = getDoc();
		TransformerFactory transformerFactory = TransformerFactory
				.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(doc);
		StreamResult result = new StreamResult(
				new File("src/Ex7_1/contact.xml"));

		transformer.transform(source, result);

	}

	public static void main(String[] args) throws ParserConfigurationException,
			IOException, TransformerException, SAXException {
		List<Contact> list = new ArrayList<>();
		while (true) {
			;BufferedReader input = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("=================OPTION============");
			System.out
					.println("1-Read File\n2-Add Contact\n3-Search contact\n4-Delete contact");
			int choose = Integer.parseInt(input.readLine());
			switch (choose) {
			case 1:
				System.out.println("========CONTACT LIST========");
				printContact(list);
				break;
			case 2:
				System.out.println("==========ADD CONTACT==========");
				System.out.println("Enter name: ");
				String name = input.readLine();
				System.out.println("Enter phone: ");
				String phone = input.readLine();
				Contact contact = new Contact(name, phone);
				addContact(list, contact);
				printContact(list);
				break;
			case 4:
				System.out.println("Enter name: ");
				name = input.readLine();
				remove(name);
				printContact(list);
				break;
			default:
				break;
			}
		}
	}

}
