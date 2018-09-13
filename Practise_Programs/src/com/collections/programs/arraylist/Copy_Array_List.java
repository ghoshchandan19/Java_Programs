package com.collections.programs.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Copy_Array_List {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Red");
		list1.add("Blue");
		list1.add("Green");
		list1.add("Black");
		System.out.println("First List " +list1);
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("A");
		list2.add("B");
		list2.add("C");
		list2.add("D");
		System.out.println("Second List " +list2);
		//Copying of one list to another
		Collections.copy(list2, list1);//Data of list1 will be copied to list2
		System.out.println("Copy List to List2,\nAfter copy:");
		System.out.println("List1: " + list1);
		System.out.println("List2: " + list2);
	}

}
