package com.collections.programs.arraylist;

import java.util.ArrayList;


public class EmptyArrayList {

	public static void main(String[] args) {
		ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("List of first array: " + c1);
        c1.removeAll(c1);//Method to array ArrayList
        System.out.println("New Array List "+c1);
        
        //To check the ArrayList is empty or not
        System.out.println("Array List is empty :"+c1.isEmpty());
        
        //isEmpty method returns boolen value
        
	}

}
