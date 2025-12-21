package com;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreesSet {
	
	public static void main(String[] args) {
		Set<Integer>nums = new HashSet<Integer>();
		nums.add(10);
		nums.add(23);
		nums.add(1);
		nums.add(3);
		nums.add(28);
		System.out.println(nums);
		
		
		Set<Integer>t = new TreeSet<Integer>();
		nums.add(10);
		nums.add(22);
		nums.add(1);
		nums.add(3);
		nums.add(28);
		System.out.println(t);
		
		Set<Integer>Lon = new LinkedHashSet<Integer>();
		nums.add(10);
		nums.add(23);
		nums.add(1);
		nums.add(3);
		nums.add(28);
		System.out.println(Lon);
		
		Set<String>names = new TreeSet<String>(Arrays.asList("hi","hello"));
		System.out.println(names);
		
		
		
	}

}
