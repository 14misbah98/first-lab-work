package labwork;

public class CAST {

	public static void main(String[] args) {
	byte b=10;
	int i=b;//will accept automatic type promotion
	
	byte c=i;//will not accept because lower type cannot be put in higher
	byte d=(byte)i;//type casting make it possible to store compatible types
	byte x=10;
	byte y=20;
	byte sum=x*y;//error is thrown because when two bytes are used in arithmetic operation, the result will be integer
		

	
	}
}
