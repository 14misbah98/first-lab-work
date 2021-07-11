import java.util.Scanner;
public class Areaofsquare {

	public static void main(String[] args) {
		System.out.println("enter side of square:");
		//capture the user's input
		Scanner scanner=new Scanner(System.in);
		//storing the captured value in a variable
		double side=scanner.nextDouble();
		//area of aquare=side*side
		double area=side*side;
		System.out.println("area of square is :"+area);
	}

}
