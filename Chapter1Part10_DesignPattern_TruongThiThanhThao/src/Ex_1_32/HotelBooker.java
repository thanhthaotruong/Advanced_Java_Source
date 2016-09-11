package Ex_1_32;
/*
 * Author : Truong Thi Thanh Thao
 * Date : 05 Sept 2016
 * Version 1.0
 */
public class HotelBooker{

	private String checkInDate;
	private String checkOutDate;
	private String place;
	
	public HotelBooker(String checkInDate, String checkOutDate, String place) {
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.place = place;
	}

	public String getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(String checkInDate) {
		this.checkInDate = checkInDate;
	}

	public String getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(String checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}
	
	
	
	
}
