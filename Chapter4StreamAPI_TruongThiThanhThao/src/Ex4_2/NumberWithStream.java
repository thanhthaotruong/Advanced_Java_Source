package Ex4_2;

/*
 * Author : Thanh Thao
 * Date : 12 Sept 2016
 * Version 1.0
 */
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

	public class NumberWithStream {
	/*
	 * check one number is prime or is not prime
	 * input : number
	 * output: true/false
	 */
	private static boolean isPrime(int number) {
		IntPredicate isDivisible = index -> number % index == 0;
		return number > 1 && IntStream.range(2, number - 1).noneMatch(isDivisible);
	}
	/*
	 * check one number is square or is not square
	 * input : number
	 * output : true/false
	 */
	public static boolean checkSquareNumber(int n){ 
		for(int i =1; i<= n;i++) if(i*i == n) {
			return true ;
		}
		return false; 
	}

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
		// print list1
		System.out.println("List1: " + list1);

		// list 2 has element = Square of (element of list 1)
		List<Integer> list2 = list1.stream().map(i -> i * i).collect(Collectors.toList());
		// print list2
		System.out.println("List 2: " + list2);

		// print max, min, sum, average in list 2
		IntSummaryStatistics stats = list2.stream().mapToInt((x) -> x).summaryStatistics();
		System.out.println("Max in List 2: " + stats.getMax());
		System.out.println("Min in List 2: " + stats.getMin());
		System.out.println("Sum : " + stats.getSum());
		System.out.println("Average: " + stats.getAverage());

		// List 3 contains element is prime in list 2
		List<Integer> list3 = list2.stream().filter(i -> isPrime(i)).collect(Collectors.toList());
		System.out.println("List 3: " + list3);

		// list 4 contains element is square number in list2
		List<Integer> list4 = list2.stream().filter(i -> checkSquareNumber(i)).collect(Collectors.toList());
		System.out.println("List 4: "+list4);
	}

}
