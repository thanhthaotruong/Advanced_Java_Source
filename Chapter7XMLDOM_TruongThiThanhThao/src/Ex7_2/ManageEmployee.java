package Ex7_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

/*
 * Author : Truong Thi Thanh Thao
 * Date : 16 Sept 2016
 * Version 1.0
 */
public class ManageEmployee {
	// get unit from xml file
	public static Unit getUnit(Node node) {
		Unit unit = new Unit();
		if (node.getNodeType() == Node.ELEMENT_NODE) {
			Element element = (Element) node;
			int id = Integer.parseInt(element.getElementsByTagName("id").item(0).getTextContent());
			String name = element.getElementsByTagName("ten").item(0).getTextContent();
			unit = new Unit(id, name);
		}
		return unit;
	}

	// get employee from xml file
	public static Employee getEmployee(Node node) {
		Employee e = new Employee();
		if (node.getNodeType() == Node.ELEMENT_NODE) {
			Element element = (Element) node;
			int id = Integer.parseInt(element.getElementsByTagName("id").item(0).getTextContent());
			String ho_ten = element.getElementsByTagName("ho_ten").item(0).getTextContent();
			int gioi_tinh = Integer.parseInt(element.getElementsByTagName("gioi_tinh").item(0).getTextContent());
			String ngay_sinh = element.getElementsByTagName("ngay_sinh").item(0).getTextContent();
			int muc_luong = Integer.parseInt(element.getElementsByTagName("muc_luong").item(0).getTextContent());
			String dia_chi = element.getElementsByTagName("dia_chi").item(0).getTextContent();
			int id_don_vi = Integer.parseInt(element.getElementsByTagName("id_don_vi").item(0).getTextContent());
			e = new Employee(id, ho_ten, gioi_tinh, ngay_sinh, muc_luong, dia_chi, id_don_vi);
		}
		return e;
	}

