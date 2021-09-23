package com.day4;

public class ClassesAndObjects5 {

	public static void main(String[] args) {
		TrainingRoom mercury=new TrainingRoom();
		TrainingRoom venus=new TrainingRoom();
		TrainingRoom mars=new TrainingRoom();
		
		System.out.println(mercury.sanyo);
		System.out.println(venus.sanyo);
		System.out.println(mars.sanyo);
		
		//static fields should always be called in static way that is, using classname
		System.out.println(TrainingRoom.sulabInternational);
		System.out.println(TrainingRoom.sulabInternational);
		System.out.println(TrainingRoom.sulabInternational);
	}
}
class TrainingRoom{
	Projector sanyo=new Projector();//instance variable
	static Toilet sulabInternational=new Toilet();//class variable
}
class Projector{
	
}
class Toilet{
}



	


