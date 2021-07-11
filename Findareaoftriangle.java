import java.util.Scanner;
public class Findareaoftriangle {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the length of the rectangle");
		double length=scanner.nextDouble();
			System.out.println("enter the widht of rectangle:");
			double width=scanner.nextDouble();
			//Area=length*widht;
			double area=length*width;
			System.out.println("area of rectangle is:"+area);
		
	}

}
