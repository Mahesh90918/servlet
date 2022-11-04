package com.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class mapp {
public static void main(String[] args) {
	HashMap<Integer, Integer> map=new HashMap<>();
	map.put(105, 5);
	map.put(104, 4);
	map.put(103, 3);
	map.put(102, 2);
	map.put(101, 1);
	System.out.println(".........................");
	
	Set<Entry<Integer, Integer>> s=map.entrySet();
	for (Entry<Integer, Integer> entry : s) {
		System.out.println(entry.getKey()+" "+entry.getValue());
	}
	System.out.println(".........................");
	
	Set s1=map.keySet();
	System.out.println(s1);
	System.out.println(".........................");
	
	Collection s2=map.values();
	System.out.println(s2);
	
	System.out.println(".........................");
	
	Iterator itr=map.entrySet().iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
}
}
