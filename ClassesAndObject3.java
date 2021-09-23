package mod1_2.day7;

public class ClassesAndObject3 {
	public static void main(String[] args) {
		//BadBrush shaitanBrush=new BadBrush();
		//shaitanBrush.doPaint(2);
		
		GoodBrush hazrathBrush=new GoodBrush();
		hazrathBrush.setPaint(new RedPaint());
		hazrathBrush.doPaint();
	}
}
class BadBrush{
	public void doPaint(int i) {
		if(i==1) {
			System.out.println("Red colour.....");
		}
		else if(i==2) {
			System.out.println("blue colour...");
		}
		else if(i==3) {
			System.out.println("green colour....");
		}
		else {
			System.out.println("white colour...");
		}
	}
}
abstract class Paint{
	
}
class RedPaint extends Paint{
	@Override
	public String toString() {
		return "red colour..................";
	}
}
class BluePaint extends Paint{
	@Override
	public String toString() {
		return "Blue colour..................";
	}
}
class GreenPaint extends Paint{
	@Override
	public String toString() {
		return "Green colour..................";
	}
}
class GoodBrush{
	private Paint paint;
	public void setPaint(Paint paint) {
		this.paint=paint;
	}
	public void doPaint() {
		System.out.println(paint);
	}
}

