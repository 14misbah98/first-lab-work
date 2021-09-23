package hitday20;

public class AbstractDemo {

	public static void main(String[] args) {
SuperClass obj=new SubClass();
		
		obj.me2();
		obj.met();
		
		SuperClass obj2=new SubClass2();
		obj2.me2();
		obj2.met();
	}
}
/*
 * Why I should declare the class as abstract ?
 * 1. When I don't want an object of the class to be created.
 * 2. When I want to have abstract methods
 *
 *  Note: All super classes are common nouns, and the general rule of nature is, you cannot create
 *  an object of common noun.
 *  with the above concept - all super classes should be definitely abstract in nature
 *
 *  Note: abstract classes need not have abstract method but if you have abstract method then the class
 *  should be compulsorily declared abstract.
 *  Note: abstract classes can also have non abstract methods, but remember those methods should be declared final
 */
abstract class SuperClass{
	public SuperClass(int i) {//this constructor has to be explicity called by the subclass using super
		System.out.println("abstract class cons called...");
	}
	public abstract void met();
	final public void me2() {
		System.out.println("met 2 called...");
	}
}
class SubClass extends SuperClass{
	public SubClass() {
		super(20);//the parent class cons to be called using super keyword and it should be the first line
		System.out.println("sub class cons called....");
	}
	@Override
	public void met() {
		System.out.println("abstract method logic implemented....");
	}
}
class SubClass2 extends SuperClass{
public SubClass2() {
	super(2020);
	// TODO Auto-generated constructor stub
}
	@Override
	public void met() {
		System.out.println("abstract method subclass2 22 22 222 2222222 logic called...............");
	}
}

	


