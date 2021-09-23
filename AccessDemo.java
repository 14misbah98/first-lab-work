package hitday20;

public class AccessDemo {
	private int pri;
	int nomod;
	protected int pro;
	public int pub;
	
	public void met() {
		System.out.println(pri);
		System.out.println(nomod);
		System.out.println(pro);
		System.out.println(pub);
	}
}
class AccessDemoSubClassSamePackage extends AccessDemo{
	public void met() {
		//System.out.println(pri);
		System.out.println(nomod);
		System.out.println(pro);
		System.out.println(pub);
	}
}
class AccessDemoNonSubClassSamePackage {
	public void met() {
		AccessDemo obj=new AccessDemo();
		//System.out.println(obj.pri);
		System.out.println(obj.nomod);
		System.out.println(obj.pro);
		System.out.println(obj.pub);
}
}