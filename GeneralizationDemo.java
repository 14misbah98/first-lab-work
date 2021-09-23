
public class GeneralizationDemo {

	public static void main(String[] args) {
		SuperClass sc=new SubClass1();//the subclass object can replace the super class reference
		
		Employee e=new Engineer();
		
		Engineer eng=new Engineer();
		
		acceptEmployee(eng);
		acceptEmployee(e);
		acceptEmployee(new Attendar());
		
		acceptEngineer(eng);
		
	
		
	}
	public static void acceptEmployee(Employee e) {
		
	}
	public static void acceptEngineer(Engineer en) {
		
	}
}
//sub class replacing the super class
class SuperClass{}
class SubClass1 extends SuperClass{}//kind of superclass
class SubClass2 extends SuperClass{}//kind of superclass
class Employee{}
class Engineer extends Employee{}//engineer is a kind of employee
class Attendar extends Employee{}//attendar is a kind of employee



	


