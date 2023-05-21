package logicalPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=5;
        int flag=0;
        for(int i=2; i<=a-1;i++)
        {
        	if(a%i==0)
        	{
        		flag=1;
        	}
        }
        if(flag==0)
        {
        	System.out.println(a+" is a prime number");
        }
        else
        {
        	System.out.println(a+"is not a prime number");
        }
	}

}
