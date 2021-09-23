package com.day5;

public class FunExcercise1 {

	public static void main(String[] args) {
		PaintBrush asian=new PaintBrush();
		asian.doPaint(2);
		AnotherBrush chinese=new AnotherBrush();
		chinese.setColour("blue colour..");
		chinese.doPaint();
	}
}
class PaintBrush{
	public void doPaint(int i) {
		if(i==1) {
			System.out.println("red colour...");
		}
		else if(i==2) {
			System.out.println("blue colour....");
		}
		else if(i==3) {
			System.out.println("green colour.....");
		}
	}
}
class AnotherBrush{
	String colour;
	public void setColour(String co) {
		colour=co;
	}
	public void doPaint() {
		System.out.println(colour);
	}
}

	


