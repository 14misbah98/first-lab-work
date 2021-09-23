package mod1_2.day4;

public class ThreadDemo2 {

	public static void main(String[] args) {
		Thread onionCutter=new Thread(new OnionCutterJob());
		Thread vegCutter=new Thread(new VegetableCutterJob());
		Thread riceBoiler=new Thread(new RiceBoilingJob());
		
		onionCutter.start();
		vegCutter.start();
		riceBoiler.start();
		
//		new OnionCutterJob().onionCutting();
//		new VegetableCutterJob().vegCutting();
//		new RiceBoilingJob().boilRice();
	}
}
class OnionCutterJob implements Runnable{
	@Override
	public void run() {
		onionCutting();
	}
	public void onionCutting() {
		System.out.println("cutting onions started....");
		try {Thread.sleep(10000);}catch(Exception e) {}
		System.out.println("cutting onions end...");
	}
}
class VegetableCutterJob implements Runnable{
	@Override
	public void run() {
		vegCutting();
	}
	public void vegCutting() {
		System.out.println("Vegetable cutting started....");
		try {Thread.sleep(5000);}catch(Exception e) {}
		System.out.println("cutting vegetable end...");
	}
}
class RiceBoilingJob implements Runnable{
	@Override
	public void run() {
		boilRice();
	}
	public void boilRice() {
		System.out.println("Rice Boiling started....");
		try {Thread.sleep(10000);}catch(Exception e) {}
		System.out.println("Rice Boining end...");
	}

}
