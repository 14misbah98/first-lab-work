
public class ArrayDemo2 {

	public static void main(String[] args) {
		
			ArrayDemo2 obj=new ArrayDemo2();
			obj.met();
		}
		//instance variables are initialized by default..
		int ins;
		int []insArr=new int[4];
		public void met() {
			//local variables are not initialized by default...
			int loc=0;//local variables are not initialized by default
			int []locArr=new int[5];//local arrays are initialized by default
			System.out.println(loc);
			System.out.println(ins);
			
			System.out.println(insArr[1]);
			System.out.println(locArr[1]);
		}
	}

	


