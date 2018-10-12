package com.programs.hashMap;

import java.util.HashMap;

public class CopyHashMap {

	public static void main(String[] args) {
		HashMap<Integer,String> hashMap1=new HashMap<Integer,String>();
		hashMap1.put(1,"Red");
		hashMap1.put(2,"Green");
		hashMap1.put(3,"Black");
		System.out.println("New HashMap "+hashMap1);
		HashMap<Integer,String> hashMap2=new HashMap<Integer,String>();
		hashMap2.put(4,"Blue");
		hashMap2.put(5,"Orange");
		System.out.println("Second HashMap"+hashMap2);
		
		//Copying one map value to another map value
		hashMap2.putAll(hashMap1);
		System.out.println("New HashMap "+hashMap2);
		
	}

}
