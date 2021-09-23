package com.day10;
import java.lang.reflect.Method;
public class ReflectionDemo3 {

	public static void main(String[] args) throws Exception{
		Temp obj=new Temp();
		Method methods[]=obj.getClass().getDeclaredMethods();
		for(Method m:methods) {
			System.out.println(m.getName());
		}
		Method method=obj.getClass().getDeclaredMethod("met");
		String result=(String)method.invoke(obj);
		System.out.println(result);
		
		method=obj.getClass().getDeclaredMethod("met",String.class,int.class);
		int r=(int)method.invoke(obj,"world",20);
		System.out.println(r);
		
		method=obj.getClass().getDeclaredMethod("met",Box.class);
		Box re=(Box)method.invoke(obj,new Box("hai hai hai"));
        System.out.println(re);
				}
}
class Temp{
	public String met() {
		return "HELLO";
		
	}
	public String met(String s) {
		return "hello"+s;
		
	}
	public int met(String s,int i) {
		return 1;
	}
	public Box met(Box box) {
		return box;
		
	}
}
class Box{
	String value;
	public Box (String value) {
		this.value=value;
		
	}
	@Override
	public String toString() {
		return "THIS IS BOX OBJECT"+value;
	}
}