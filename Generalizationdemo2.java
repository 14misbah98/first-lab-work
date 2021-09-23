package hitday18;

public class Generalizationdemo2 {

	public static void main(String[] args) {
		B bObj=new B();
		System.out.println("i value of b is..:"+bObj.i);
		bObj.met();
		
		C cObj=new C();
		System.out.println("i value of c is..:"+cObj.i);
		cObj.met();
	}
}
class A{
	 int i=10;
	public void met() {
		System.out.println("a method called....");
	}
}
class B extends A{
	
}
class C extends A{
	
}













	


