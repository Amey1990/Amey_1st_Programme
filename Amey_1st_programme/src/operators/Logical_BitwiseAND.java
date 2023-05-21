package operators;

public class Logical_BitwiseAND {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("=====Logical AND (&&)=====");
       int a = 10;
       int b = 20;
       System.out.println(a>b && b<a);
       System.out.println(a<b && b>a);
       System.out.println(a<b && b<a);
       System.out.println("=====Bitwise AND (&)=====");
       System.out.println(a>b & b<a);
       System.out.println(a<b & b>a);
       System.out.println(a<b & b<a);
	}

}
