package Ex5_3;

import java.util.Random;
import java.util.Scanner;

/*
 * Author : Thanh Thao
 * Date : 13 Sept 2016
 * Version 1.0
 */
public class MaxOfMaxArrayThread {

	public static void main(String[] args) throws InterruptedException {
		Scanner input = new Scanner(System.in);
		//enter number of element in array
		System.out.println("Input n: ");
		int n = input.nextInt();
		//create array with random number
		int arr[] = new int[n];
		Random rd = new Random();
		for (int i = 0; i < n; i++) {
			arr[i] = rd.nextInt(100);
		}
		//enter number of thread
		System.out.println("Input num of Thread: ");
		int numThreads = input.nextInt();
		int max = max(arr, numThreads);

		String strArr = "";
		for (int values : arr) {
			strArr += values + " ";
		}

		System.out.println("Aray: " + strArr);
		System.out.println("Max: " + max);
	}
	/*
	 * find number max in array
	 * input : array, number of thread
	 * output : number max
	 */
	public static int max(int[] arr, int numThreads) throws InterruptedException {
		int len = arr.length;
		int max = 0;
		MaxThread[] ts = new MaxThread[numThreads];
		for (int i = 0; i < numThreads; i++) {
			ts[i] = new MaxThread((i * len) / numThreads, (i + 1) * len / numThreads, arr);
			ts[i].start();
		}

		for (int i = 0; i < numThreads; i++) {
			ts[i].join();
			if (max < ts[i].getMax())
				max = ts[i].getMax();
		}

		return max;
	}
}
