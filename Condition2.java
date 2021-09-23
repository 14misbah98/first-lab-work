
public class Condition2 {
	public static void main(String[] args) {
		//ternary operator - ?
		//syntax - (expression)?"true value":"false value"
		
		String s=(10<20)?"10 is lesser than 20":"10 is not lesser than 20";
		System.out.println(s);
		System.out.println((10<20)?"10 is lesser than 20":"10 is not lesser than 20");
		
		System.out.println((11%2==0)?"Even Number...":"Odd Number....");
		
		//switch case
		//switch case works on values
		
		int age=10;
		char c='a';
		String name="abraham";
		//enum - which i will cover later
		switch(name) {
		case "rahim":{
			System.out.println("eid holiday.....");
			break;
		}
		case "ram":{
			System.out.println("diwali holiday.....");
			break;
		}
		case "john":{
			System.out.println("esther holiday...");
			break;
		}
		default:{
			System.out.println("no holiday....");
			break;
		}
		case "singh":{
			System.out.println("guru holiday...");
		}
		}
		
		switch(age) {
		case 10:{
			System.out.println("you are a kid...");
			break;
		}
		case 20:{
			System.out.println("you are a adult");
			break;
		}
		default:{
			System.out.println("you are overaged...");
		}
		}
		
		switch(c) {
		case 'a':{
			System.out.println("a for Allah");
			break;
		}
		case 'b':{
			System.out.println("b for bakrid");
			break;
		}
		default:{
			System.out.println("defualt....");
		}
		}
	}
}


