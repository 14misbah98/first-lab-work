package com.day13;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ThreadDemo2 {

	public static void main(String[] args) {
	Biryani biryani=new Biryani();
	biryani.makeBiryani();

     
	}

}
class Biryani{
	public void makeBiryani() {
		ExecutorService es=Executors.newFixedThreadPool(3);
		es.execute(new CutOnionJob());
		es.execute(new CutVegJob());
		es.execute(new BoilRice());
		es.shutdown();
	}
}

class CutOnionJob implements Runnable{
	@Override
	public void run() {
		System.out.println("Onion cutting job started..");
		try {
			Thread.sleep(5000);
		}catch(Exception e){
			
		}
		System.out.println("onion cutting job ends...");
	}
}


class CutVegJob implements Runnable{
	@Override
	public void run() {
		System.out.println("veg cutting job started..");
		try {
			Thread.sleep(5000);
		}catch(Exception e){
			
		}
		System.out.println("Veg cutting job ends...");
	}
}
class BoilRice implements Runnable{
	@Override
	public void run() {
		System.out.println("boil rice job started..");
		try {
			Thread.sleep(5000);
		}catch(Exception e){
			
		}
		System.out.println("boil rice job ends...");
	}
}