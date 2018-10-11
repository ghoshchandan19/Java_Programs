package com.programs.hashset;

import java.util.HashSet;

public class CloneAhashSet {

	public static void main(String[] args) {
		HashSet<String> set1=new HashSet<String>();
		set1.add("Red");
		set1.add("green");
		set1.add("orange");
		set1.add("Brown");
		set1.add("white");
		
		System.out.println("Cloning a HashSet "+set1);
		
		//Cloning a HashSet
		HashSet<String> set2=new HashSet<String>();
	set2=(HashSet)set1.clone();
	System.out.println("After Cloning "+set2);
	}

}
