package com.day16;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IODemo {

	public static void main(String[] args)throws Exception {
	//	FileOutputStream fos=new FileOutputStream("data.txt",true);
		FileOutputStream fos=new FileOutputStream("copydata.txt");
//		fos.write(97);
//		fos.write('a');
//		String str="jack and jill went up the hill";
//		byte b[]=str.getBytes();
//		
//		fos.write(b);
//		
		FileInputStream fis=new FileInputStream("data.txt");
		int n=0;
//		while((n=fis.read())!=-1) {
//			System.out.println((char)n);
//		}
		byte b[]=new byte[8];
		while((n=fis.read(b))!=-1) {
			System.out.println("no of bytes read..."+n);
			String s=new String(b,0,n);
			System.out.println(s);
			fos.write(b,0,n);
		}
	}
}