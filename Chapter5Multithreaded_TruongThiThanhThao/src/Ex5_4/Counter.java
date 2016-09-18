package Ex5_4;
/*
 * Author : Thanh Thao
 * Date : 13 Sept 2016
 * Version 1.0
 */
public class Counter extends Thread{
	static int counter=0;

	public Counter() {
	}

	@Override
	public void run() {
		for (int i=0;i<10;i++){
			counter++;
			System.out.println("Counter = "+counter);
		}
		
	}
	
}
