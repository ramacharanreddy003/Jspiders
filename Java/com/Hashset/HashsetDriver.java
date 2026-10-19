package com.Hashset;

public class HashsetDriver {

	public static void main(String[] args) {
	
		Hashset h = new Hashset();
		System.out.println(h.add(10));
		System.out.println(h.add(12));
		System.out.println(h.add(12));
		System.out.println(h.add(45));
		System.out.println(h.add(98));
		
		System.out.println(h.size());
		System.out.println(h.isEmpty());
		System.out.println(h.contains(10));
		System.out.println(h.contains(12));
		System.out.println(h.contains(21));
		
		System.out.println(h.remove(12));
		
		
		//System.out.println(h.set(10));
		//System.out.println(h.set(23));
		h.display();

	}

}
