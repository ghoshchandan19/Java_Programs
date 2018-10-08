package com.programs.hashset;


import java.util.HashSet;

public class EmptyHashSet {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		set.add("Red");
		set.add("green");
		set.add("orange");
		set.add("Brown");
		set.add("white");
		System.out.println("Before empty "+set);
		
		set.removeAll(set);
		
		System.out.println("After empty "+set);
		
		System.out.println(set.isEmpty());

	}

}
