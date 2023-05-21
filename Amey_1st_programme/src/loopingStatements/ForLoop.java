package loopingStatements;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       for(int i=1; i<101; i++)
       {
    	   System.out.println(i);
       }
       System.out.println("===============");
       for(int j=100; j>0; j--)
       {
    	   System.out.println(j);
       }
       System.out.println("===============");
       for(int k=50; k<100; k++)
       {
    	   System.out.println(k);
       }  
       System.out.println("===============");
       for(int p=99; p>49; p--)
       {
    	   System.out.println(p);
       }
       System.out.println("===============");
       for(int q=1; q<11; q++)
       {
    	   if(q%2==0)
    	   {
    		   System.out.println(q+"is a Even Number");
    	   }
    	   else
    	   {
    		   System.out.println(q+"is a Odd Number");
    	   }

       }
	 }
	

}
