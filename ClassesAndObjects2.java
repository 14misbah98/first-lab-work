package mod1_2.day7;

public class ClassesAndObjects2 {

	public static void main(String[] args) {
		//ShaitanFan shaitan=new ShaitanFan();
		KhaitanFan khaitan=new KhaitanFan();
		for(int i=0;i<10;i++) {
			//shaitan.pull();
			khaitan.pull();
		}
	}
}
//The code is open for modification but close for extension
//Any code which uses if else if ladder in a dynamic job is  bad (shaitan) code.
class ShaitanFan{
	int state=0;
	public void pull() {
		if(state==0) {
			System.out.println("switched on state....");
			state=1;
		}
		else if(state==1) {
			System.out.println("medium speed state....");
			state=2;
		}
		else if(state==2) {
			System.out.println("high speed state....");
			state=3;
		}
		else {
			System.out.println("switch off state...");
			state=0;
		}
	}
}
//This fan code is good fan code - why ? - because there is no if-else-if ladder
class KhaitanFan{
	State state=new SwitchOffState();
	public void pull() {
		state.pull(this);
	}
}
abstract class State{
	public abstract void pull(KhaitanFan fan);
}
class SwitchOffState extends State{
	@Override
	public void pull(KhaitanFan fan) {
		System.out.println("switched on state...");
		fan.state=new SwitchOnState();
	}
}
class SwitchOnState extends State{
	@Override
	public void pull(KhaitanFan fan) {
		System.out.println("medium speed state.....");
		fan.state=new MediumSpeedState();
	}
}
class MediumSpeedState extends State{
	@Override
	public void pull(KhaitanFan fan) {
		System.out.println("High speed state.....");
		fan.state=new HighSpeedState();
	}
}
class HighSpeedState extends State{
	@Override
	public void pull(KhaitanFan fan) {
		System.out.println("Switch off state.....");
		fan.state=new SwitchOffState();
	}
}