package mod1_2.day7;

public class ClassessAndObject {
	public static void main(String[] args) {
		//main method is the starting point of execution
		//When JVM - Java Virtual Machine calls the interpreter of JAVA to run a program
		//it searches for this main method.
		//To create a object of the class, u need to use NEW keyword
		//We create objects so that we can call the behaviors of the class
		
		Human ravi=new Human();//created an object and assigned to a variable
		Human ram;//this will create a complex type variable ram of type Human and assigned to NULL
		//ram is not initialized to any Human Object
		
		new Human().i=20;//A new anonymous human object is created
		System.out.println(new Human().i);
		
		ravi.i=40;
		System.out.println(ravi.i);
		ravi.i=50;
		System.out.println(ravi.i);
	}
}
/*
 * CLASS -  A class is a blueprint, where u have your plan
 *
 * Generally - Nouns are classes (Nouns are name of a place, name of a thing or animal)
 * A class can have data and behavior - i.e Properties and Methods
 * Methods operate on the data.
 * For writing any java program, u need to write a class
 *
*/
class Human{//The class name should always start with a upper case and it should have a body
	int i=10;
}
/*
To create an object of the class, you need to use NEW keyword
*/

