package com.day13;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//Scenario
/*
 * Two threads, one object, two tasks
 */
public class ThreadDemo5 {
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		ReservationCounter central=new ReservationCounter();
				
		es.execute(new ReservationJob(central,"ram",1000));
		es.execute(new ReservationJob(central,"rahim",500));
		
		es.shutdown();
	}
}	
class ReservationJob implements Runnable{
	ReservationCounter counter;String name;int amt;
	public ReservationJob(ReservationCounter counter,String name,int amt) {
		this.counter=counter;
		this.name=name;
		this.amt=amt;
	}
	@Override
	public void run() {
		Thread.currentThread().setName(name);
		counter.bookTicket(amt);
		counter.giveChange();
	}
}
class ReservationCounter{
	int amt;
	public void bookTicket(int amt) {
		this.amt=amt;
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println("Ticket booked by...:"+name);
		System.out.println("Amount carried by...:"+name+" and amount is..:"+amt);
	}
	public void giveChange() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println("Changed given to...:"+name);
		System.out.println("Change carried by...:"+name+" and amount is..:"+(amt-100));
	}
}