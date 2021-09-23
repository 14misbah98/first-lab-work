
public class Conditions3 {

	public static void main(String[] args) {
int age=20;
		
		if(age<10) {
			System.out.println("you are a child.....");
		}		
		if(age<19) {
			System.out.println("you are in your teens");
		}
		
		if(age<10) {
			System.out.println("you are a child.............................................");
		}
		else if(age<19){
			System.out.println("you are in your teens.........................................");
		}
		else {
			System.out.println("you are an adult...");
		}
	
		char a='a';
		if(a=='a') {
			System.out.println("you selected a");
		}
		else if(a=='b') {
			System.out.println("you selected b");
		}
		else {
			System.out.println("you selected neither a nor b");
		}
		
		String s="Allah";
		if(s.equalsIgnoreCase("Allah")){
			System.out.println("You selected Allah");
		}
		else if(s.equalsIgnoreCase("Jesus")) {
			System.out.println("you selected Jesus");
		}
		else {
			System.out.println("You neither selected Allah nor Jesus...");
		}
}
}