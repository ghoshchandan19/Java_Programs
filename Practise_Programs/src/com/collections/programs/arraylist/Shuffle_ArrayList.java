package com.collections.programs.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shuffle_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> list_Strings = new ArrayList<String>();
		//To add into the list we use add method
		  list_Strings.add("Red");
		  list_Strings.add("Green");
		  list_Strings.add("Orange");
		  list_Strings.add("White");
		  list_Strings.add("Black");
		  list_Strings.add("Blue");
		  System.out.println("Before shuffling"+list_Strings);
		  Collections.shuffle(list_Strings);
		  System.out.println("After shuffling"+list_Strings);
		  
		  //Reverse an ArrayList
		  Collections.reverse(list_Strings);
		  System.out.println("After Reversing"+list_Strings);
		  
		  //Extracting a portion of the ArrayList
		  List<String> sub_List = list_Strings.subList(0, 3);
		  //ArrayList<String> sub_list=list_Strings.subList(0, 3);
		  System.out.println(sub_List);
		  
		
	}

}
