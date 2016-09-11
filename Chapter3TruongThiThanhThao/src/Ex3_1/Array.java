package Ex3_1;
/*
 * Author : Truong Thi Thanh Thao
 * Date : 09 Sept 2016
 * Version 1.0
 */
import java.util.Arrays;
import java.util.List;

public class Array {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
		list.forEach(n -> System.out.println(n));
	}

}
