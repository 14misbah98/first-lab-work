import java.io.*;
import java.util.Scanner;

public class ArmstrongPerfectPalindrome {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter a number maximum  9 digit");
		int num=input.nextInt();
		System.out.println("enter the digit according to ur choice 1 or 2 or 3or 4 to check the number  what u hv entered");
		System.out.println("1.for checking Prime number");
		System.out.println("2.for checking Armstrong number");
		System.out.println("3.for checking palindrome number");
		System.out.println("4.for checking perfect number");
		System.out.println("enter ur choice");
		 int a=input.nextInt();
		 switch(a) 
		 {
		 case 1:
			 int flag=0;
		 for(int i=2;i<num;i++) {
			 if (num%i==0) {
				 System.out.println(num+"is not a prime number");
				 flag=1;
				 break;
			 }
		 }
		 if(flag==0)
			 System.out.println(num+"is a prime number");
		 break;
		 case 2:
			 int n=num;
			 int res=0,remainder;
			 while(num>0) {
				 remainder=num%10;
				 res=res+(remainder*remainder*remainder);
				 num=num/10;
				 
			 }
			 if (res==n)
				 System.out.println(n+"is not a Armstrong number");
			 break;
		 case 3:
			 int k=num;
			 int reverse=0,rem;
			 while(num>0) {
				 rem=num%10;
				 reverse=reverse*10+rem;
				 num=num/10;
			 }
			 if (reverse==k)
				 System.out.println(k+"is a palindrome number");
			 else
				 System.out.println(k+"is not a palindrome number");
			 break;
		 case 4:
			 int perfectNo=0;
			 int i;
			 System.out.println("factors are");
			 for(i=1;i<num;i++) {
				 if(num%i==0) {
					 perfectNo+=i;
					 System.out.println(i);
				 }
			 }
			 if(perfectNo==num) {
				 System.out.println("number is a perfect number");
			 }
			 else {
				 System.out.println("number is not a perfect number");
			 }
		 }

	}

}
