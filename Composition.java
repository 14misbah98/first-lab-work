package com.day10;

public class Composition {

	public static void main(String[] args) {
		Food thali=new Rice(new Mutton(new VegFry(new Fish())));
		System.out.println("cost of thali...Rs"+thali.cost());
	}

}
abstract class Food{
	public abstract int cost();
}
abstract class NonVegFood extends Food{}
abstract class VegFood extends Food{}
	
class Mutton  extends NonVegFood{
	Food item;
	public Mutton (Food item) {
		this.item=item;
	}
	public Mutton() {
		
	}
	@Override
	public int cost() {
		if(item!=null) {
			return 50+item.cost();
		
		}
		else {
			return 50;
		}
	}
}
class Chicken extends NonVegFood{
      Food item;
      public Chicken(Food item) {
    	  this.item=item;
      }
      public Chicken() {
    	  
      }
      @Override
      public int cost() {
    	  if(item!=null) {
    		  return 25+item.cost();
    	  }
    	  else {
    		  return 25;
    	  }
      }
}
class Fish extends NonVegFood{
	Food item;
	 public Fish(Food item) {
   	  this.item=item;
     }
     public Fish() {
   	  
     }
     @Override
     public int cost() {
   	  if(item!=null) {
   		  return 15+item.cost();
   	  }
   	  else {
   		  return 15;
   	  }
     }
}
	
class Rice extends NonVegFood{
	Food item;
	 public Rice(Food item) {
   	  this.item=item;
     }
     public Rice() {
   	  
     }
     @Override
     public int cost() {
   	  if(item!=null) {
   		  return 5+item.cost();
   	  }
   	  else {
   		  return 5;
   	  }
     }
}

class Daal extends NonVegFood{
	Food item;
	 public Daal(Food item) {
   	  this.item=item;
     }
     public Daal() {
   	  
     }
     @Override
     public int cost() {
   	  if(item!=null) {
   		  return 10+item.cost();
   	  }
   	  else {
   		  return 10;
   	  }
     }
}
	

class VegFry extends NonVegFood{
	Food item;
	 public VegFry(Food item) {
   	  this.item=item;
     }
     public VegFry() {
   	  
     }
     @Override
     public int cost() {
   	  if(item!=null) {
   		  return 20+item.cost();
   	  }
   	  else {
   		  return 20;
   	  }
     }
}
	