package exceptionHandling;

public class VariousWaysToPrintException {
	public static void main(String[] args)
	{
		try
		{
		System.out.println("1");
		int a = 10;
		int b = 0;
		int c=a/b;
		System.out.println("njdwhcjlwbcjk");
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("============================================");
			System.out.println(e);
			System.out.println("============================================");
			System.out.println(e.getMessage());
			
		}
	}
	
}
