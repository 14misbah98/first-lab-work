package Day11;

public class LocalInstanceDemo {
	int i=101000000;//instance variable
	//instance variables are initialized by default
	//by default value zero is assigned for int
	int k=2020;
	public void met() {
		int i=10;//local variable
		System.out.println("Local Variable i...:"+i);//local variables are always referred
		
		//local variables are not initialized by default
		//How to refer the instance variable i from inside this method ?
		//make use of a keyword by name -this-
		System.out.println("Instance varialbe not overriden..:"+k);
		System.out.println("Instnace variable overriden..:"+this.i);
		
	}
	
	public static void main(String[] args) {
		LocalInstanceDemo obj2=new LocalInstanceDemo();
		obj2.i=5555;//instance variables can be accessed using the object reference
		//where as local variables cannot be accessed using the object reference.
		obj2.met();
		
		LocalInstanceDemo obj=new LocalInstanceDemo();
		obj.met();
			
	}
}

