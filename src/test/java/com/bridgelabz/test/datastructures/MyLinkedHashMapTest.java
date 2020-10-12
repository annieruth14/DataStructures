package com.bridgelabz.test.datastructures;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedHashMapTest {
	@Test
	public void givenSentence_whenWordsAreAddedToList_shouldReturnParanoidFrequency() {
		String sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
		MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = myLinkedHashMap.get(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			myLinkedHashMap.add(word, value);
		}
		int frequency = myLinkedHashMap.get("paranoid");
		// System.out.println(frequency);
		// System.out.println(myLinkedHashMap);
		Assert.assertEquals(3, frequency);
	}

	@Test
	public void givenSentence_whenRemoveWord_shouldReturnHashTableWithoutWord() {
		String sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
		MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = myLinkedHashMap.get(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			// System.out.println(value);
			myLinkedHashMap.add(word, value);
		}
		boolean result = myLinkedHashMap.remove("putting");
		Assert.assertTrue(result);
	}
}
