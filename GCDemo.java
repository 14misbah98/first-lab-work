package com.day9;

public class GCDemo {

	public static void main(String[] args) {
		Runtime r=Runtime.getRuntime();
		System.out.println("Free memory..before tatha.."+r.freeMemory());
		GrandFather Tatha=new GrandFather();
		System.out.println("Free memory..after tatha.."+r.freeMemory());
		System.out.println("lives for some time.....");
		Tatha=null;
		System.out.println(Tatha);
		System.out.println("Free Memory..after death of tatha.."+r.freeMemory());
		System.out.println("we do kriyakaram....or ..kariyam..to eliminate the body");
		r.gc();
		System.out.println("after kriyam or kriyakaram.."+r.freeMemory());
	}

}
class GrandFather{
	final private String gold="under the banyan tree...";
	String life;
	public GrandFather() {
		for(int i=0;i<10000;i++) {
			life=new String("lessons of life...."+i);
			
	}
}
	@Override
	protected void finalize() throws 
	Throwable{
		System.out.println("Now that iam no more..please find the gold...."+gold);
	}
	}