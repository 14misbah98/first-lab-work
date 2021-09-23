package mod1_2.day1;

public class ExceptionDemo {

	public static void main(String[] args) {
		System.out.println("Life Before an exception....");
		try {
			int i=1/Integer.parseInt(args[0]);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
			System.out.println("you cannot divide a number by zero...use some other number...");
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			ae.printStackTrace();
			System.out.println("please enter a value in command line...");
		}
		catch(NumberFormatException ne) {
			ne.printStackTrace();
			System.out.println("please enter a valid number, characters are not allowed....");
		}
		finally {
			System.out.println("finally block called...");
		}
		System.out.println("Life after an exception....");
	}
}

