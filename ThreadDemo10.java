package com.day14;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ThreadDemo10 {

	public static void main(String[] args) {
ExecutorService es=Executors.newFixedThreadPool(3);
		
		es.execute(new OfficeJob("ram"));
		es.execute(new OfficeJob("rahim"));
		es.execute(new OfficeJob("john"));
		
		es.shutdown();
	}
}
class OfficeJob implements Runnable{
	String name;
	public OfficeJob(String name) {
		this.name=name;
	}
	@Override
	public void run() {
		Thread.currentThread().setName(name);
		if(name.equals("ram")) {
			Laptop laptop=Office.getLapTop(name);
			System.out.println(laptop.getLaptopName()+":"+laptop);
			Office.closeLapTop();
			try {Thread.sleep(5000);}catch(Exception e) {}
			laptop=Office.getLapTop(name);
			System.out.println(laptop.getLaptopName()+":"+laptop);
		}
		else {
		Laptop laptop=Office.getLapTop(name);
		System.out.println(laptop.getLaptopName()+":"+laptop);
		laptop=Office.getLapTop(name);
		System.out.println(laptop.getLaptopName()+":"+laptop);
		}
	}
}
class Office{
	private Office() {
		// TODO Auto-generated constructor stub
	}
	private static ThreadLocal locker=new ThreadLocal();
	public static Laptop getLapTop(String name) {
		Laptop laptop=(Laptop)locker.get();
		if(laptop==null) {
			laptop=new Laptop(name);
			Office.locker.set(laptop);
			return laptop;
		}
		else {
			return laptop;
		}
	}
	public static void closeLapTop() {
		Office.locker.remove();
	}

}
class Laptop{
	String name;
	public Laptop(String name) {
		this.name=name;
		System.out.println("laptop object created..."+name);
	}
	public String getLaptopName() {
		return name;
	}
}
