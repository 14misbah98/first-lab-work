package com.day6;

public class ClassesAndObjects9 {

	public static void main(String[] args) {
		
	}

}
class MethodOverload{
	public void  add(int i,int j)
	{
	System.out.println(i+j);
	}
	public boolean add (int i,int j ,int k) { 
		if(i+j==k) {
			return true ;
		}
		else
			return false;
	}
	
public  float add(float f1,float f2) {
	return f1+f2;
}
}
