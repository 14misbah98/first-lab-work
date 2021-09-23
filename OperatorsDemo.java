
public class OperatorsDemo {

	public static void main(String[] args) {
		
			int i=10;
			int j=2;
			
			//ARITHMETIC OPERATORS
			System.out.println("Addition...:"+(i+j));
			System.out.println("Subtraction..:"+(i-j));
			System.out.println("Multiplication..:"+(i*j));
			System.out.println("Division..**quotient**..:"+(i/j));
			System.out.println("Division..**Reminder**..:"+(i%j));
			
			//ARITHMETIC OPERATORS - PART2
			
			int x=10;
			System.out.println(x++);//this is equivalent to x=x+1; - sei  - post increment - x will get printed with its old value
			//and then the x value will be incremented...
			System.out.println(x);
			
			x=10;
			System.out.println(++x);//here preincrement happens - after increasing the x value is printed.
			//simillarly you also have x-- and --x - try out yourself
			int y=20;
			System.out.println(y--);
			System.out.println(y);
			System.out.println(--y);
			
		
	
	}

}
