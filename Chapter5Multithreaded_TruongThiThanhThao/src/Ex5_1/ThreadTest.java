package Ex5_1;

/*
 * Author : Thanh Thao
 * Date : 13 Sept 2016
 * Version 1.0
 */
public class ThreadTest {

	public static void main(String[] args) {
		ThreadDemo T1 = new ThreadDemo("GOOGLE");
		T1.start();

		ThreadDemo T2 = new ThreadDemo("YAHOO");
		T2.start();

		ThreadDemo T3 = new ThreadDemo("FACEBOOK");
		T3.start();
	}

}
