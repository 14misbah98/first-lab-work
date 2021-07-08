
package secondwork;
import java.util.Scanner;
public class Oddoreven {

	public static void main(String[] args) {
		int num;
		System.out.println("enter a integer number:");
		//the input provided by user is stored in num
		Scanner input=new Scanner(System.in);
		num=input.nextInt();
		
		/*if number is divisible by 2 then its an even number*else odd number*/
		if (num %2==0)
			System.out.println("entered number is even");
		else 
			System.out.println("entered number is odd");
		 

	}

}
