package durai.interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AnagramWordList {

	public static void main(String[] args) {
		System.out.println("Enter the input passage");
		Scanner scanner = new Scanner(System.in);
		String inputSentence = scanner.nextLine();
		Set<String> stringList = splitWord(inputSentence);
		for (String str : stringList) {
			 createAnagrams("", str);
		}
		
	}

	private static void createAnagrams(String word, String str) {
		int strLength = str.length();
		 if (strLength == 0) {
			 System.out.println(word);
		 } else {
		        for (int i = 0; i < strLength; i++) {
		        	createAnagrams(word + str.charAt(i), str.substring(0, i) + str.substring(i+1, strLength));
		        }
		        	
		 }
	}

	private static Set<String> splitWord(String inputSentence) {
		//Method to split each word from a passage and remove any delimiters
		Set<String> wordsArray =  new HashSet<String>();
		String[] splitStr = inputSentence.split("\\s+");
		Set<String> setOfStrings =new HashSet<String>(Arrays.asList(splitStr));
		wordsArray.addAll(setOfStrings);
		return wordsArray;
		
	}

}
