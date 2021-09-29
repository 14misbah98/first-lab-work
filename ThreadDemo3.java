package com.day13;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ThreadDemo3 {
	public ThreadDemo3() {
	ExecutorService es=Executors.newFixedThreadPool(1);
	es.execute(new MyJob());
	es.shutdown();
	}
public static void main (String[]args) throws Exception{
	new ThreadDemo3();
	for(int i=0;i<5;i++) {
		System.out.println(i);
		Thread.sleep(100);
	}
}
}
class MyJob implements Runnable{
	@Override
	public void run() {
		System.out.println("child thread called...");
	}
}