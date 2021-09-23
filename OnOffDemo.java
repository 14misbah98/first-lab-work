package hitday19;
import malik.MoleculeFramework;
public class OnOffDemo {

	public static void main(String[] args) {
		Object button=new Switch();
		Object edison=new Bulb();
		
		Object ac=new Ac();
		//Switch acSwitch=new Switch();
		
		
		MoleculeFramework.setInterface(OnOff.class);
		button=MoleculeFramework.getObject(new Object[]{button,ac});//subjection
		
		OnOff onffButton=(OnOff)button;
		onffButton.on();
		onffButton.off();
	}
	}


