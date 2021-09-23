package com.day4;

public class ClassesAndObjects1 {
	public static void main(String[] args) {
Human ramu; //variable called ramu declared
		
		//Scenario 1
		int a=new Human().age;//anonymous object
		String name=new Human().name;		
		System.out.println(a);
		System.out.println(name);
		//calling a method
		new Human().met();
		new Human().bringIdly(100);
		new Human().bringIdly(2000, "nawab hotel");
		new Human().met2(12,3,4,56,77,89);
		new Human().met3(new int[] {23,4,6,7,7,78,89,45});
		//Scenario 2
		Human shoiab=new Human(); //a object of human created and assigned to a varialbe of type Human
		System.out.println(shoiab.age);
		System.out.println(shoiab.name);
		shoiab.met();
		shoiab.bringIdly(1000);
		shoiab.bringIdly(4000, "buhari hotel");
		shoiab.met2(212,343,56,65,767,8787);
		shoiab.met3(new int[] {34,45,67,78,89,90,9});
	}
}
class Human{
	//variables or properties
	int age=50;
	String name="rahim";
	
	//methods or behviors
	//1. fire and forget method
	//2. fire and wait for response
	
	void met() {
		System.out.println("met called..");
	}
	
	void bringIdly(int money) {
		System.out.println("bring idly method called...:"+money);
	}
	
	void bringIdly(int money,String hotelName) {
		System.out.println("bring idly from...:"+hotelName+"and amount...:"+money);
	}
	
	//VARARGS - jdk5
	void met2(int... i) {
		for(int k=0;k<i.length;k++) {
			System.out.println(i[k]);
		}
	}
	
	void met3(int i[]) {
		for(int k=0;k<i.length;k++) {
			System.out.println(i[k]);
		}
	}
}















