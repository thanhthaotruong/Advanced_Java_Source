package Ex2_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/*
 * Author : Truong Thi Thanh Thao
 * Date : 07 Sept 2016
 * Version 2.0
 */
public class SetOfWord {

    Set<WordEnglish> s = new HashSet<>();

    public SetOfWord(Set<WordEnglish> s) {
        this.s = s;
    }

    public SetOfWord() {
    }

    public Set<WordEnglish> getS() {
        return s;
    }

    public void setS(Set<WordEnglish> s) {
        this.s = s;
    }

    public Set<WordEnglish> showAll() {
        for (WordEnglish wordEnglish : s) {
            System.out.println(wordEnglish.toString());
        }
        return s;
    }
    //data for dictionary
    public Set<WordEnglish> data() {
        WordEnglish w1 = new WordEnglish("House", "Nha");
        WordEnglish w2 = new WordEnglish("Cat", "Meo");
        WordEnglish w3 = new WordEnglish("Bottle", "Chai nuoc");
        WordEnglish w4 = new WordEnglish("Hair", "Toc");
        WordEnglish w5 = new WordEnglish("Phone", "Dien thoai");
        s.add(w1);
        s.add(w2);
        s.add(w3);
        s.add(w4);
        s.add(w5);
        return s;

    }
    //add a new word
    public Set<WordEnglish> addWord() throws IOException {
        WordEnglish wo = new WordEnglish();
        BufferedReader input = new BufferedReader(new InputStreamReader(
                System.in));
        try {
            System.out.print("Enter word: ");
            String word = input.readLine();
            System.out.print("Enter meaning: ");
            String meaning = input.readLine();
            wo = new WordEnglish(word, meaning);
            s.add(wo);
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return s;
    }
    //search a word in dictionary
    public void searchWord(String word) {
        for (Object wordEnglish : s) {
            WordEnglish we = (WordEnglish)wordEnglish;
            if(we.getWord().equalsIgnoreCase(word)){
                System.out.println(we.toString());
            }            
        }
    }
    //remove a word in dictionary
    public void removeWord(String word) {
            WordEnglish ww=null;
         for (Object values : s) {
            WordEnglish we = (WordEnglish)values;
            if(we.getWord().equalsIgnoreCase(word)){
              ww = we;
            }            
        }
       s.remove(ww);
    }
}
