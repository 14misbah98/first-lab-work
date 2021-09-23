package hitday21;

public class Test {
	String str=new String("good");
	char ch[]= {'a','b','c'};
	
	public static void main(String args[]) {
  Test ex=new Test();
  ex.change (ex.str,ex.ch);
  System.out.println(ex.str+"and"+ex.ch[0]);
	}
	public void change(String str, char ch[]) {
		str=" test ok"; ch[0]='g';
	}
}	
  

