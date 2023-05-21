package exceptionHandling;

public class FinallyTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			System.out.println("1");
			int a=10;
			int b=0;
			int c=a/b;
			System.out.println("gekfjnkjv");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("2");
		}
		finally
		{
			System.out.println("Program completed...Thank You");
		}
		System.out.println("Amey");
	}

}
