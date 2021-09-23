
public class GeneralizationDemo2 {

	public static void main(String[] args) {
		Hall sHall=new Hall();//specific hall - not reusable for other parties
		sHall.party=new BirthDayParty();
		
		
		GeneralHall gHall=new GeneralHall();//general hall - reusable for all parties
		gHall.party=new BirthDayParty();
		gHall.party=new EngagementParty();
	}
}
class Hall{
	BirthDayParty party;
}
class GeneralHall{
	Party party;
}
class Party{
	
}
class BirthDayParty extends Party{}
class EngagementParty extends Party{}


	

