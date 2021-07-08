package curie;

public class Arithmeticoperation2 {

	public static void main(String[] args) {
		//++ - increment operator i=i+1;
				//--  - decrement operator i=i-1
				
				System.out.println("++++++++++++++++++++++++++++++++++++");
				int i=10;
				System.out.println(i++);//post increment-first the value is printed and then incremented
				System.out.println(i);//this prints the incremented value
				
				int j=100;
				System.out.println(++j);//pre increment - first the value is incremented then printed..
				System.out.println(j);
				System.out.println("___________________________________");
				int ii=10;
				System.out.println(ii--);//post decrement-first the value is printed and then decremented
				System.out.println(ii);//this prints the incremented value
				
				int jj=100;
				System.out.println(--jj);//pre decrement - first the value is decremented then printed..
				System.out.println(jj);
				
				System.out.println("********************************");
				int x=10;
				int y=20;
				
				x+=10;// this is equivalent to x=x+10
				System.out.println(x);
				y-=10;//this is equivalent to y=y-10
				System.out.println(y);
				
				x*=10;//now x is 20 that will get changed to 200
				System.out.println(x);
				
				y/=2;//now y is 10, this will get changed to 5
				System.out.println(y);
				
				y%=2;
				System.out.println(y);//5 will be divided by 2 and the reminder is given
			}
		
	}


