package com.day6;

public class ClassesAndObjects6 {
		public static void main(String[] args) {
			Human sho=new Human();
			//sho.met();
			
			//Human shoiab=new Human("dhaanish");
			//shoiab.met();
		}
	}
	class Human{
		String str;
		public Human() {
			System.out.println("cons called...");
		}
		public Human(String s) {//over loaded constructor
			System.out.println("constructor with param called..."+s);
			str=s;//str is initialized
		}
		
		public void met() {
			System.out.println(str);
		}
	
	}


