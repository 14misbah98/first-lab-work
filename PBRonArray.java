package com.day6;

public class PBRonArray {
	public static void main(String[] args) {
		int i[]= {10,20,30,40};
		System.out.println("Before Passing Array..:"+i[1]);
		met(i);
		System.out.println("After Passing Array..:"+i[1]);
	}
	
	public static void met(int a[]) {
		a[1]=100;
	}
}
