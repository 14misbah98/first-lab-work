package hitday21;

public class WrapperDemo {

	public static void main(String[] args) {
		/*
		 * for every primitive type, we have a corresponding wrapper type
		 *
		 * int - Integer
		 * float - Float
		 * byte - Byte
		 * char - Character
		 * boolean - Boolean
		 * long - Long
		 *
		 *
		 */
		//before jdk5
		
		int i=10;//simple type
		//now you want to convert this into object type - then we use wrapper
		Integer ii=new Integer(i); //- boxing
		int n=ii.intValue();// unboxing
		Integer iii=new Integer(n);//- boxing
				
		//after jdk5
		//jdk introduced autoboxing and autounboxing
		Integer nn=Integer.valueOf(i);
		int nnn=nn; //auto unboxing
		Integer xxx=nnn; //autoboxing
		
		//advantages u have
		//utility methods
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.max(10, 20));
		System.out.println(Integer.compare(10, 20));
		String sss1=args[0];
		String sss2=args[1];
		System.out.println(sss1+sss2);
		int s1=Integer.parseInt(args[0]);
		int s2=Integer.parseInt(args[1]);
		System.out.println(s1+s2);
	}
	}


