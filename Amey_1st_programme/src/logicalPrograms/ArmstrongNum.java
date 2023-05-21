package logicalPrograms;

public class ArmstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1634;
		int temp;
		int rev=0;
		int arm=num;
		while(num>0)
		{
			temp=num%10;
			rev = rev + temp*temp*temp*temp;
			num=num/10;
		}
		if(rev==arm)
		{
			System.out.println("Number is armstrong number");
		}
		else
		{
			System.out.println("Number is not armstrong number");
		}
	}

}
