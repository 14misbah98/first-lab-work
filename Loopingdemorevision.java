
public class Loopingdemorevision {
	public static void main(String[] args) {
		int i=0;
		
		while(i>0) {
			if(i%2==0) {
				System.out.println("While..- Even Number...:"+i);
			}
			i--;
		}
		
		i=4;
		do {
			if(i%2==0) {
				System.out.println("Do while...- even number..:"+i);
			}
			i--;
		}while(i>0);
		
		for(int n=10;n>0;n--) {
			if(n%2==0) {
				System.out.println("even.....................................:"+n);
			}
		}
	}

}
