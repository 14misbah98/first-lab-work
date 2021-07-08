package curie;

public class variable {
public static void main(String[] args) {
		
	 
		byte b=10;
		byte c=2;
		
		//automatic type promotion..
		
		byte d=(byte)(b*c);
		//or
		int i=b*c;
		
		System.out.println("byte value...:"+d);
		System.out.println("int value....:"+i);
		
		int myInt=257;
		
		byte myBite=(byte)myInt;
		
		//when u cast a higher type in a lower type, the data is choped off which means the data will loose its precision.
		//it will divide the number by 256, and it assign the reminder of the division.
		
		System.out.println(myBite);
		
		float f=100.23f;
		
		int ii=(int)f;
		
		System.out.println(ii);
		
		char ch='a';
		
		System.out.println(ch);
		
		System.out.println((int)169);
		
}

}
