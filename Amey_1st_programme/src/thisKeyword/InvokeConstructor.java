package thisKeyword;

public class InvokeConstructor {
	InvokeConstructor()
	{
		this(9);
		System.out.println("Non Parameterized Constructor");
	}
	InvokeConstructor(int a)
	{
		System.out.println("Parameterized Constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InvokeConstructor d = new InvokeConstructor();
	}

}
