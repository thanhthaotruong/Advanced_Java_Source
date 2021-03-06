package Ex2_1;

/*
 * Author : Truong Thi Thanh Thao
 * Date : 07 Sept 2016
 * Version 2.0
 */

public class CD implements Comparable<CD> {
	String id;
	String name;
	String singer;
	int numOfSongs;
	double price;

	public CD() {

	}

	public CD(String id, String name, String singer, int numOfSongs,
			double price) {
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

	@Override
	public int compareTo(CD o) {
		return this.name.compareTo(o.name);
	}

}
