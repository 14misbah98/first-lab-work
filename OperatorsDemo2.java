
public class OperatorsDemo2 {

	public static void main(String[] args) {
		/*
		 * Arithmetic operator
		 * relational operator
		 * logical operator
		 */
		
		int i=11;
		int j=2;
		System.out.println("Addition..:"+(i+j));
		System.out.println("Substraction..:"+(i-j));
		System.out.println("Multiplication..:"+(i*j));
		System.out.println("Division.**quotient**.:"+(i/j));
		System.out.println("Division-Mod..**reminder**..:"+(i%j));
		
		int x=10;
		//x=x+1;
		System.out.println(x++);//this will print x first and then increment
		System.out.println(x);
		
		x=10;
		System.out.println(++x);//increment first and then prints
		System.out.println(x);
		
		x=10;
		System.out.println(x--);//this will print x first and then decrement
		System.out.println(x);
		
		x=10;
		System.out.println(--x);//decrement first and the print
		System.out.println(x);
		
		//x=x+5;
		x=10;
		//x=x+4;
		x+=4;
		System.out.println(x);
		
		x=10;
		//x=x*4;
		x*=4;
		System.out.println(x);
		
		x=10;
		//x=x-4;
		x-=4;
		System.out.println(x);
		
		x=10;
		//x=x/2;
		x/=2;
		System.out.println(x);
		
		x=11;
		//x=x%4;
		x%=4;
		System.out.println(x);
		
		//RELATIONAL OPERATORS
		
		int ii=10;
		int jj=20;
		
		System.out.println(ii==jj);
		System.out.println(ii!=jj);//negate of equals
		System.out.println(ii<jj);
		System.out.println(ii>jj);
		System.out.println(ii<=jj);
		System.out.println(ii>=jj);
		
		//LOGICAL OPERATORS && || !
		System.out.println(ii<jj && ii==100);
		
		System.out.println(ii>jj || ii==100);//even if one expression returns true, the return value will be true	
	}
	}


