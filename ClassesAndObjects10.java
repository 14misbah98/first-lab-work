package com.day6;

public class ClassesAndObjects10 {

	public static void main(String[] args) {
		Subclass obj=new Subclass();
		System.out.println(obj.i);
		obj.met();
	}

}

class Superclass{
	int i=10;
	public void met() {
		System.out.println("super class met...");
	}
}
class Subclass extends Superclass{
	
}