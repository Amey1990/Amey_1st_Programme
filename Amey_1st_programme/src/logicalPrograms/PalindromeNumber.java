package logicalPrograms;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		int rev=0;
		int num=121;
		int pal=num;
		while(num>0)
		{
			temp=num%10;
			rev=rev*10+temp;
			num=num/10;
		}
		if(rev==pal)
		{
			System.out.println("number is palindrome");
		}
		else
		{
			System.out.println("number is not palindrome number");
		}
	}

}
