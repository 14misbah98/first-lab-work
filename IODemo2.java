package com.day16;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;

public class IODemo2 {

	public static void main(String[] args) throws Exception{
		String str="jack and &copy; jill &cop went up the hill...";
		byte b[]=str.getBytes();
		ByteArrayInputStream bas=new ByteArrayInputStream(b);
		BufferedInputStream bis=new BufferedInputStream(bas);
		
		int n=0;
		boolean mark=false;
		while((n=bis.read())!=-1) {
			switch((char)n) {
			case '&':{
				mark=true;
				bis.mark(30);
				break;
			}
			case ';':{
				mark=false;
				System.out.print((char)169);
				break;
			}
			case ' ':{
				if(mark) {
					mark=false;
					bis.reset();
					System.out.print("&");
				}
				else {
					System.out.print(" ");
				}
				break;
			}
			default:{
				if(!mark) {
					System.out.print((char)n);
				}
			}
			}
		}
		
	}
}





	


