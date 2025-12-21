package com;

public class Buffers {
	
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java");
		sb.append("world");
		sb.insert(4," , ");
		sb.replace(7, 12, "program");
		sb.delete(4, 6);
		
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		sb.append("123456789");
		System.out.println(sb);
		System.out.println(sb.capacity());
		
	}

}
