package com.newjava;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Maps {
	public static void main(String[] args) {
		Map <String,Integer> map = new HashMap<>();
		System.out.println(map);
		
		map.put("Anu", 123);
		map.put("Arun", 126);
		map.put("Nithya", 124);
		map.put("radha", 120);
		
		System.out.println(map);
		
		Set<String> keyset = map.keySet();
		System.out.println(keyset);
		
		Collection<Integer> value = map.values();
		System.out.println(value);
		
		boolean contains = map.containsKey("Anu");
		System.out.println(contains);
		
		boolean contain = map.containsValue(154);
		System.out.println(contain);
		
		Set<Entry<String,Integer>> entryset = map.entrySet();
		System.out.println(entryset);
		
		for (Entry<String, Integer> entry : entryset) {
			System.out.println(entry);
			
			

		}
		
		
	}

}
