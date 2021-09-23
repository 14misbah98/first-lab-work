package com.day7;

public class ClassesAndObjects12 {

	public static void main(String[] args) {
	 new SubClass();   
	}

}
 class SuperClass {
	 public SuperClass(int i) {
		 System.out.println("super class int cons called....."+i);
	 }
	 public SuperClass(String s) {
		System.out.println("super class string cons called...."+s);
	 }
 }
class SubClass extends SuperClass{
	public SubClass() {
		super("aaaaaaaaaaaaa");
		System.out.println("sub class cons called....");
	}
}