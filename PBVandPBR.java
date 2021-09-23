package com.day6;

public class PBVandPBR {
	public static void main(String[] args) {
		Laddu laddu=new Laddu();
		
		System.out.println("Size of Laddu...:"+laddu.size);
		
		PBV pbv=new PBV();
		pbv.accept(laddu.size);
		
		System.out.println("Size of Laddu after PBV...:"+laddu.size);
		
		PBR pbr=new PBR();
		pbr.accept(laddu);
		
		System.out.println("size of laddu after PBR...:"+laddu.size);
	}
}
class PBV{
	public void accept(int size) {
		size=size+10;
	}
}
class PBR{
	public void accept(Laddu laddu) {
		laddu.size=laddu.size-5;
	}
}
class Laddu{
	int size=10;
}





