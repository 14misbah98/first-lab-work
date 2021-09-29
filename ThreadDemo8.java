package com.day14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ThreadDemo8 {

	public static void main(String[] args) {
		Gun bofors=new Gun();
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.execute(new War(bofors,"ram"));//this will execute the thread with a job		
		es.execute(new War(bofors,"rahim"));
		es.shutdown();
	}

}
class War implements Runnable{
	Gun gun;String name;
	public War(Gun gun,String name) {
		this.gun=gun;
		this.name=name;
	}
	@Override
	public void run() {
		Thread.currentThread().setName(name);
		if (name.equals("ram")) {
			for(int i=0;i<5;i++) {
				gun.fill();
			}
		}
		else {
			for(int i=0;i<5;i++) {
				gun.shoot();
			}
		}
	}
}
class Gun{
	boolean flag;
	synchronized public void fill() {
		if(flag) {
			try {
				wait();}
			catch(Exception e) {}
			
		}
		
			System.out.println("fill the gun....");
			flag=true;
		    notify();
	}
	synchronized public void shoot() {
		if(!flag) {
			try {
				wait();}
			catch(Exception e) {}
			
		}
		
		
			System.out.println("shoot the gun...");
			flag=false;
			notify();
		}
	}
