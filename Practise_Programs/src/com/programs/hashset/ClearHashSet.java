package com.programs.hashset;

import java.util.HashSet;

public class ClearHashSet {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		set.add("Red");
		set.add("green");
		set.add("orange");
		set.add("Brown");
		set.add("white");
		
		//Before Clearing
		System.out.println("Before Claering "+set);
		set.clear();
		
		System.out.println("After Clearing "+set);

	}

}
