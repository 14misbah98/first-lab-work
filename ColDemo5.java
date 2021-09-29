package com.day15;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class ColDemo5 {

	public static void main(String[] args) {
		Map map=new HashMap();
		map=new TreeMap();
		map.put("s2", "hello");
		map.put("s1", "hai");
		map.put("s3", "bye");
		
		System.out.println(map);
		
		System.out.println(map.get("s2"));
		
		Set set=map.entrySet();
		Iterator iter=set.iterator();
		while(iter.hasNext()) {
			//System.out.println(iter.next());
			Map.Entry me=(Map.Entry)iter.next();
			System.out.println(me.getKey());
			System.out.println(me.getValue());
		}
	}

	}


