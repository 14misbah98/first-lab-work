package mod1_2.day7;

public class ClassessAndObjects3 {

	public static void main(String[] args) {
		Car tata=new Car();
		System.out.println("Gear...:"+tata.getGear());
		tata.changeGear();
		tata.changeGear();
		tata.changeGear();
		tata.changeGear();
		System.out.println("Gear...:"+tata.getGear());
	}
}
class Car{
	int gear=0;//instance variable
	public void changeGear() {
		if(gear==0) {
			gear=1;
		}
		else if(gear==1) {
			gear=2;
		}
		else if(gear==2) {
			gear=3;
		}
		else {
			gear=0;
		}
	}
	
	public int getGear() {
		return gear;
	}
}