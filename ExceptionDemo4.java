package mod1_2.day5;

public class ExceptionDemo4 {

	public static void main(String[] args)throws Exception {
		RockySapant heroine=new RockySapant();
		heroine.buyDress();
	}
}
class RockySapant{
	public void buyDress()throws Exception {
		ShoppingMall damal=new ShoppingMall();
		//try {
			damal.dressChange();
		//}catch(Exception e) {
		//	System.out.println("dont worry I will take care.....");
		//}
	}
}
class ShoppingMall{
	boolean lock=true;
	public void dressChange()throws Exception {
		if(true) {
			//try {
				throw new Exception();
			//}catch(Exception e) {
				//System.out.println("exception occured...:"+e);
			//}
		}
	}














	}


