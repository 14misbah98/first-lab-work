package mod1_2.day7;


	import java.util.concurrent.ExecutorService;
	import java.util.concurrent.Executors;
	public class ThreadDemo7 {
		public static void main(String[] args) {
			ExecutorService es=Executors.newFixedThreadPool(2);
			ReservationCounter central=new ReservationCounter();
			es.execute(new BookingJob(central,"aysha",1000));
			es.execute(new BookingJob(central,"amina",500));
			es.shutdown();
		}
	}
	class BookingJob implements Runnable{
		ReservationCounter counter;String name;int amt;
		public BookingJob(ReservationCounter counter,String name,int amt) {
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
			System.out.println("Ticket Booked By...:"+name+" and the amount is..:"+amt);
		}
		
		public void giveChange() {
			Thread t=Thread.currentThread();
			String name=t.getName();
			System.out.println("Change given to...:"+name+" and the amount is..:"+(amt-100));
		}
	}

