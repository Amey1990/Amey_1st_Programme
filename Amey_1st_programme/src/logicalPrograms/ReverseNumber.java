package logicalPrograms;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num=542;
       int rev=0;
       int temp;
       while(num>0)
       {
    	   temp=num%10;
    	   rev=rev*10+temp;
    	   num=num/10;
       }
       System.out.println(rev+" is our required number");
	}

}
