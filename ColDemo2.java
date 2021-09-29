package com.day15;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ColDemo2 {

	public static void main(String[] args) {
List list=new LinkedList();
		
		list.add(new Employee("hello"));
		list.add(new Employee("milo"));
		list.add(new Employee("arun"));
		
		Collections.sort(list,new MyComparator());
		System.out.println(list);
	}
}
class Employee implements Comparable{
	String name;
	public Employee(String name) {
		this.name=name;
	}
	@Override
	public String toString() {
		return name;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Employee e=(Employee)o;
		return this.name.compareTo(e.name);
	}
}
class MyComparator implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Employee s1=(Employee)o1;
		Employee s2=(Employee)o2;
		return s2.name.compareTo(s1.name);
	}
}
