package com.day11;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		System.out.println("life before exception...");
		try {
			
			int i=1/Integer.parseInt(args[0]);
			
		}catch(ArithmeticException ae) {
			System.out.println("Please enter a value other than zero...");
			System.out.println(ae);
		}catch(ArrayIndexOutOfBoundsException aee) {
			System.out.println("Please pass an argument which is number...in nature...");
			System.out.println(aee);
		}catch(NumberFormatException ne) {
			System.out.println("Please enter a valid number and not a string");
			System.out.println(ne);
		}catch(Exception e) {
			System.out.println("unknown,,,dont know how to handle...just shout...");
			System.out.println(e);
		}
		finally {
			System.out.println("finally called");
		}
		System.out.println("life after exception....");
	}
}
