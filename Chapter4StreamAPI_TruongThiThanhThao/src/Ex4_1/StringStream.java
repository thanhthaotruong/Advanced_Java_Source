package Ex4_1;
/*
 * Author : Thanh Thao
 * Date : 12 Sept 2016
 * Version 1.0
 */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringStream {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("abc","a","","happy","efg","234","thanh","thao","","",
				"abef","egh","anh","quynh","happy");
		//count element is ""
		int count = (int) list1.stream().filter(s -> s.isEmpty()).count();
		System.out.println("Count element null: "+count);
		//count element has length >=5
		int count1 = (int) list1.stream().filter(s -> s.length()>=5).count();
		System.out.println("Count element has length >=5: "+count1);
		//count element contains "a"
		int count2 = (int) list1.stream().filter(s -> s.startsWith("a")).count();
		System.out.println("Count element contains a: "+count2);
		//count element has value = happy
		int count3 = (int) list1.stream().filter(s -> s.equals("happy")).count();
		System.out.println("Count element has value = happy: "+count3);
		
		//list 2 contains element that is not empty
		List<String> list2 = list1.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
		System.out.println("List 2:");
		list2.forEach(System.out::println);
		//list 3 has  3<=length<=6
		String list3 =list1.stream().filter(s -> s.length()>=3 && s.length()<=6).collect(Collectors.joining(", "));
		System.out.println("List 3: "+list3);
		
		//list 4 has element +"happy
		Stream<String> list4 = list1.stream().map(s -> s.concat("happy"));
		System.out.println("list 4: ");
		list4.forEach(System.out::println);
	}

}
