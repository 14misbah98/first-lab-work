package com.day12.exception;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
public class ThreadDemo {

	public static void main(String[] args)throws Exception {
		Thread t=Thread.currentThread();//it captures the current thread and returns
		t.setName("my main thread...");
		t.setPriority(10);
		System.out.println(t);
		
		System.out.println("first job.cofee..");
		ExecutorService es=Executors.newFixedThreadPool(3);//this creates one thread...
		
		Future<String> future= es.submit(new ThreadChildQuizJob());		
		System.out.println(future.get());
				
		es.execute(new ThreadIdlyJob());//this will execute the thread with a job		
		es.execute(new ThreadSambarJob());
		es.shutdown();
	}	
}
class ThreadIdlyJob implements Runnable{
	@Override
	public void run() {
		System.out.println("second job..idly..started");
		try {Thread.sleep(10000);}catch(Exception e) {}
		System.out.println("second job ..idly. completed");		
	}
}
class ThreadSambarJob implements Runnable{
	@Override
	public void run() {
		System.out.println("third job..sambar..started");
		try {Thread.sleep(5000);}catch(Exception e) {}
		System.out.println("third job ..sambar. completed");		
	}
}
class ThreadChildQuizJob implements Callable<String>{
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return "The answer is.................- given by the child....";
	}
}

	
	
	
	
	
	
	
	
