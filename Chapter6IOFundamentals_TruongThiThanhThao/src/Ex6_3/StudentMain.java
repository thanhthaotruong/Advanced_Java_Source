package Ex6_3;
/*
 * Author : Truong Thi Thanh Thao
 * Date : 14 Sept 2016
 * Version 1.0
 */
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StudentMain {
	public static List<Student> readStudent(List<Student> list) throws FileNotFoundException,
			IOException {
		list = new ArrayList<Student>();
		Student st = new Student();
		try (DataInputStream in = new DataInputStream(new BufferedInputStream(
				new FileInputStream("src/Ex6_3/tongketnamhoc.txt")))) {
			while (in.available() > 0) {
				st = new Student();
				st.setName(in.readUTF());
				st.setGrade(in.readInt());
				st.setMark1(in.readDouble());
				st.setMark2(in.readDouble());
				list.add(st);
			}
		} catch (EOFException e) {
			System.out.println("Error: " + e.getMessage());
		}
		return list;
	}

	public static void writeStudent() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.println("Enter name: ");
		String name = input.readLine();
		System.out.println("Enter grade: ");
		int grade = Integer.parseInt(input.readLine());
		System.out.println("Enter mark1: ");
		double mark1 = Double.parseDouble(input.readLine());
		System.out.println("Enter mark2: ");
		double mark2 = Double.parseDouble(input.readLine());
		try (DataOutputStream out = new DataOutputStream(
				new BufferedOutputStream(new FileOutputStream(
						"src/Ex6_3/tongketnamhoc.txt", true)))) {
			out.writeUTF(name);
			out.writeInt(grade);
			out.writeDouble(mark1);
			out.writeDouble(mark2);
			System.out.println("Student is written.");
		} catch (IOException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}

	public static void main(String[] args) throws FileNotFoundException,
			IOException {
		List<Student> list = new ArrayList<Student>();
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		while (true) {
			System.out.println("===============OPTION===============");
			System.out.println("1-Add New Student\n2-Read file\n3-Statistic Grade\n4-Statistic Capacity\n5-Amount Student Of Grade");
			int choose = Integer.parseInt(input.readLine());
			switch (choose) {
			case 1:
				writeStudent();
				break;
			case 2:
				readStudent(list);
				for (int i = 0; i < readStudent(list).size(); i++) {
					System.out.println(readStudent(list).get(i).toString());
				}
				break;
			case 3:
				list=readStudent(list);
				System.out.println("===========GRADE 10===========");
				List<Student> list1 = list.stream().filter(i -> i.getGrade()==10).collect(Collectors.toList());
				list1.stream().forEach(System.out::print);
				System.out.println("===========GRADE 11===========");
				List<Student> list2 = list.stream().filter(i -> i.getGrade()==11).collect(Collectors.toList());
				list2.stream().forEach(System.out::print);
				System.out.println("===========GRADE 12===========");
				List<Student> list3 = list.stream().filter(i -> i.getGrade()==12).collect(Collectors.toList());
				list3.stream().forEach(System.out::print);
			case 4:
				list=readStudent(list);
				System.out.println("==============EXCELLENT=============");
				int count = (int) list.stream().filter(i -> i.avg()>=8).count();
				System.out.println("Amount: "+count);
				System.out.println("===============GOOD=============");
				int count1 = (int) list.stream().filter(i -> i.avg()<8 && i.avg()>=7).count();
				System.out.println("Amount: "+count1);
				System.out.println("================MEDIUM============");
				int count3 = (int) list.stream().filter(i -> i.avg()<7 && i.avg()>=5).count();
				System.out.println("Amount: "+count3);
				System.out.println("================BAD================");
				int count4 = (int) list.stream().filter(i -> i.avg()<5).count();
				System.out.println("Amount: "+count4);
			case 5:
				list=readStudent(list);
				System.out.println("===========GRADE 10===========");
				int amount  = (int) list.stream().filter(i -> i.getGrade()==10).count();
				DoubleSummaryStatistics stats = list.stream().filter(i -> i.getGrade()==10).mapToDouble((x) -> x.avg()).summaryStatistics();
				System.out.println("Amount: "+amount +"\t"+ "Average: "+stats.getAverage());
				System.out.println("============GRADE 11============");
				int amount1  = (int) list.stream().filter(i -> i.getGrade()==11).count();
				DoubleSummaryStatistics stats1 = list.stream().filter(i -> i.getGrade()==11).mapToDouble((x) -> x.avg()).summaryStatistics();
				System.out.println("Amount: "+amount1 +"\t"+ "Average: "+stats1.getAverage());
				System.out.println("==============GRADE 12=============");
				int amount2  = (int) list.stream().filter(i -> i.getGrade()==12).count();
				DoubleSummaryStatistics stats2 = list.stream().filter(i -> i.getGrade()==12).mapToDouble((x) -> x.avg()).summaryStatistics();
				System.out.println("Amount: "+amount2 +"\t"+ "Average: "+stats2.getAverage());
			default:
				break;
			}
		}
	}

}
