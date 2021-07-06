package labwork;
import java.util.Scanner;
public class ScannerDemo {
	public static void main(String[] args) {
		//creates a reader instance which takes 
		//input from standard input -keyboard
		Scanner reader= new Scanner(System.in);
		System.out.print("enter a number:");
		
		//nextInt() reads the next integerfrom the keyboard
		int number = reader.nextInt();
		//println() prints the following line to the output screen
		System.out.println("you enterd :"+number);
		
}}

