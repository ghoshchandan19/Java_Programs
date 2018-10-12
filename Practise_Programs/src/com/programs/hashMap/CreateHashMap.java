package com.programs.hashMap;

import java.util.HashMap;
import java.util.Map;

public class CreateHashMap {

	public static void main(String[] args) {
		HashMap<Integer,String> hashMap=new HashMap<Integer,String>();
		hashMap.put(1,"Red");
		hashMap.put(2, "Green");
		hashMap.put(3,"Blue");
		hashMap.put(4,"Orange");
		for(Map.Entry<Integer,String>x:hashMap.entrySet())
		{
			System.out.println(x.getKey()+ " "+x.getValue());
		}
		
		//Get the size of the HashMap
		System.out.println("Sizeof the HashMap "+hashMap.size());
		

	}

}
