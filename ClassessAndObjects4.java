package mod1_2.day7;

public class ClassessAndObjects4 {

	public static void main(String[] args) {
		Fan khaitan=new Fan();
		for(int i=0;i<15;i++)
		{
			khaitan.pull();
		}
	}
}
//kindly do the same with switch case
class Fan{
	int state=0;
	public void pull() {
		if(state==0) {
			System.out.println("switch on state...");
			state=1;
		}
		else if(state==1) {
			System.out.println("Medium speed state....");
			state=2;
		}
		else if(state==2) {
			System.out.println("High Speed state....");
			state=3;
		}
		else {
			System.out.println("switch off state....");
			state=0;
		}
	}


	
	
}


