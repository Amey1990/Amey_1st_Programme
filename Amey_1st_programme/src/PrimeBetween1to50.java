public class PrimeBetween1to50
	{
		
		public static void main(String[] args)
		{
			int flag=0;
			for(int i=1; i<=50; i++)
			{
				for(int j=2; j<i; j++)
				{
					if(i%j==0)
					{
					flag=1;
					}
				}
				if(flag==0)
				{
					System.out.println(i+" is a prime number");
				}
				else
				{
					flag=0;
				}
			}
		}
	}
