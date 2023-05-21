package logicalPrograms;

public class WithoutUsingForLoopPrint1_to_10 {

	public void print(int a)
	{
		if(a<=10)
		{
			System.out.println(a);
			this.print(a+1); //can not use unary operator here
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WithoutUsingForLoopPrint1_to_10 w = new WithoutUsingForLoopPrint1_to_10();
		w.print(3);
	}

}
