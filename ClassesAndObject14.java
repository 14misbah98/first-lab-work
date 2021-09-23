package com.day7;

public class ClassesAndObject14 {

	public static void main(String[] args) {
		PaintBrush brush =new PaintBrush();
		brush.paint=new RedPaint();
		//brush.paint=new BluePaint();
		brush.doPaint();
	}

}
class PaintBrush{
	Paint paint;
	public void doPaint() {
		System.out.println(paint);
	}
	
}
abstract class Paint{}
class RedPaint extends Paint{}
class BluePaint extends Paint{}
class GreenPaint extends Paint{}

