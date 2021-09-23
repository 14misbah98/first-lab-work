import java.util.Scanner;
public class Loopingdemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number...:");
		int n=scan.nextInt();
		
		//I want to print even numbers range from the given number.
		
		if(n%2==0) {
			System.out.println("Even number....");
		}
		
		while(n>0) {
			System.out.println((n%2==0)?"Even Number..."+n:"Odd Number.."+n);
//			if(n%2==0) {
//				System.out.println("Even Number...."+n);
//			}
//			else {
//				System.out.println("odd number..."+n);
//			}
		
//			switch(n%2) {
//				case 0:{
//					System.out.println("even number..."+n);
//					break;
//				}
//				case 1:{
//					System.out.println("odd number..."+n);
//					break;
//				}
//			}
			--n;
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		n=5;
		do {
			System.out.println((n%2==0)?"Even Number..."+n:"Odd Number.."+n);
			--n;
		}while(n>0);
		
		
	}

	}


