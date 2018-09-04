package com.collections.programs.arraylist;

import java.util.ArrayList;

public class Insert_Element {

	public static void main(String[] args) {
		
		ArrayList<String> list_Strings=new ArrayList<String>(0);
		 list_Strings.add("Red");
		  list_Strings.add("Green");
		  list_Strings.add("Orange");
		  list_Strings.add("White");
		  list_Strings.add("Black");
		  list_Strings.add("Blue");
		  list_Strings.add("Black");
		  
		  //Before adding element
		  System.out.println(list_Strings);
		  
		  //Adding element to specific postion
          list_Strings.add(0, "Pink");//Added element at 1st postion
          list_Strings.add(7,"Brown");
          
          //After adding element
          System.out.println(list_Strings);
          
		//Retrieve element at specifice position
          String element=list_Strings.get(3);
          System.out.println("Fourth element:"+element);
          
         //Update element of a specific position
          list_Strings.set(2, "Violet");
          System.out.println("New List:"+list_Strings);
          
          //Remove element from a specific postion
          list_Strings.remove(5);
          System.out.println("New List:"+list_Strings);
          
          //To get size of the array_list
          System.out.println(list_Strings.size());
		
	}

}
