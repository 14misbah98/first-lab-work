package com.day6;

public class ClassesAndObjects8 {


		public static void main(String[] args) {
			MySingleTon obj1=MySingleTon.createObject();
			System.out.println(obj1);
			MySingleTon obj2=MySingleTon.createObject();
			System.out.println(obj2);
			MySingleTon obj3=MySingleTon.createObject();
			System.out.println(obj3);
		}
	}
	class MySingleTon{
		private MySingleTon() {
			System.out.println("my singleton object created...");
		}
		static MySingleTon obj;
		
		public static MySingleTon createObject() {
			if(obj==null) {
				obj=new MySingleTon();
			}
			return obj;
		}
	}


