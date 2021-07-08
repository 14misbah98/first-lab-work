package curie;

public class Logicaloperators {

	public static void main(String[] args) {
int x=100;
int z=200;
System.out.println(x==z);
System.out.println(x>z);
System.out.println(x<z);
System.out.println(x>=100);
System.out.println(z<=200);

System.out.println(x!=z);

//logical operators

// && - both conditions to be satisfied
//|| - one of the condition to be satisfied

System.out.println(x<=100 && z>200);

System.out.println(x<=100 || z>200);
}
}