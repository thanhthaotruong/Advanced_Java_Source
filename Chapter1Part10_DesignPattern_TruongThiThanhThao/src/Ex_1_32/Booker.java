package Ex_1_32;
/*
 * Author : Truong Thi Thanh Thao
 * Date : 05 Sept 2016
 * Version 1.0
 */
public class Booker {
	protected String dateStart;
	protected String hourStart;
	protected String places;

	public Booker(String dateStart, String hourStart, String places) {
		this.dateStart = dateStart;
		this.hourStart = hourStart;
		this.places = places;
	}

	public String getDateStart() {
		return dateStart;
	}

	public void setDateStart(String dateStart) {
		this.dateStart = dateStart;
	}

	public String getHourStart() {
		return hourStart;
	}

	public void setHourStart(String hourStart) {
		this.hourStart = hourStart;
	}

	public String getPlaces() {
		return places;
	}

	public void setPlaces(String places) {
		this.places = places;
	}

}
