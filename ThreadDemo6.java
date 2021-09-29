package com.day13;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ThreadDemo6 {
	public static void main(String[] args) {
		Hall hall1=new Hall();
		Hall hall2=new Hall();
		
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.execute(new TrainingJob(hall1,"ramu"));
		es.execute(new TrainingJob(hall2,"somu"));
		
		es.shutdown();
	}
}
class TrainingJob implements Runnable{
	Hall hall;String name;
	public TrainingJob(Hall hall,String name) {
		this.hall=hall;
		this.name=name;
	}
	@Override
	public void run() {
		Thread.currentThread().setName(name);
		synchronized(Hall.class) {//class lock, one lock for all the objects of this class
			hall.toilet.usingToilet();
		}
		
	}
}
class Hall{
	static Toilet toilet=new Toilet();
}
class Toilet{
	public Toilet() {
		System.out.println("toilet object created...");
	}
	public void usingToilet() {
		Thread t=Thread.currentThread();
		System.out.println(t.getName()+" using toilet......");
		try {Thread.sleep(5000);}catch(Exception e) {}
		System.out.println(t.getName()+" came out of toilet....");
	}
}


