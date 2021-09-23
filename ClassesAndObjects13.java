package com.day7;

public class ClassesAndObjects13 {
		private int pri;
		int nomod;
		protected int pro;
		public int pub;
	
		public void met() {
			System.out.println(pri);
			System.out.println(nomod);
			System.out.println(pro);
			System.out.println(pub);
		}
	}
	class SamePackSubClass extends ClassesAndObjects13{
		public void met() {
//			System.out.println(pri);//private is only accessible with in class
			System.out.println(nomod);
			System.out.println(pro);
			System.out.println(pub);
		}
	}
	class SamePackNonSubClass{
		
		public void met() {
			ClassesAndObjects13 obj=new ClassesAndObjects13();
			//System.out.println(obj.pri);//class scope
			System.out.println(obj.nomod);//package scope
			System.out.println(obj.pro);//package and relation scope
			System.out.println(obj.pub);//global scope
		}
	}
	


