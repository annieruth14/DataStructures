package com.bridgelabz.test.datastructures;

import org.junit.Assert;
import org.junit.Test;

public class MyHashMapTest {
	@Test
	public void givenSentence_whenWordsAreAddedToList_shouldReturnWordFrequency () {
		String sentence = "To be or not to be";
		MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for(String word: words) {
			//System.out.println(word);
			Integer value = myHashMap.get(word);
			if(value == null)
				value = 1;
			else
				value = value+1;
			myHashMap.add(word , value);
		}
		int frequency = myHashMap.get("to");
		//myHashMap.print();
		System.out.println(myHashMap);
		Assert.assertEquals(2, frequency);
	}
}
