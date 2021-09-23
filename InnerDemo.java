package mod1_2.day6;

public class InnerDemo {

	public class InnerClassDemo {
		public static void main(String[] args) {
			InnerDemo obj=new InnerDemo();
			
			//how to create instance of inner class
			//InnerDemo.MyInnerClass myin=new InnerDemo().new MyInnerClass();
			
			//how to create or capture instance of static inner class
			
			//InnerDemo.MyInnerStatic myins=new InnerDemo.MyInnerStatic();
		}	
	}
	//class InnerDemo{
		//inner class
			class MyInnerClass{
				
			}
			
			//static inner class
			static class MyInnerStatic{
				
			}
			
			public void met() {
				//local inner class
				class MyLocalInner{
					
				}
			}
	
	/*
	 * Inner classes are of four types...
	 * 1. Inner Class
	 * 2. static inner class
	 * 3. Local Inner Class
	 * 4. Anonymous Inner class
	 */

	}

}
