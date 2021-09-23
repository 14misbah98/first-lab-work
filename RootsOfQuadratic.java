package practice;

public class RootsOfQuadratic {

	public static void main(String[] args) {
		double a=2.3, b=4, c=5.6;
		double determinant, root1,root2;
		determinant=b*b-4*a*c;
		if (determinant>=0) {
			root1=(-b+Math.sqrt(determinant))/(2*a);
			root2=(-b-Math.sqrt(determinant))/(2*a);
			System.out.format("root1=%2.f and root2 =%2.f",root1,root2);
					
		}
		else {
			double real=-b/(2*a);
			double imaginary=Math.sqrt(determinant)/(2*a);
			System.out.format("root1=%0.2f+%0.2fi", real,imaginary);
			System.out.format("/nroot2=%0.2f-%0.2fi", real, imaginary);
		}
		
	}

}
