package com.collections.programs.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Examples {

	public static void main(String[] args) {
		ArrayList<String> list_Strings = new ArrayList<String>();
		//To add into the list we use add method
		  list_Strings.add("Red");
		  list_Strings.add("Green");
		  list_Strings.add("Orange");
		  list_Strings.add("White");
		  list_Strings.add("Black");
		  list_Strings.add("Blue");
		/*  
		if(list_Strings.contains("Green"));
		{
		System.out.println("Found the element");
         }
		else
         {
             System.out.println("There is no such element");
          }
          */
		  
		  //Sorting of array list
		  Collections.sort(list_Strings);
		  System.out.println("After sorting" +list_Strings);

	}

}

