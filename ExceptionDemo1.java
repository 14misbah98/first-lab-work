package com.day11;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		System.out.println("Life before exception");
		try {
			int i=1/0;
		}catch (ArithmeticException ae) {
			
		}
		System.out.println("life after exception.....");
	}

}
