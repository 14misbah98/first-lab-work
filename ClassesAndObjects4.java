package com.day4;

public class ClassesAndObjects4 {
	public static void main(String[] args) {
		met();//with out creating object also the static methods and properties can be referred
		ClassesAndObjects4 obj=new ClassesAndObjects4();
		obj.met2();
		obj.met();//calling the static methods with object reference is discouraged
		ClassesAndObjects4.met();//normally static methods are called with class name
		met();//since the met method is in the same class,  we can also directly call
		
		ClassesAndObjects4 obj2=new ClassesAndObjects4();
		obj2.met2();
		obj.met();
	}
	
	static void met() {
		System.out.println("static met called....");
	}
	void met2() {
		System.out.println("non static met called.....");
	}
}
/*
Static methods cannot access non static variables or methods
Static methods can only access static variables or methods
Static methods and variable are automatically loaded by JVM
Without creating an object instance, u can refer static methods and static variables.
One instance of the static variable or method is created and it is shared by multiple instance of the class
static variables and static methods are also called CLASS VARIABLES AND CLASS METHODS
*/





















