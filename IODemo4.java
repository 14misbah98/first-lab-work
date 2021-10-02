package com.day16;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class IODemo4 {
	public static void main(String[] args) throws Exception{
		Laddu laddu=new Laddu();
		laddu.size=5;
		
		FileOutputStream fos=new FileOutputStream("laddu.dat");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(laddu);
		
		laddu.size=2;
		System.out.println(laddu.size);
		
		FileInputStream fis=new FileInputStream("laddu.dat");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		laddu=(Laddu)ois.readObject();
		
		System.out.println(laddu.size);
	}
}
class Laddu implements Serializable{
	transient int size=10;
}


