package Ex_1_32;

import java.util.ArrayList;
import java.util.List;
/*
 * Author : Truong Thi Thanh Thao
 * Date : 05 Sept 2016
 * Version 1.0
 */
public class BookingFacade {
	
	public List<Booker> searchFight(){
		List<Booker> list = new ArrayList<>();
		Booker fightBooker1 = new FightBooker("12/12/2012", "20:00", "TPHCM");
		Booker fightBooker2 = new FightBooker("12/12/2012", "20:00", "Ha Noi");
		Booker fightBooker3 = new FightBooker("12/12/2012", "20:00", "Nha Trang");
		Booker fightBooker4 = new FightBooker("12/12/2012","5:30", "TPHCM");
		Booker fightBooker5 = new FightBooker("12/12/2012", "5:30", "Ha Noi");
		list.add(fightBooker1);
		list.add(fightBooker2);
		list.add(fightBooker3);
		list.add(fightBooker4);
		list.add(fightBooker5);
		return list;
	}
	public List<Booker> searchTrain(){
		List<Booker> list = new ArrayList<>();
		Booker trainBooker1 = new TrainBooker("12/12/2012", "20:00", "TPHCM");
		Booker trainBooker2 = new TrainBooker("12/12/2012", "20:00", "Ha Noi");
		Booker trainBooker3 = new TrainBooker("12/12/2012", "20:00", "Nha Trang");
		Booker trainBooker4 = new TrainBooker("12/12/2012","5:30", "TPHCM");
		Booker trainBooker5 = new TrainBooker("12/12/2012", "5:30", "Ha Noi");
		list.add(trainBooker1);
		list.add(trainBooker2);
		list.add(trainBooker3);
		list.add(trainBooker4);
		list.add(trainBooker5);
		return list;
	}
	public List<HotelBooker> searchHotel(){
		List<HotelBooker> list = new ArrayList<>();
		HotelBooker hotelBooker1 = new HotelBooker("12/10/2016", "14/10/2016", "Dong Khoi Street-Vung Tau City");
		HotelBooker hotelBooker2 = new HotelBooker("15/10/2016", "20/10/2016", "Thuy Van Street-Vung Tau City");
		HotelBooker hotelBooker3 = new HotelBooker("05/10/2016", "07/10/2016", "Thuy Van Street-Vung Tau City");
		HotelBooker hotelBooker4 = new HotelBooker("12/10/2016", "14/10/2016", "Nguyen Trai Street-HCM City");
		HotelBooker hotelBooker5 = new HotelBooker("05/10/2016", "06/10/2016", "Dong Khoi Street-HCM City");
		list.add(hotelBooker1);
		list.add(hotelBooker2);
		list.add(hotelBooker3);
		list.add(hotelBooker4);
		list.add(hotelBooker5);
		return list;
	}
}
