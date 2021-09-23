
public class JavaRevision2 {

	public static void main(String[] args) {
		
		Parent p=new Child();
		System.out.println(p.i);
		p.met();
		
		Child c=new Child();
		System.out.println(c.i);
		c.met();
		c.childMethod();
		
		
		AnotherChild ac=new AnotherChild();
		System.out.println(ac.i);
		ac.met();
		
		
	}
}
abstract class Parent{
	int i;
//	public Parent() {
//		System.out.println("abstrac class cons called...");
//	}
	public Parent(int i) {
		
	}
	final public void met() {
		System.out.println("parent method...");
	}
	public abstract void metAbs();
}
class Child extends Parent{
	
	public Child() {
		super(1);
	// TODO Auto-generated constructor stub
}
	public void childMethod() {
		System.out.println("child method called...");
		super.met();
	}
//	public void met() {
//		System.out.println("met method overriden");
//	}
	@Override
	public void metAbs() {
		// TODO Auto-generated method stub
		
	}
}
//class AnotherChild extends Parent(){
	//@Override
	//public void metAbs() {
	
	// TODO Auto-generated method stub
		
	
	
	
