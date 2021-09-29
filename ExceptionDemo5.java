package com.day11;

public class ExceptionDemo5 {

	public static void main(String[] args) {
		
	}

}
abstract class DogException extends Exception{
	
	
}
class DogBiteException extends  DogException{
	String msg;
	public DogBiteException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
       return"Exception is..."+msg;
}
}
class DogBarkException extends DogException{
	String msg;
	public DogBarkException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return "Exception is"+this.msg;
	}
}
abstract class Item{
	public abstract void execute()throws DogException;
	}
class StoneItem extends Item{
	@Override
    public void execute()throws DogException{
		throw new DogBiteException("you throw i bark...");
	}
}
class StickItem extends Item{
	@Override
	  public void execute()throws DogException{
			throw new DogBarkException("you beat i bite...");
}
}
class Dog{
	public void play(Item item)throws DogException{
		item.execute();
	}
}

class Child{
	public void playWithDog(Item item,Dog dog) {
		try {
			dog.play(item);
		}catch (DogBiteException de) {
			System.out.println("dog has bitten..take him to hospital");
			System.out.println(de);
		}catch(DogBarkException dre) {
			System.out.println("dog is barkin be careful");
			System.out.println(dre);
		}catch (DogException d) {
			System.out.println("common");
		}
	}
}