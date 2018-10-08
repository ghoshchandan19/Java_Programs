package com.programs.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class IterateHashSet {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		set.add("Red");
		set.add("green");
		set.add("orange");
		set.add("Brown");
		set.add("white");
		
	Iterator<String> p=  set.iterator();
	while(p.hasNext())
	{
		System.out.println(p.next());
	}
	
	}

}
