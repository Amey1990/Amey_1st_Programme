package loopingStatements;

public class NestedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      for(int i=1; i<=5; i++)
      {
    	  for(int j=1; j<=i; j++)
    	  {
    		  System.out.print("*");
    	  }
    	  System.out.println();
      }
      System.out.println("=====");
      for(int p=1; p<=5; p++)
      {
    	  for(int q=5; q>=p; q--)
    	  {
    		  System.out.print("*");
    	  }
    	  System.out.println();
      }
      System.out.println("=====");
      int row=6;
     for(int a=0; a<row; a++)
     {
    	 for(int b=row-a; b>1; b--)
    	 {
    		 System.out.print(" ");
    		 
    	 }
    	 for(int b=1; b<=a; b++)
    		 {
    			 System.out.print("*");
    		 }
    	 System.out.println();
     }
	}

}
