package mod1_2.day7;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ThreadDemo8 {
	public static void main(String[] args) {
		CounsellingHall hall=new CounsellingHall();
		ExecutorService es=Executors.newFixedThreadPool(3);
		es.execute(new AdmissionJob("fayaz",hall));
		es.execute(new AdmissionJob("ramu",hall));
		es.execute(new AdmissionJob("mary",hall));
		es.shutdown();
	}
}
class AdmissionJob implements Runnable{
	String name;
	CounsellingHall hall;
	
	public AdmissionJob(String name,CounsellingHall hall) {
		this.name=name;this.hall=hall;
	}
	@Override
	public void run() {
		Thread.currentThread().setName(name);
		//synchronized(hall) {
		if(name.equals("mary")) {
			hall.water();
			hall.checkCredentials();
			hall.doAdmission();
			hall.makePayment();
		}
		else {
			hall.checkCredentials();
			hall.doAdmission();
			hall.makePayment();
		}
		//}
	}
}
class CounsellingHall{
	synchronized public void checkCredentials() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println("checking credentials...:"+name);
	}
	synchronized public void doAdmission() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println("taking admission in college.....:"+name);
	}
	synchronized public void makePayment() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println("Making payment...:"+name);
		try {Thread.sleep(5000);}catch(Exception e) {}
		System.out.println("Admission process over..."+name);
	}
	
	public void water() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println("Drinking water...:"+name);
	}
}
