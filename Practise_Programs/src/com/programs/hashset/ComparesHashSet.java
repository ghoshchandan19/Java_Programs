package com.programs.hashset;

import java.util.HashSet;

public class ComparesHashSet {

	public static void main(String[] args) {
		 // Create a empty hash set
        HashSet<String> h_set = new HashSet<String>();
     // use add() method to add values in the hash set
          h_set.add("Red");
          h_set.add("Green");
          h_set.add("Black");
          h_set.add("White");

          HashSet<String>h_set2 = new HashSet<String>();
          h_set2.add("Red");
          h_set2.add("Pink");
          h_set2.add("Black");
          h_set2.add("Orange");
          //comparison output in hash set
          HashSet<String>result_set = new HashSet<String>();
          for(String s:h_set)
          {
        	  System.out.println(h_set2.contains(s)?"yes":"No");
        	  
          }
          
          //Retaining the common element
          h_set.retainAll(h_set2);
          System.out.println(h_set);

	}

}
