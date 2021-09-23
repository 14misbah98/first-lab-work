package com.day9;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassesAndObjects20 {

public static void main(String[] args) throws Exception {
		PoliceStation p1=new PoliceStation();
		Politician holyman=new Politician();
		FreedomFighter fighter=new FreedomFighter();
		p1.arrest(holyman);
	}

}
class PoliceStation{
	public void arrest(Object o)throws Exception{
		Class c=o.getClass();
		Field f=c.getField("name");
		System.out.println(f.get(o));
		Method met=c.getMethod("service");
		met.invoke(o);
		
		f=c.getDeclaredField("secretName");
		f.setAccessible(true);
		System.out.println(f.get(o));
		met=c.getDeclaredMethod("SecretService");
		met.setAccessible(true);
		met.invoke(o);
	}
}
class FreedomFighter{
	public String name="freedom fighter";
	private String secretName="some agenda....";
	public void service() {
		System.out.println("freedom service");
	}
	private void secretService() {
		System.out.println("freedom fighter secret service.....");
	}
}
 class Politician {
	 private String secretName="unknown";
	 public String name="Iam a holy man....selflesss....for the people";
	  public void service() {
		  System.out.println("i do social service");
	  }
	  private void secretService() {
		  System.out.println("only god knows.....");
	  }
 }
	
	
