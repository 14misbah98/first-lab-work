package com.day15;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
public class ColDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map=new HashMap();
		map=new WeakHashMap();
		String s1=new String("s100");
		String s2=new String("s200");
		
		map.put(s1, "hello");
		map.put(s2, "hai");
		
		System.out.println(map);
		
		s1=null;
		
		System.gc();
		
		System.out.println(map);
	}
	}

	


