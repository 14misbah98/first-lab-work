package com.day10;

public class PrototypeDemo {

	public static void main(String[] args) throws Exception {
       Sheep mothersheep=new Sheep();
       mothersheep.name="iam mother sheep";
       Sheep dolly=new Sheep();
       dolly.name="iam dolly..";
       System.out.println(mothersheep.name);
       System.out.println(dolly.name);
       
       Sheep msheep=new Sheep();
       msheep.name="iam MMMMM sheep";
       Sheep dsheep=msheep;
       dsheep.name="iam  ddddd sheep";
       
       System.out.println(msheep.name);
       System.out.println(dsheep.name);
        
       Sheep firstSheep=new Sheep();
       Sheep firstClone=firstSheep.getClone();
        firstSheep.name="iam the first one";
        firstClone.name="iam the clone made out of the first sheep";
        
        System.out.println(firstSheep.name);
        System.out.println(firstClone.name);

	}

}
class Sheep implements Cloneable{
	String name;
	public Sheep() {
		System.out.println("sheep cons called");
	}
	public Sheep getClone() throws Exception{
		return(Sheep)super.clone();
	}
}