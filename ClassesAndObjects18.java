package com.day8;

public class ClassesAndObjects18 {

	public static void main(String[] args) {
		
		//IndianPlug shakthi=new ShakthiPlug();
				AmericanPlug lenovo=new LenovoPlug();
				
				IndianSocket shakthiSocket=new ShakthiSocket();
				
				IndianAdapter ia=new IndianAdapter();
				ia.setAmericanPlug(lenovo);
				
				shakthiSocket.roundPinHole(ia);
			}
		}
		class IndianAdapter extends IndianPlug{
			AmericanPlug ap;
			public void setAmericanPlug(AmericanPlug ap) {
				this.ap=ap;
			}
			@Override
			public void roundPin() {
				ap.slabPin();
			}
		}
		/*
			Adapter pattern
			- Encapsulation
			- compatibility problem we are solving
			- using inheritance to achieve encapsulation
		*/
		abstract class IndianPlug{
			public abstract void roundPin();
		}
		abstract class IndianSocket{
			public abstract void roundPinHole(IndianPlug ip);
		}
		abstract class AmericanPlug{
			public abstract void slabPin();
		}
		abstract class AmericanSocket{
			public abstract void slabPinHole(AmericanPlug ap);
		}
		class ShakthiPlug extends IndianPlug{
			@Override
			public void roundPin() {
				System.out.println("shakthi round pin plug works.....");
			}
		}
		class ShakthiSocket extends IndianSocket{
			@Override
			public void roundPinHole(IndianPlug ip) {
				ip.roundPin();
			}
		}
		class LenovoPlug extends AmericanPlug{
			@Override
			public void slabPin() {
				System.out.println("American lenovo plug works...............");
			}
		}
		class LenovoSocket extends AmericanSocket{
			@Override
			public void slabPinHole(AmericanPlug ap) {
				ap.slabPin();
			}

}
