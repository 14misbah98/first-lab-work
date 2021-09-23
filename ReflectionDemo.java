package com.day10;
import java.lang.reflect.Constructor;
public class ReflectionDemo {

	public static void main(String[] args) throws Exception {
	//Student	obj=(student)Class.forName("com.day10.Student").newInstance();
		Constructor c=Class.forName("com.day10.Student").getDeclaredConstructor(String.class);
		Student obj=(Student)c.newInstance("ramu");
		System.out.println(obj.getName());
		
	}

}
class Student{
	public Student() {
		System.out.println("student object created");
	}
	public Student(String name) {
		System.out.println("student object created"+name);
        this.name=name;
        
	}
	private String name;
	public String getName() {
		return name;
		
	}
	public void setName(String name) {
		this.name=name;
	}
	protected int getMarks(String exam) {
		if(exam.equals("test")) {
			return 90;
			}
		
			else if(exam.equals("annaul")) {
				return 100;
			}
			else {
				return 60;
			}
		}
	}
