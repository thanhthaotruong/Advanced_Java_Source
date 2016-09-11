package Ex2_7;
/*
 * Author : Truong Thi Thanh Thao
 * Date : 08 Sept 2016
 * Version 2.0
 * Choose TreeMap with key=name value=phone because name is only
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapContact {
	Map<String, String> map = new TreeMap<String, String>();

	public TreeMapContact(Map<String, String> map) {
		this.map = map;
	}

	public TreeMapContact() {
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	//data of contact
	public Map<String, String> data() {
		Contact contact1 = new Contact("Thao", "01654747444");
		Contact contact2 = new Contact("Thanh", "0917364737");
		map.put(contact1.getName(), contact1.getPhoneNumber());
		map.put(contact2.getName(), contact1.getPhoneNumber());
		return map;
	}
	// show all contact
	public void showAll() {
		for (Object key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}
	}
	//add new contact
	public Map<String, String> addNew() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.println("Enter name: ");
		String name = input.readLine();
		System.out.println("Enter phoneNumber: ");
		String phoneNumber = input.readLine();
		Contact contact = new Contact(name, phoneNumber);
		map.put(contact.getName(), contact.getPhoneNumber());
		return map;
	}
	//search a contact 
	public void searchKey(Contact contact) {
		if (map.containsKey(contact.getName())) {
			System.out.println(contact.getName() + " : " + map.get(contact.getName()));
		} else {
			System.out.println("Not Exits !");
		}
	}
	//delete a contact
	public void deleteContact(Contact contact) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.println("Do you want to delete??");
		String choose = input.readLine();
		if (choose.equalsIgnoreCase("y")) {
			map.remove(contact.getName());
		} else if (choose.equalsIgnoreCase("n")) {

		} else {
			System.out.println("Information about contact is not searched!");

		}
	}
	//update a contact
	public void updateContact(Contact contact) throws IOException{
		if (map.containsKey(contact.getName())) {
			//map.put(contact.getName(), contact.getPhoneNumber());
			map.replace(contact.getName(), contact.getPhoneNumber());
		}
	}


}
