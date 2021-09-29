package com.day11;

public class ExceptionDemo4 {

	public static void main(String[] args) {
		System.out.println("life begins");
		if(args.length>0) {
			String o=args[0];
			if(Character.isDigit(o.charAt(0))) {
				int n=Integer.parseInt(o);
				if(n>0) {
					int i=1/n;
					
				}
				else {
					System.out.println("please enter a value other than zero");
				}
			}
			else {
				System.out.println("please enter a number, and not a character");
			}
		}
		else {
			System.out.println("please enter a command line argument...");
		}
		System.out.println("life continues.....");
	}

}
