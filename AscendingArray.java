import java.util.Arrays;
import java.util.Scanner;
public class AscendingArray {

	public static void main(String[] args) {
		
		int []array=new int [] {5,9,8,12,1,3};
		System.out.println("elements of original array");
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]+"");
		}
		Arrays.sort(array);
		System.out.println();
		System.out.println("elements of array sorted in ascending order: "+Arrays.toString(array));
	}
	}
