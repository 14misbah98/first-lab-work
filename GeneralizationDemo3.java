
public class GeneralizationDemo3 {

	public static void main(String[] args) {
		B bObj=new B();
		System.out.println("bObj i value..:"+bObj.i);
		bObj.met();
		
		A aObj=new B();
		System.out.println("aObj i value..:"+aObj.i);
		aObj.met();
		
		C cObj=new C();
		System.out.println("cObj i value...:"+cObj.i);
		cObj.met();
	}
}
class A{
	int i=10;
	public void met() {
		System.out.println(" a class met logic called..................");
	}
}
class B extends A{
	
}
class C extends A{

}



