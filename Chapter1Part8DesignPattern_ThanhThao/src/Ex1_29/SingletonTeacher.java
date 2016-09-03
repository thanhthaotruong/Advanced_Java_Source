package Ex1_29;

/**
 * @author Thanh Thao
 * @version 1.0
 * @created 01-Sep-2016 10:25:50 AM
 */
public class SingletonTeacher {

	private static SingletonTeacher instance;

	private SingletonTeacher(){

	}
	// method getDocument() print information document shared
	public String getDocument(){
		return "Reference: \n - Part1\n - Part2\n - Part3\n - Part4\n...";
	}

	public static SingletonTeacher getInstance(){
		return instance;
	}

}