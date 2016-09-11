package Ex2_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Author : Truong Thi Thanh Thao
 * Date : 07 Sept 2016
 * Version 2.0
 */
public class WordMain {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		SetOfWord setOfWord = new SetOfWord();
		while (true) {
			BufferedReader input = new BufferedReader(new InputStreamReader(
					System.in));
			// choose one of all option below
			System.out.println("===========OPTION===========");
			System.out
					.println("1-Show All Dictionary\n2-Add new word\n3-Search a word\n4-Delete a word");
			int choose = Integer.parseInt(input.readLine());
			switch (choose) {
			// choose=1: show all dictionary
			case 1:
				setOfWord.data();
				setOfWord.showAll();
				break;
			// choose=2: add a new word
			case 2:
				setOfWord.addWord();
				setOfWord.showAll();
				break;
			// choose=3: search a word
			case 3:
				System.out.println("Enter word you want to search: ");
				String word = input.readLine();
				setOfWord.searchWord(word);
				break;
			// choose=4: delete a word in dictionary
			case 4:
				System.out.println("Enter a word you want to remove: ");
				String word1 = input.readLine();
				setOfWord.removeWord(word1);
				setOfWord.showAll();
				break;
			default:
				break;
			}
		}
	}

}
