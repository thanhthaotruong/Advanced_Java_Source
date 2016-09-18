package Ex5_4;
/*
 * Author : Thanh Thao
 * Date : 13 Sept 2016
 * Version 1.0
 */
public class CounterThread {

	public static void main(String[] args) throws InterruptedException {
		for (int i=0; i<10;i++){
			Counter t = new Counter();
			System.out.println("Thread: "+i);
			t.start();
			Thread.sleep(1000);
		}
	}

}
