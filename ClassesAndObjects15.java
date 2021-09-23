package com.day7;

public class ClassesAndObjects15 {

	public static void main(String[] args) {
		//BadFan shaitan=new BadFan();
				GoodFan khaitan=new GoodFan();
				for(int i=0;i<10;i++) {
					khaitan.pull();
				}
			}
		}
		//this code is open for modification - so bad code
		class BadFan{
			int state=0;
			public void pull() {
				if(state==0) {
					System.out.println("switch on state....");
					state=1;;
				}
				else if(state==1) {
					System.out.println("medium speed state...");
					state=2;
				}
				else if(state==2) {
					System.out.println("high speed state...");
					state=3;
				}
				else {
					System.out.println("switch off state...");
					state=0;
				}
			}
		}
		//this code is closed for modification but open for extension
		class GoodFan{
			State state=new SwitchOffState();
			public void pull() {
				state.pull(this);
			}
		}
		abstract class State{
			public abstract void pull(GoodFan fan);//it is mandatory now for all the child classes to
			//compulsorily override the abstract method
		}
		class SwitchOffState extends State{
			public void pull(GoodFan fan) {
				System.out.println("Switch on state.....");
				fan.state=new SwitchOnState();
			}
		}
		class SwitchOnState extends State{
			public void pull(GoodFan fan) {
				System.out.println("Medium speed state....");
				fan.state=new MediumSpeedState();
			}
		}
		class MediumSpeedState extends State{
			@Override
			public void pull(GoodFan fan) {
				System.out.println("high speed state....");
				fan.state=new HighSpeedState();
			}
		}
		class HighSpeedState extends State{
			@Override
			public void pull(GoodFan fan) {
				System.out.println("switch off state...");
				fan.state=new SwitchOffState();
			}
		}
		