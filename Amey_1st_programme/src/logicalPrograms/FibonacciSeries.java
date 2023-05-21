package logicalPrograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a=0;
     int b=1;
     int c=0;
     System.out.print(a+" "+b);
     while(c<20)
     {
    	 c=a+b;
    	 a=b;
    	 b=c;
    	 System.out.print(" "+c);
     }
	}

}
