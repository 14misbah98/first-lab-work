package com.day17;
import java.net.URL;
import java.net.URLConnection;
public class CallServlet{
	public static void main(String[] args) throws Exception  {
		
	
	URL url=new URL("http://localhost:2020/mywebactivity/HelloWorld");
	
	URLConnection urlcon=url.openConnection();

	urlcon.getInputStream();
	



}


}
