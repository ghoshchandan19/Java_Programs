package com.programs.hashset;

import java.util.HashSet;

public class NumberOfElements {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		set.add("Red");
		set.add("green");
		set.add("orange");
		set.add("Brown");
		set.add("white");
		
		System.out.println("Number of elemnts in hashset : "+set.size());

	}

}
