package Ex4_3;

/*
 * Author : Thanh Thao
 * Date : 12 Sept 2016
 * Version 1.0
 */
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ObjectWithStream {

	public static void main(String[] args) {
		// initial list student
		List<Student> listSt = Arrays.asList(new Student("Thanh","Thao", 22, 8.0,
				7.0), new Student("Phuong","Thanh", 17, 7.5, 6.5), new Student(
				"Thuy", "Quynh", 21, 8.5, 8.5), new Student("Hanh","Nguyen", 19,
				8.5, 7.5));
		System.out.println("List of students: ");
			System.out.println(listSt.toString());
		// Count students have age >=18
		int result = (int) listSt.stream().filter(x -> x.getAge() >= 18)
				.count();
		System.out.println("Number of students have old >=18: " + result);
		// Count students have first name start 'H'
		int number = (int) listSt.stream()
				.filter(x -> x.getFirstName().startsWith("H")).count();
		System.out.println("Number of stduents have FirstName start 'H': "
				+ number);
		// print information of student have first name start 'H'
		Optional<Student> result1 = listSt.stream()
				.filter(x -> x.getFirstName().startsWith("H")).findFirst();
		System.out.println(result1.get());
		// Statistic min , max, sum, average of The Average Mark
		DoubleSummaryStatistics stats = listSt.stream()
				.mapToDouble((x) -> x.average()).summaryStatistics();
		System.out.println("Highest Avg Mark in List: " + stats.getMax());
		System.out.println("Lowest Avg Mark in List: " + stats.getMin());
		System.out.println("Num of all Avg Marks: " + stats.getSum());
		System.out.println("Average of all avg marks: " + stats.getAverage());
		// list of student have average mark >=8
		List<Student> listGoodSt = listSt.stream()
				.filter(x -> x.average() >= 8).collect(Collectors.toList());
		System.out.println("List of very good students: ");
		System.out.println(listGoodSt);
	}

}
