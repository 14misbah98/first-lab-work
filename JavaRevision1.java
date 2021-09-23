
public class JavaRevision1 {

	public static void main(String[] args) {
		System.out.println(args[0]+":"+args[1]);
		int n1=Integer.parseInt(args[0]);
		int n2=Integer.parseInt(args[1]);
		System.out.println(n1+n2);
		
		Employee emp1=new Employee();
		emp1.i=2020;
		Employee.s=3030;
		System.out.println(emp1.i);
		System.out.println(Employee.s);
		
		Employee emp2=new Employee();
		System.out.println(emp2.i);
		System.out.println(Employee.s);
		
		Employee e=new Employee(100000);
		e.met();
		int result=e.met2();
		System.out.println(result);
		System.out.println(e.met2(20));
		System.out.println(e.met2(11, "blabla"));
	}
}
class Employee{
	int i=10;//instance variable
	static int s=100;//class variable
	public Employee() {
		System.out.println("employee object created....");
		
	}
	public Employee(int i) {
		System.out.println(i);//it will refer the local variable
		System.out.println(this.i);//this will always refer to instance variable...
	}
	
	public void met() {
		System.out.println("met method called....");
	}
	public int met2() {
		System.out.println("met 2 method called...");
		return 1;
	}
	public int met2(int i) {
		System.out.println("the value supplied to met2 is..:"+i);
		return 2;
	}
	protected String met2(int i,String s) {
		if(i%2==0) {
			return "Even number...";
		}
		else {
			return "Odd Number...";
		}
	}
}


