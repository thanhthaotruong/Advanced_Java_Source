package Ex2_2;
/*
 * Author : Truong Thi Thanh Thao
 * Date : 07 Sept 2016
 * Version 2.0
 */
public class WordEnglish {
	private String word;
	private String meaning;

	public WordEnglish(String word, String meaning) {
		this.word = word;
		this.meaning = meaning;
	}
	
	public WordEnglish(String word) {
		this.word = word;
	}

	public WordEnglish() {
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getMeaning() {
		return meaning;
	}

	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}
	@Override
	public String toString() {
		return word+" : "+meaning;
	}
}
