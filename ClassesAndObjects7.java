package com.day6;

public class ClassesAndObjects7 {

	
		public static void main(String[] args) {
			Car m=new Car("maruti");
			m.met();
		}
	}
	class Car{
		String str;
		public Car(String str) {
			System.out.println(str);
			this.str=str;
		}
		
		public void met() {
			System.out.println(str);
		}
	
	}

 
