package com.programs.hashset;

import java.util.HashSet;

public class HashSetToArray {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		set.add("Red");
		set.add("green");
		set.add("orange");
		set.add("Brown");
		set.add("white");
		
		int size=set.size();
		//Create a new Array
		String array[]= new String[size];
		set.toArray(array);
		
		//Fetching the array elements
		for(String s:array)
		{
			System.out.println(s);
		}

	}

}
