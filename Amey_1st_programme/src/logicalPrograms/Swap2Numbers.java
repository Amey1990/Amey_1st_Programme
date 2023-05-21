package logicalPrograms;

public class Swap2Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a=10;
       int b=20;
       int c;
       System.out.println("Before swapping = "+a+" "+b);
       c=b;
       b=a;
       a=c;
       //How to solve problem by without using third variable
      // a=a+b;//a=10+20=30
      // b=a-b;//b=30-20=10
       //a=a-b;//a=30-10=20
       System.out.println("After swapping = "+a+" "+b);
	}

}
