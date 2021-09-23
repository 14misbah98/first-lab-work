package com.day7.anotherpack;
import com.day7.ClassesAndObjects13;
	public class DiffPackSubClass extends ClassesAndObjects13{
		public void met() {
//			System.out.println(pri);//private is only accessible with in class
//			System.out.println(nomod);//package scope - not available outside..
			System.out.println(pro);
			System.out.println(pub);
		}
	}
	class DiffPackNonSubClass{
		public void met() {
			ClassesAndObjects13 obj=new ClassesAndObjects13();
		//	System.out.println(obj.pri);//class scope
		//	System.out.println(obj.nomod);//package scope
		//	System.out.println(obj.pro);//package and relation scope
			System.out.println(obj.pub);//global scope
		}
	}

