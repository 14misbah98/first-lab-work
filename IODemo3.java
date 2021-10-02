package com.day16;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
public class IODemo3 {
	public static void main(String[] args)throws Exception {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter a value...");
		
		String s=scan.next();
		
		System.out.println(s);
		
		//professional way of reading keyboard input
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter a value...:");
		s=br.readLine();
		System.out.println(s);
	}
}















