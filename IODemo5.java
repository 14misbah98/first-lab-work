package com.day16;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
public class IODemo5 {
	public static void main(String[] args)throws Exception {
		URL url=new URL("https://www.google.com/index.html");
		
		URLConnection urlcon=url.openConnection();
		
		BufferedReader in=new BufferedReader(new InputStreamReader((urlcon.getInputStream())));
		
		FileOutputStream fos=new FileOutputStream("google.html");
		FileWriter out=new FileWriter("google.html");
		
		int n=0;
		char c[]=new char[128];
		while((n=in.read(c))!=-1)
		{
			String s=new String(c,0,n);
			System.out.print(s);
			out.write(c,0,n);
		}
		out.close();
	}
}

