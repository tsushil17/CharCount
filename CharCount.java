package com.mypackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CharCount {

	public static void main(String[] args) {
		String s = "abaaadsabcdsffsd";
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		long max = 0;
		Character maxChar = null;
		
		
		for (int i = 0; i < s.length(); i++) {
			Character ch = s.charAt(i);
			Integer value = map.get(ch);
			if (value != null) {
				map.put(ch, value + 1);
			} else
				map.put(ch, 1);
			if (map.get(ch)> max) {
				maxChar = ch;
				max = map.get(ch);
				
				
			}

		}

		Set<Character> set = map.keySet();
		Iterator<Character> it = set.iterator();
		while (it.hasNext()) {
			Character k = it.next();
			Integer v = map.get(k);
			System.out.println("The character of the given string is " + k + " and the count is " + v);
		}
		
		System.out.println("The maximum repeating character is " + maxChar + " and is repeated " + max + " times ");
	}
}
