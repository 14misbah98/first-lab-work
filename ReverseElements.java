import java.util.Scanner;
public class ReverseElements {

	public static void main(String[] args) {
		int counter, i=0,j=0,temp;
		int number[]=new int[100];
		Scanner scanner=new Scanner(System.in);
		System.out.println("how many elements you want to enter:");
		counter=scanner.nextInt();
		for(i=0;i<counter;i++) {
			System.out.println("enter array element"+(i+1)+":");
			number[i]=scanner.nextInt();
			j=i-1;
			i=0;
			scanner.close();
			while(i<j) {
				temp=number[i];
				number[i]=number[j];
				number[j]=temp;
				i++;
				j--;
			}
			System.out.println("Reversed array:");
			for(i=0;i<counter;i++) {
				System.out.println(number[i]+" ");
			};
		}
	}

}
