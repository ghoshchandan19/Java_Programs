package com.collections.programs.arraylist;

import java.util.ArrayList;

public class CompareArrayList {

	public static void main(String[] args) {
		ArrayList<String> listStrings1 = new ArrayList<String>();
		//To add into the list we use add method
		listStrings1.add("Red");
		listStrings1.add("Green");
		  listStrings1.add("Orange");
		  listStrings1.add("White");
		  listStrings1.add("Black");
		  listStrings1.add("Blue");
		  
		  ArrayList<String> listStrings2 = new ArrayList<String>();
			//To add into the list we use add method
			listStrings2.add("Red");
			listStrings2.add("Green");
			  listStrings2.add("Orange");
			  listStrings2.add("White");
			  listStrings2.add("Pink");
			  listStrings2.add("Blue");
			  
			  //Storing the Comparing output in an arrayList
			  ArrayList<String> output=new ArrayList<String>();
			  for(String s:listStrings1)
			  output.add(listStrings2.contains(s)?"yes":"No");
			  System.out.println(output);
			  
	}

}
