package com.newjava;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repetative_map {
	public static void main(String[] args) {
		String word = "Good Morning Good Evening Good Night";
		String[] split = word.split(" ");
		Map<String, Integer> map = new LinkedHashMap<>();
		System.out.println(map);
		
		for (String string : split) {
			if (map.containsKey(string)) {
				
				Integer integer = map.get(string);
				map.put(string, integer+1);
			}else {
				map.put(string, 1);
				
			}
			
	}
		System.out.println(map);
		Set<Entry<String, Integer>>entrySet= map.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue()>1) {
				System.out.println(entry);
			}
			
		}
	}

}
