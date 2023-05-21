package operators;

public class Logical_Bitwise_OR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a = 50;
       int b = 100;
       int c = 150;
       System.out.println("=====Logical OR=====");
       System.out.println(a<b || b<c);
       System.out.println(a<b || b>c);
       System.out.println("=====Bitwise OR=====");
       System.out.println(a<b | b<c);
       System.out.println(a<b | b>c);
	}

}
