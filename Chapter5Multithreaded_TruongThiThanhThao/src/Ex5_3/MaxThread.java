package Ex5_3;
/*
 * Author : Thanh Thao
 * Date : 13 Sept 2016
 * Version 1.0
 */
public class MaxThread extends Thread{
	private int io, hi;
	private int[] arr;
	private int max = 0;
	
	public MaxThread(int io, int hi, int[] arr) {
		this.io = io;
		this.hi = hi;
		this.arr = arr;
	}

	public int getIo() {
		return io;
	}

	public void setIo(int io) {
		this.io = io;
	}

	public int getHi() {
		return hi;
	}

	public void setHi(int hi) {
		this.hi = hi;
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	@Override
	public void run() {
		for (int i = this.io; i < this.hi; i++) {
            max = Math.max(arr[i], this.max);
        }
		
	}
	
	
}
