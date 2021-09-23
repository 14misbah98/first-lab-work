
public class ConditionBranchingDemo2 {
	public static void main(String[] args) {
	//switch case accepts a value
			int i=50;
			char c='z';
			String s="shoiab";
			//enum
			
			switch(s) {
			case "rahim":{
				System.out.println("you are selected for haj trip");
				break;
			}
			case "ram":{
				System.out.println("you are selected for himalaya trip");
				break;
			}
			case "mahi":{
				System.out.println("you are selected for cricket");
				break;
			}
			default:{
				System.out.println("you are selected knightingale...");
				break;
			}
			case "john":{
				System.out.println("you are selected for USA..");
			}
			}
			
			switch(c) {
			case 'a':{
				System.out.println("a for Allah");
				break;
			}
			case 'b':{
				System.out.println("b for budha");
				break;
			}
			case 'c':{
				System.out.println("c for chola");
				break;
			}
			default:{
				System.out.println("default for siva");
				break;
			}
			case 'd':{
				System.out.println("d for dolly");
			}
			}
			
			switch(i) {
			case 40:{
				System.out.println("you are half age...");
				break;
			}
			case 50:{
				System.out.println("you are very young...");
				break;
			}
			case 60:{
				System.out.println("you are very very young...");
				break;
			}
			default:{
				System.out.println("you are in your prime youth....");
				break;
			}
			case 80:{
				System.out.println("you are a teen boy....");
			}
			}
		}
	}


