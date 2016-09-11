package Ex2_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

/*
 * Author : Truong Thi Thanh Thao
 * Date : 08 Sept 2016
 * Version 2.0
 */
public class DocumentMain {

	public static void main(String[] args) throws IOException {
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		try {
			BufferedReader input = new BufferedReader(new InputStreamReader(
					System.in));
			//input document
			System.out.println("Enter document: ");
			String document = input.readLine();
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
		} catch (IOException ex) {
			System.out.println("Error: " + ex.toString());
		}
	}

}
