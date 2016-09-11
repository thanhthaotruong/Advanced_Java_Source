package Ex_1_32;

/*
 * Author : Truong Thi Thanh Thao
 * Date : 05 Sept 2016
 * Version 1.0
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FacadeMain {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BookingFacade b = new BookingFacade();
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		try {
			System.out.println("Choose type: (1:Hotel 2:Fight 3:Train)");
			int type = Integer.parseInt(input.readLine());

			if (type == 1) {
				for (int i = 0; i < b.searchHotel().size(); i++) {
					System.out.println("CheckInDate: "
							+ b.searchHotel().get(i).getCheckInDate()
							+ " CheckOutDate: "
							+ b.searchHotel().get(i).getCheckOutDate()
							+ " Place of Hotel: "
							+ b.searchHotel().get(i).getPlace() + "\n");
				}
			} else if (type == 2) {
				for (int i = 0; i < b.searchFight().size(); i++) {
					System.out.println("DateStart: "
							+ b.searchFight().get(i).getDateStart()
							+ " HourStart: "
							+ b.searchFight().get(i).getHourStart()
							+ " Place: " + b.searchFight().get(i).getPlaces()
							+ "\n");
				}
			} else if (type == 3) {
				for (int i = 0; i < b.searchTrain().size(); i++) {
					System.out.println("DateStart: "
							+ b.searchTrain().get(i).getDateStart()
							+ " HourStart: "
							+ b.searchTrain().get(i).getHourStart()
							+ " Place: " + b.searchTrain().get(i).getPlaces()
							+ "\n");
				}
			}
		} catch (NumberFormatException | IOException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
}
