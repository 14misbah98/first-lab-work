package com.day15;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
public class ColDemo3 {

	public static void main(String[] args) {
Vector<String> list=new Vector<>();
		
		list.add("hello");
		list.add("aaaa");
		list.add("bbbb");
		
		Iterator iter=list.iterator();
		//list.add("afadsfdas");
		while(iter.hasNext()) {
			String s=(String)iter.next();
			System.out.println(s.equals("hello"));;
		}
		
		Enumeration<String> e=list.elements();
		list.add("blablabla");
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}

	


