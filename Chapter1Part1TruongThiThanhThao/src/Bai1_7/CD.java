package Bai1_7;
/*
 * Author : Truong Thi Thanh Thao
 * Date : 20 August 2016
 * Version 1.0
 */


public class CD {
	String id;
	String name;
	String singer;
	int numOfSongs;
	double price;

	public CD() {

	}

	public CD(String id, String name, String singer, int numOfSongs, double price) {
		this.id = id;
		this.name = name;
		this.singer = singer;
		this.numOfSongs = numOfSongs;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public int getNumOfSongs() {
		return numOfSongs;
	}

	public void setNumOfSongs(int numOfSongs) {
		this.numOfSongs = numOfSongs;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
