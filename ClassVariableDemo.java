package Day11;

public class ClassVariableDemo {

	public static void main(String[] args) {
		
		House.masjidname="quba masjid...";
		System.out.println(House.masjidname);
		House rasheedaHouse=new House();
		rasheedaHouse.housename="this is rasheeda ammas house...";
		//rasheedaHouse.masjidname="quba masjid";
		
		House aaminaHouse=new House();
		aaminaHouse.housename="this is aamina ammas house...";
		//aaminaHouse.masjidname="quba masjid";
		
		System.out.println(rasheedaHouse.housename+":"+rasheedaHouse.masjidname);
		System.out.println(aaminaHouse.housename+":"+aaminaHouse.masjidname);
		
		House rajiHouse=new House();
		System.out.println(rajiHouse.masjidname);
		
	}
} 
class House{
	String housename;//instance variable
      static String masjidname;

	}


