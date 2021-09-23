package hitday18;

public class Generalizationdemo {

	public static void main(String[] args) {
		MasalaDibba roundDibba=new MasalaDibba();
		roundDibba.item=new Zeera();
		
		
		GenericMasalaDibba genericRoundDibba=new GenericMasalaDibba();
		genericRoundDibba.item=new Methi();
		genericRoundDibba.item=new Zeera();
		
		Barthan barthan=new Barthan();
		barthan.item=new Rice();
		barthan.item=new Zeera();
		acceptZeera(new Zeera());
		acceptMasala(new Zeera());
		acceptMasala(new Methi());
	}
	public static void acceptZeera(Zeera zeera) {
		
	}
	public static void acceptMasala(Masala masala) {//sub class can replace the parent
		
	}
	}

class FoodItem {}
class Rice extends FoodItem{}
class RiceDibba{
	Rice r;
}
class Barthan{
	FoodItem item;
}
class MasalaDibba{
	Zeera item;
}
class GenericMasalaDibba{
	Masala item;
}
class Masala extends FoodItem{
	
}
class Zeera extends Masala{}
class Methi extends Masala{}
class LalMirch extends Masala{}
	


