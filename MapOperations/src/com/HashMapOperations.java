package com;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashMapOperations {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("social", 90);
		map.put("maps", 98);
		System.out.println(map);

		TreeMap<String, Integer> trees = new TreeMap<String, Integer>();
		trees.put("social", 90);
		trees.put("maps", 70);
		trees.put("social", 90);
		trees.put("maps", 12);
		trees.put("social", 12342);
		trees.put("maps", 934343434);

		System.out.println(trees);

		LinkedHashMap<String, Integer> Link = new LinkedHashMap<String, Integer>();
		Link.put("ial", 90);
		Link.put("aps", 70);
		Link.put("sal", 90);
		Link.put("mps", 12);
		Link.put("soci", 12342);
		Link.put("aaps", 934343434);

		Link.remove("aaps");
		System.out.println(Link);

		System.out.println(Link.get("soci"));
		System.out.println(Link.containsKey("ial"));
		System.out.println(Link.values());
		System.out.println(Link.keySet());

	}

}
