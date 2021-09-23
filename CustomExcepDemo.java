package mod1_2.day5;

public class CustomExcepDemo {

	public static void main(String[] args) {
		ATM bobATM=new ATM();
		try {
			bobATM.withDrawMoney(2000);
		}catch(MaxWithDrawLimitException e) {
			//1. Catch the exception
			//2. Print
			//3. Action
			System.out.println(e);
			System.out.println("Let me now give a lesser value...");
		}
		catch(NoFundsException ne) {
			System.out.println(ne);
			System.out.println("my balance needs to topedup");
		}
		catch(Exception ee) {
			System.out.println(ee);
			System.out.println("unknown exception");
		}
	}
}
class ATM{
	public void withDrawMoney(int amt)throws Exception {
		int available=1000;
		if(amt>=2000) {
			throw new MaxWithDrawLimitException("The limit should not exceed beyond 2000");
		};
		
		if(available <=amt) {
			throw new NoFundsException();
		}
	}
}
class MaxWithDrawLimitException extends Exception{
	String msg;
	public MaxWithDrawLimitException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return "Exception...: "+this.getClass().getName()+"..."+this.msg;
	}
}

class NoFundsException extends Exception{
	


	}


