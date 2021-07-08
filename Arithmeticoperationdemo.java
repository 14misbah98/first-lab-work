package curie;
import java.util.Scanner; 
public class Arithmeticoperationdemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter i value....:");
		int i=scan.nextInt();
		System.out.println("please enter j value....:");
		int j=scan.nextInt();
		
		//addition
		int add=i+j;
		System.out.println("Addition..:"+add);
		
		int sub=i-j;
		System.out.println("Subtraction..:"+sub);
		
		int mul=i*j;
		System.out.println("Multiplication...:"+mul);
		
		int div=i/j;
		System.out.println("Division...:"+div);//this will have quotient
		
		int mod=i%j;//mod will have the reminder after division
		System.out.println("Reminder...:"+mod);
		
		
	}

	}


