package controlStatements;

public class NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Check Whether the given number is EVen, Odd or Negative");
     int a=12;
     if(a>0)
     {
    	 System.out.println(a+" Number is Positive");
    	 if(a%2==0)
    	 {
    		 System.out.println(a+" Number is Even");
    	 }
     
         else 
         {
    	 System.out.println(a+" Number is Odd");
         }
     }
     else
     {
    	 System.out.println("Number is Negative");
     }
	}
	

}
