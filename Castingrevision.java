package curie;

public class Castingrevision {

	public static void main(String[] args) {
		
			//byte,short,int,long
			
			//byte can go into short and short can go into int and int can go into long
			
			byte b=20; //8 bit
			short s=b; //16 bit
			int i=s; //32 bit
			long l=i; //64 bit
			
			//but now let us see the reverse
			//the reverse is incompatible
			long ll=100;
			int ii=(int)ll;
			short ss=(short)ii;
			byte bb=(byte)ss;
			
			//even in compatible types if the value is of higher range, then the value is trimmed to a lower value
			//by dividing the number by 256 and assigning the reminder.
			
			int iii=257;//32 bit
			byte bbb=(byte)iii;//byte is 8 bit can take only a value upto -128 to 127
			
			System.out.println(bbb);
			
			//when you cast, from higher to lower type, then you loose the precision
			
			//FLOATING NUMBERS
			
			float f=123.434f;
			int myint=(int)f;
			System.out.println(myint);
			
			System.out.println((char)169);
			System.out.println((int)'a');
			
			int mycharascii=169;
			char mycharrr=(char)mycharascii;
			System.out.println(mycharrr);
			
		}
	}
	