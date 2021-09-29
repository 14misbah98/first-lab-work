package com.day15;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
public class ColDemo4 {

	public static void main(String[] args) {
		Set set=new HashSet();
		set=new TreeSet();//new MyCom());
		set.add("hello");
		set.add("hai");
		set.add("hello");
		set.add("zebra");
		set.add("milo");
		
		System.out.println(set);
		
		Iterator iter=set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
class MyCom implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}

	}


