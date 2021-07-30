
public class Primenumber {

	public static void main(String[] args) {
		//number to be checked
		int  num=11;
		boolean flag=false;
		//run the loop from 2 to num/2
		for(int i=2;i<=num/2;++i) {
			//if number is divided by other number it is not prime
			if(num%i==0) {
				flag=true;
				break;
			}
		}
		if(!flag) {
			System.out.println(num+"is a prime number.");
		}
		else {
			System.out.println(num+"is not a prime number.");
		}
	}

}
