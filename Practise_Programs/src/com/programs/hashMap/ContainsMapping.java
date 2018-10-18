package com.programs.hashMap;

import java.util.HashMap;

public class ContainsMapping {

	public static void main(String[] args) {
		HashMap < String, Integer > hash_map = new HashMap < String, Integer > ();
		  hash_map.put("Red", 1);
		  hash_map.put("Green", 2);
		  hash_map.put("Black", 3);
		  hash_map.put("White", 4);
		  hash_map.put("Blue", 5);
		  System.out.println("The Original map: " + hash_map);
		  
		  if(hash_map.containsKey("Orange"))
		  {
			  System.out.println("yes:"+hash_map.get("Green"));
		  }
		  else{
			  System.out.println("no: ");
		  }
			  

	}

}
