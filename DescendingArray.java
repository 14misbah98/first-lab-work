import java.util.Scanner;

public class DescendingArray {

	public static void main(String[] args) {
		int num ,i,j,temp;
		Scanner input=new Scanner (System.in);
		System.out.println("enter the number of integers to sort:");
		num=input.nextInt();
		int array[]=new int [num];
		System.out.println("enter"+num+"integers");
		for(i=0;i<num;i++)
			array[i]=input.nextInt();
		for(i=0;i<(num-1);i++) {
			for(j=0;j<num-i;j++) {
				if (array[j]<array[j+1])
				{
					temp=array[j];
					array[j]=array[j+1];
							array[j+1]=temp;
				}
			}
		}
		System.out.println("sorted list of integers:");
		for(i=0;i<num;i++);
		System.out.println(array[i]);
	}

}


	


