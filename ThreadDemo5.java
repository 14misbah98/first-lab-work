package mod1_2.day4;

public class ThreadDemo5 {

	public static void main(String[] args) {
		Thread t=new Thread(new MyJob2());
		t.start();
		try {Thread.sleep(1000);}catch(Exception e) {}
		System.out.println("main thread....");
		
	}
}
class MyJob2 implements Runnable{
	@Override
	public void run() {
		System.out.println("child thread....");
	}

	}


