package curie;
import java.util.Scanner; 
class Controlstament {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);

System.out.println("Enter a number..:");

int x=scan.nextInt();

if(x%2==0) {
	System.out.println("Even Number..........");
}
else {
	System.out.println("Odd Number................");
}

//the same thing can also be achieved through TERNARY operator - ?(ternary)

System.out.println((x%2==0)?"Even Number...":"Odd Number......");

}
}