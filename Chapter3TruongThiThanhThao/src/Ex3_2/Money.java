package Ex3_2;
/*
 * Author : Truong Thi Thanh Thao
 * Date : 09 Sept 2016
 * Version 1.0
 */
import java.util.Arrays;
import java.util.List;

public class Money {
	public static void main(String[] args) {
		List<Integer> amounts = Arrays.asList(new Integer[]{2,3,5,7});
		int price = 5200;
		amounts.forEach(money -> {
			System.out.println("Thanh tien = "+price*money+ " vnd");
		});
			
	}
}
