package Ex2_7;

/*
 * Author : Truong Thi Thanh Thao
 * Date : 08 Sept 2016
 * Version 2.0
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ContactMain {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		TreeMapContact treeMapContact = new TreeMapContact();
		treeMapContact.data();
		while (true) {
			BufferedReader input = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("===============OPTION==============");
			System.out
					.println("1-Show all contact\n2-Add new contact\n3-Search contact\n4-Delete contact\n5-UpdateContact");
			int choose = Integer.parseInt(input.readLine());
			switch (choose) {
			case 1:

				treeMapContact.showAll();
				break;
			case 2:
				treeMapContact.addNew();
				treeMapContact.showAll();
				break;
			case 3:
				System.out.println("Enter the name you want to search: ");
				String name = input.readLine();
				Contact contact = new Contact(name);
				treeMapContact.searchKey(contact);
				break;
			case 4:

				System.out.println("Enter the name you want to delete: ");
				String name1 = input.readLine();
				Contact contact2 = new Contact(name1);
				treeMapContact.deleteContact(contact2);
				treeMapContact.showAll();

			case 5:
				System.out.println("Enter the name you want to update: ");
				String name3 = input.readLine();
				System.out.println("Enter the phone you want to update: ");
				String phone = input.readLine();
				Contact contact3 = new Contact(name3, phone);
				treeMapContact.updateContact(contact3);
				treeMapContact.showAll();
				break;
			default:
				break;
			}
		}
	}

}
