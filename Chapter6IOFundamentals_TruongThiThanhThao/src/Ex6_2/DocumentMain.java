package Ex6_2;
/*
 * Author : Truong Thi Thanh Thao
 * Date : 14 Sept 2016
 * Version 3.0
 */
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

public class DocumentMain {
	
	public static void readDocument() throws FileNotFoundException, IOException{
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		String content;
		String document="";
		try (BufferedReader in = new BufferedReader(new FileReader("src/Ex6_2/document.txt"))){
			while ((content=in.readLine()) != null) {
				document += content;
				//System.out.println(document);
				String[] s = document.split(" ");
				for (int i = 0; i < s.length; i++) {
					s[i] = s[i].toLowerCase();
					/*
					 * add element into tree map
					 * if tree map contains element --> count ++
					 */
					if (treeMap.containsKey(s[i]) == false)
						treeMap.put(s[i], 1);
					else {
						int count = treeMap.get(s[i]);
						treeMap.replace(s[i], count + 1);
					}

				}
				//print tree map
				for (Object key : treeMap.keySet()) {
					System.out.println(key + " : " + treeMap.get(key));
				}
			}
		}catch(EOFException e){
			System.out.println("Error: "+e.getMessage());
		}
	}
	public static void main(String[] args) throws IOException {
		
		try {
			//read and execute document
			readDocument();
		} catch (IOException ex) {
			System.out.println("Error: " + ex.toString());
		}
	}

}
