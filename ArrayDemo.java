
public class ArrayDemo {

	public static void main(String[] args) {
		ArrayDemo obj=new ArrayDemo();
		int i=10;
		int arr[]= {10,20,30,40};
		
		//pass by value
		System.out.println("i value before met called...:"+i);
		obj.met(i);
		System.out.println("i value after met called....:"+i);
		
		//pass by reference
	    System.out.println("arr[1] value before method call..:"+arr[1]);
		obj.met(arr);
     	System.out.println("arr[1] value after method call...:"+arr[1]);
		
		//Solution for passing arrays via pass by value is System.arrayCopy....
		
		int arrDuplicate[]=new int[4];
		arrDuplicate=arr;
		//System.arraycopy(arr, 0, arrDuplicate, 0, 4);
		System.out.println("arr[2] value before method call..:"+arr[2]);
		//obj.met(arrDuplicate);
		System.out.println("arr[2] value after method call...:"+arr[2]);
		
	}
	
	void met(int i) {
		i=20;
	}
	
	//arrays are by default pass by reference, even though its of simple type
	void met(int arr[]) {
		arr[2]=200;
	}
}

