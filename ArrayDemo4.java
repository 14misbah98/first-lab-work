
public class ArrayDemo4 {

	public static void main(String[] args) {
		int [][]arr= {
				{10,20,30,40},
				{100,200,300,400},
				{1000,2000,3000,4000}
		};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("................................................");
		//new jdk5 loop
		for(int i[]:arr) {
			for(int j:i) {
				System.out.print(j+"\t");
			}
			System.out.println();
		}
		System.out.println("Un even multi dimensional array...............");
		System.out.println("....................................");
		int arr2[][]=new int[5][];
		arr2[0]=new int[2];
		arr2[1]=new int[4];
		arr2[2]=new int[3];
		arr2[3]=new int[3];
		arr2[4]=new int[4];
		for(int i[]:arr2) {
			for(int j:i) {
				System.out.print(j+"\t");
			}
			System.out.println();
		}
	
}



	}


