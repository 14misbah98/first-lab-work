
public class ArrayDemo3 {

	public static void main(String[] args) {
	
			//single dimensional array declaration and initialization
			int a[]= {10,20,30};//1 row  3 columns
			
			for(int i=0;i<a.length;i++){
				System.out.println(a[i]);
			}
			//jdk 5 for loop
			System.out.println("new for loop....");
			for(int i:a) {
				System.out.println(i);
			}
			//double/two dimensional array declaration and initialization
			int [][]aa={// 3 rows and 4 columns
					{10,20,30,40},
					{100,200,300,400},
					{1000,2000,3000,4000}
			};
			
			//single dimensional array declaration only
			int []aaa=new int[3];
			//to initialize
			aaa[0]=10;//array index always starts with zero
			aaa[1]=20;
			aaa[2]=30;
			//aaa[3]=40;//this statement will throw ArrayIndexOutOfBound error.
			
			//two dimensional array declaration only
			
			int aaaa[][]=new int[3][4];//3 rows and 4 columns
			aaaa[0][0]=10;
			aaaa[0][1]=20;
			aaaa[2][2]=40;
			//how to read the array
			
			System.out.println(aaaa[2][2]);
			System.out.println("Reading a two dimensional array...");
			for(int i=0;i<aaaa.length;i++) {
				for(int j=0;j<aaaa[i].length;j++) {
					System.out.print(aaaa[i][j]+"\t");
				}
				System.out.println();
			}
			
			//jdk 5 for loop
			System.out.println("new for loop in jdk 5");
			for(int i[]:aaaa) {
				for(int j:i) {
					System.out.print(j+"\t");
				}
				System.out.println();
			}
			
		}








	}


