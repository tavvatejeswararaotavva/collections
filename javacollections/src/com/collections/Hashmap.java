package com.collections;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "String");
		hm.put(2, "Integer");
		hm.put(3, "boolean");
		for (Map.Entry<Integer, String> entry : hm.entrySet()) {
			int key = entry.getKey();
			String val = entry.getValue();
			System.out.println("key :" + key + " value : " + val);

		}
	}

}
