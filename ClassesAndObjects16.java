package com.day8;

public class ClassesAndObjects16 {

	public static void main(String[] args) {
		SuperClass sc=new SubClass();
		sc.met();
	

	}
}
abstract class SuperClass{
	final public void met() {
		System.out.println("super logic...");
	}
	
	public abstract void met2();
}
class SubClass extends SuperClass{
	@Override
	public void met2() {
		System.out.println("met2 logic...");
	}
}
