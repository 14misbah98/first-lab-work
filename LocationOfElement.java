import java.util.Scanner;
public class LocationOfElement {

	public static void main(String[] args) {
		int  n,x,flag=0,i=0;
		Scanner m=new Scanner(System.in);
		System.out.println("Enter no. of elements you want in array:");
		n=m.nextInt();
		int a[]=new int[n];
		System.out.println("enter all the elements:");
		for(i=0;i<n;i++)
		{
			a[i]=m.nextInt();
			
		}
		System.out.println("enter the element you want to find:");
		x=m.nextInt();
		for(i=0;i<n;i++) {
			if(a[i]==x) {
				flag=1;
				break;
			}
			else {
				flag=0;
			}
		}
		if(flag==1) {
			System.out.println("element found at position:"+(i+1));
		}
		else {
			System.out.println("element not found");
		}
	}

}
