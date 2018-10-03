package com.collections.programs.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SwapArrayList {

	public static void main(String[] args) {
		ArrayList<String> listStrings1 = new ArrayList<String>();
		//To add into the list we use add method
		listStrings1.add("Red");
		listStrings1.add("Green");
		  listStrings1.add("Orange");
		  listStrings1.add("White");
		  listStrings1.add("Black");
		  listStrings1.add("Blue");
		  
		  System.out.println("Array List before Swap");
		  for(String s: listStrings1)
			  System.out.println(s);
		  
		  Collections.swap(listStrings1, 0, 2);
		  System.out.println("Array List after swap");
		  for(String s1:listStrings1)
			  System.out.println(s1);
			  
			  
	}

}
