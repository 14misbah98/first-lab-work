
public class ImplicitExplicitcasting {

	public static void main(String[] args) {
		int i=100;
		//automatic or implicit type conversion
		long l=i;
		//automatic type conversion
		float f=l;
		System.out.println("int value"+i);
		System.out.println("long value"+l);
		System.out.println("float value"+f);
		double d=100.04;
		//explicit type casting
	long l1=(long)d;
	//explicit type casting
	int i1=(int)l1;
	System.out.println("Double value"+d);
	//fractional part lost
	System.out.println("int value"+i1);
	byte b=42;
			char c='a';
			short s=1024;
			int ii=50000;
			float ff=5.67f;
			double dd=0.1234;
			//the Expression
			double result=(f*b)+(i/c)-(d*s);
			//RESULT AFTER ALL PROMOTIONS DONE
			System.out.println("result="+result);
	}

}
