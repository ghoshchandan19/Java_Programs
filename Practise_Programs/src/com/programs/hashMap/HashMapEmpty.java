package com.programs.hashMap;

import java.util.HashMap;

public class HashMapEmpty {

	public static void main(String[] args) {
		HashMap<Integer,String> hashMap=new HashMap<Integer,String>();
		hashMap.put(1,"Red");
		hashMap.put(2, "Green");
		hashMap.put(3,"Blue");
		hashMap.put(4,"Orange");
		//Checking HashMap is empty or not
		boolean result=hashMap.isEmpty();
		System.out.println("Checking HashMap :"+result);
		//Removing all the elements from the HashMap
		hashMap.clear();
		System.out.println("Chacking HashMap after clearing :"+hashMap.isEmpty());
		
		
	}

}
