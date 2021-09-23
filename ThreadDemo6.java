package mod1_2.day4;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo6 {
		public ThreadDemo6() {
			//Thread t=new Thread(new MyJob3());
			//t.start();
			ExecutorService es=Executors.newFixedThreadPool(1);
			es.execute(new MyJob3());
			es.shutdown();
		}
		public static void main(String[] args) {
			new ThreadDemo6();
			for(int i=0;i<5;i++) {
				System.out.println(i);
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
		}
	}
	class MyJob3 implements Runnable{
		@Override
		public void run() {
			System.out.println("child thread called...");
		}
	
	

}
