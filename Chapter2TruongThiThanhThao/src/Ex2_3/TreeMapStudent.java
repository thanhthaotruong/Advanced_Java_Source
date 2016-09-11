package Ex2_3;
/*
 * Author : Truong Thi Thanh Thao
 * Date : 07 Sept 2016
 * Version 2.0
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapStudent {
	Map<Integer,Student> mapA = new TreeMap<>();

	
	public TreeMapStudent() {
	}


	public TreeMapStudent(Map<Integer, Student> mapA) {
		this.mapA = mapA;
	}


	public Map<Integer, Student> getMapA() {
		return mapA;
	}


	public void setMapA(Map<Integer, Student> mapA) {
		this.mapA = mapA;
	}

	//data student
	public Map<Integer,Student> data(){
		Student st1 = new Student("Thao", 22, "Ben Tre");
		Student st2 = new Student("Thanh", 22, "Tien Giang");
		Student st3 = new Student("Quynh", 21, "Ben Tre");
		Student st4 = new Student("Anh", 22, "Binh Thuan");
		mapA.put(1,st1);
		mapA.put(2,st2);
		mapA.put(3,st3);
		mapA.put(4,st4);
		return mapA;
	}
	//show map of all student 
	public void showAll(){
		for (Integer key : mapA.keySet()) {
			System.out.println(key + "| "+mapA.get(key));
		}
	}
	//add a new student
	public Map<Integer,Student> add() throws NumberFormatException, IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter id: ");
		int key = Integer.parseInt(input.readLine());
		System.out.println("Enter name: ");
		String name = input.readLine();
		System.out.println("Enter age: ");
		int age = Integer.parseInt(input.readLine());
		System.out.println("Place of birth: ");
		String place = input.readLine();
		Student st = new Student(name, age, place);
		mapA.put(key, st);
		return mapA;
	}
	//remove a student in Map
	public void remove(int key){
		mapA.remove(key);
	}
	//search student by key (id of student)
	public void searchKey(int key){
		if (mapA.containsKey(key)){
			System.out.println("Exits !");
		}else {
			System.out.println("Not Exits !");
		}
	}
}
