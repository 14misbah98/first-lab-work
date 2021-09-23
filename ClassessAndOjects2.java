package mod1_2.day7;

public class ClassessAndOjects2 {
	public static void main(String[] args) {
		OddEven obj=new OddEven();
		obj.checkNumber(11);
		
		String result=obj.checkNumber2(12);
		System.out.println("Result..:"+result);
	}
}
class OddEven{
	//Methods can also have parameters.. one or many
	//void method are those methods who does not have a return
	//in a void method, u will just write logic but in returnable method, u will write logic as well as
	//u will return some thing
	public void checkNumber(int i) {
		if(i%2==0) {
			System.out.println("Even Number....");
		}
		else {
			System.out.println("Odd Number....");
		}
	}
	//returnable methods return one value.
	//they can have multiple return statement, but at the end only one should return
	public String checkNumber2(int i) {
		if(i%2==0) {
			return "Even Number...";
		}
		else {
			return "Odd Number....";
		}
	}
}


