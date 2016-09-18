package Ex5_1;
/*
 * Author : Thanh Thao
 * Date : 13 Sept 2016
 * Version 1.0
 */
public class ThreadDemo extends Thread {
	private Thread t;
	private String threadName;

	public ThreadDemo(String threadName) {
		this.threadName = threadName;
		System.out.println("Creating: " + threadName);
	}

	@Override
	public void run() {
		System.out.println("Running " + threadName);
		try {
			for (int i = 3; i > 0; i--) {
				System.out.println("Thread: " + threadName + " , " + i);
				Thread.sleep(50);
			}
		} catch (InterruptedException e) {
			System.out.println("Thread " + threadName + " interrrupted.");
		}
		System.out.println("Thread " + threadName + " exiting.");
	}

	@Override
	public void start() {
		System.out.println("Starting " + threadName);
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}

}
