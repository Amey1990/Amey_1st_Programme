package logicalPrograms;

public class SmallestNumberinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,24,56,2,34,5,56};
	    int small=a[0];
		for(int i=0;i<=a.length-1;i++)
		{
			if(small>a[i])
			{
				small=a[i];
			}
		}
		System.out.println(small);
	}

}
