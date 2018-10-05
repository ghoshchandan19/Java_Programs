package com.collections.programs.arraylist;

import java.util.ArrayList;

public class TrimArrayList {

	public static void main(String[] args) {
		ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("List of first array: " + c1);
//Trimmed the size of the arraylist
        c1.trimToSize();
        System.out.println(c1);
        
        //Increase the size of the araryList
        c1.ensureCapacity(2);
        c1.add("Chandan");
        c1.add("gHOSH");
        System.out.println(c1);

}
}
