package com.day11;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		ATM atm=new ATM();
		System.out.println("before exception");
		try {
			atm.withDrawMoney(100000);
		}catch(Exception e){
			e.printStackTrace();
			System.out.println(e);
			
		}
		System.out.println("After exception...");
	}
	

}
class ATM{
	int amountIntAtm=100000;

  public void withDrawMoney(int amt)throws Exception{
		if(amountIntAtm<=amt) {
			throw new NoBalanceException("There is no cash in ATM,, please enter a smaller amount...");
		}
	}
}

class NoBalanceException extends Exception{
	String msg;
	public NoBalanceException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return "Exception is....:"+msg;
	}
}
