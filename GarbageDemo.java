package hitday20;

public class GarbageDemo {

	public static void main(String[] args) {
		GrandFather daddu=new GrandFather();
		System.out.println(daddu.getGold());
		//after few years
		//there is no mechanism in java to kill an object
		met(daddu);
		daddu=null;
			
		System.gc();
		System.out.println(daddu.getGold());
	}
	static void met(GrandFather gf) {
		
	}
}
class GrandFather {
	private String gold;
	protected String getGold() {
		return "The gold is under the treee.............go take it";
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize called...");
		System.out.println("The gold is under the tree,,,, my will is to bury it with me....");
	}

	}


