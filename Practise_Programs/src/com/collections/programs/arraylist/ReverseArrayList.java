package com.collections.programs.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Blue");
		list.add("Black");
		list.add("Green");
		list.add("Orange");
		list.add("Red");
		System.out.println("Pring the array list before reversing "+list);
		Collections.reverse(list);
		System.out.println("Printing tha rray list after reversing "+list);
		
		
	}

}