	// show list unit from xml file
	public static List<Unit> printUnit(List<Unit> list) throws ParserConfigurationException {
		String pathFile = "src/Ex7_2/don_vi.xml";
		File xmlFile = new File(pathFile);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dbBuilder;

		try {
			dbBuilder = dbFactory.newDocumentBuilder();
			Document doc = dbBuilder.parse(xmlFile);
			doc.getDocumentElement().normalize();
			NodeList nodeList = doc.getElementsByTagName("don_vi");
			// XML is loaded as Document in memory, lets convert it to Object
			// List
			list = new ArrayList<>();
			for (int i = 0; i < nodeList.getLength(); i++) {
				list.add(getUnit(nodeList.item(i)));
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

	// show list employee from xml file
	public static List<Employee> printEmployee(List<Employee> list) throws ParserConfigurationException {
		String pathFile = "src/Ex7_2/nhan_vien.xml";
		File xmlFile = new File(pathFile);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dbBuilder;

		try {
			dbBuilder = dbFactory.newDocumentBuilder();
			Document doc = dbBuilder.parse(xmlFile);
			doc.getDocumentElement().normalize();
			NodeList nodeList = doc.getElementsByTagName("nhan_vien");
			// XML is loaded as Document in memory, lets convert it to Object
			// List
			list = new ArrayList<>();
			for (int i = 0; i < nodeList.getLength(); i++) {
				list.add(getEmployee(nodeList.item(i)));
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

	// create document to write employee in it
	public static Document getDoc()
			throws ParserConfigurationException, FileNotFoundException, SAXException, IOException {
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

		// root elements
		Document doc = docBuilder.newDocument();

		Element rootElement;
		File xmFile = new File("src/Ex7_2/nhan_vien.xml");

		if (xmFile.isFile()) {
			doc = docBuilder.parse(new FileInputStream(xmFile));
			doc.getDocumentElement().normalize();

		} else {
			rootElement = doc.createElement("don_vi");
			doc.appendChild(rootElement);
		}

		return doc;
	}

	// write employee into xml file
	public static List<Employee> addEmployee(List<Employee> list, Employee employee)
			throws ParserConfigurationException, IOException, TransformerException, SAXException {

		list.add(employee);

		Document doc = getDoc();
		Element rootElement = doc.getDocumentElement();
		// employee
		Element emp = doc.createElement("nhan_vien");
		rootElement.appendChild(emp);
		// id element
		Element id = doc.createElement("id");
		id.appendChild(doc.createTextNode(String.valueOf(employee.getId())));
		emp.appendChild(id);

		// name element
		Element name = doc.createElement("ho_ten");
		name.appendChild(doc.createTextNode(employee.getHo_ten()));
		emp.appendChild(name);

		// sex element
		Element sex = doc.createElement("gioi_tinh");
		sex.appendChild(doc.createTextNode(String.valueOf(employee.getGioi_tinh())));
		emp.appendChild(sex);
		// date of birth
		Element date = doc.createElement("ngay_sinh");
		date.appendChild(doc.createTextNode(employee.getNgay_sinh()));
		emp.appendChild(date);
		// muc_luong
		Element salary = doc.createElement("muc_luong");
		salary.appendChild(doc.createTextNode(String.valueOf(employee.getMuc_luong())));
		emp.appendChild(salary);
		// dia_chi
		Element address = doc.createElement("dia_chi");
		address.appendChild(doc.createTextNode(employee.getDia_chi()));
		emp.appendChild(address);
		// id_don_vi
		Element idUnit = doc.createElement("id_don_vi");
		idUnit.appendChild(doc.createTextNode(String.valueOf(employee.getId_don_vi())));
		emp.appendChild(idUnit);
		// write the content into xml file
		// writeTheContentXML();

		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(doc);
		StreamResult result = new StreamResult(new File("src/Ex7_2/nhan_vien.xml"));
		transformer.transform(source, result);

		System.out.println("Finished add employee!!");
		return list;
	}

	public static void writeTheContentXML() throws FileNotFoundException, ParserConfigurationException, SAXException,
			IOException, TransformerException {
		Document doc = getDoc();
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(doc);
		StreamResult result = new StreamResult(new File("src/Ex7_2/nhan_vien.xml"));

		transformer.transform(source, result);

	}

	public static void main(String[] args) throws NumberFormatException, IOException, ParserConfigurationException,
			TransformerException, SAXException {
		List<Unit> listU = new ArrayList<>();
		List<Employee> listE = new ArrayList<>();
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("=================OPTION============");
		System.out.println("1-List Unit\n2-List Employee\n3-List employee of unit\n4-Add new employee");
		int choose = Integer.parseInt(input.readLine());
		switch (choose) {
		case 1:
			System.out.println("=================LIST UNIT==================");
			printUnit(listU);
			break;
		case 2:
			System.out.println("==================LIST EMPLOYEE================");
			printEmployee(listE);
			break;
		case 3:
			System.out.println("=================ALL EMPLOYEE======================");
			listE = printEmployee(listE);
			System.out.println("==================LIST EMPLOYEE OF UNIT===============");
			System.out.println("Enter id of unit: ");
			int id = Integer.parseInt(input.readLine());
			List<Employee> list = listE.stream().filter(a -> (id == a.getId_don_vi())).collect(Collectors.toList());
			list.stream().forEach(System.out::print);
		case 4:
			System.out.println("==========ADD EMPLOYEE==========");
			System.out.println("Enter id: ");
			int idE = Integer.parseInt(input.readLine());
			System.out.println("Enter name: ");
			String name = input.readLine();
			System.out.println("Enter sex: ");
			int sex = Integer.parseInt(input.readLine());
			System.out.println("Enter date of birth: ");
			String dateOfBirth = input.readLine();
			System.out.println("Enter salary: ");
			int salary = Integer.parseInt(input.readLine());
			System.out.println("Enter address: ");
			String address = input.readLine();
			System.out.println("Enter id_unit: ");
			int id_unit = Integer.parseInt(input.readLine());
			Employee e = new Employee(idE, name, sex, dateOfBirth, salary, address, id_unit);
			addEmployee(listE, e);
			break;
		default:
			break;
		}
	}

}
