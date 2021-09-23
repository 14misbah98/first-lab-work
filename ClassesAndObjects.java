package com.day4;

public class ClassesAndObjects {
	public static void main(String[] args) {
		Calculator casio=new Calculator();
		int result=casio.add(10,20);
		System.out.println(result);
		
		System.out.println(casio.getCalculatorName());
		
		String output=casio.checkValue(10);
		System.out.println(output);
	}
}
class Calculator{
	//in a returnable method, return is compulsory
	//fire and wait
	int add(int i,int j) {
		return i+j;
	}
	String getCalculatorName() {
		return "Casio company";
	}
	String checkValue(int num) {
		if(num%2==0) {
			return "Even Number...";
		}
		else {
			return "Odd Number..";
		}
	}
}
