package com.day6;

public class ClassessAndObjects11 {

	public static void main(String[] args) {
		Child obj=new Child();
		obj.met();
	}
}
class Parent{
	protected void met() {
		
		System.out.println("parent method called....");
		
	}
}
class Child extends Parent{
	public void met() {//the return type of overriden method cannot be changed.
		System.out.println("child method called...");
		
	}
}
//levels of accessibility is - private,nomodifier,protected,public
//in overriden methods you cannot reduce the visibility

