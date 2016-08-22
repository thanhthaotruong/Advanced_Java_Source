package Bai1_10;

public class Human {
	protected String name;
	protected String dateOfBirth;
	protected String address;
	protected String phone;
	
	public Human(String name, String dateOfBirth, String address, String phone) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String printInformation(){
		return "Name: "+ name+" |Date of birth: "+dateOfBirth+" |Address: "+address+" |Phone: "
				+phone;
	}
	
}
