package com.programs.hashMap;

import java.util.HashMap;

public class ClearHashMap {

	public static void main(String[] args) {
		HashMap<Integer,String> hashMap=new HashMap<Integer,String>();
		hashMap.put(1,"Red");
		hashMap.put(2, "Green");
		hashMap.put(3,"Blue");
		hashMap.put(4,"Orange");
		//Clearing HashMap
		hashMap.clear();
		System.out.println("After Clearing "+hashMap);

	}

}
