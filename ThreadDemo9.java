package com.day14;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo9 {

	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		Frog f=new Frog();
		Crane c=new Crane();
		
		es.execute(new DeathGame(c,f,"crane"));
		es.execute(new DeathGame(c,f,"frog"));
		
		es.shutdown();
	}
}
class DeathGame implements Runnable{
	Crane c;Frog f;String name;
	public DeathGame(Crane c,Frog f,String name) {
		this.c=c;
		this.f=f;
		this.name=name;
	}
	@Override
	public void run() {
		Thread.currentThread().setName(name);
		if(name.equals("crane")) {
			c.eat(f);
		}
		else {
			f.escape(c);
		}
	}
}
class Frog{
	synchronized public void escape(Crane c) {
		
		c.leaveFrog();
	}
	synchronized public void leaveCrane() {
		
	}
}
class Crane{
	synchronized public void eat(Frog f) {
		System.out.println();
		f.leaveCrane();
	}
	synchronized public void leaveFrog() {
		
	}
	
	}


