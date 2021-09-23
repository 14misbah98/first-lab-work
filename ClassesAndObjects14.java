package com.day7;

public class ClassesAndObjects14 {

	public static void main(String[] args) {
		Kalimark.CampaCola cola=new Kalimark().new CampaCola();
		Pepsi pepsiCo=new Pepsi();
		Kalimark kali=new Kalimark();
		pepsiCo.makeCola(cola);
		kali.makeCola(cola);
		Kalimark.MyStaticClass mysc=new Kalimark.MyStaticClass();
		mysc.StatMet();
	}

}
class  Pepsi{
	public void makeCola(Kalimark.CampaCola campa) {
		campa.makeCola();
		System.out.println("pepsi fills campa cola in pepsi bottle and sells as pepsi");
   }
}
 class Kalimark{
	 int funds=1011111001;
	 public void canteen() {}
	 public void makeCola(CampaCola campa) {
		 class  MyLocal{
			 public void localMet() {
				 System.out.println("local inner class method called..");
			 }
		 }
		 
		 campa.makeCola();
		 System.out.println("kalimarks fills campa cola in bovonto bottle and sells as color ");
		 MyLocal obj=new MyLocal();
		 obj.localMet();
	 }
	class CampaCola{
		public void makeCola() {
			canteen();
			System.out.println(funds);
			System.out.println("cola made by campa cola.......");
			
		}
	}
	static int money=3434344;
	public static void met() {}
	static class MyStaticClass{
	public void StatMet() {
	System.out.println(money);
	met();
	}
 }
 }