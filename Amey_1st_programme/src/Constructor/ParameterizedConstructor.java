package Constructor;

public class ParameterizedConstructor {
	ParameterizedConstructor (int a)
	{
		System.out.println("contains 1 int value");
	}
	ParameterizedConstructor (String s)
	{
		System.out.println("Contains 1 string value");
	}
	ParameterizedConstructor (int b,int c)
	{
		System.out.println("Contains 2 int values");
	}
	ParameterizedConstructor(int u,String h)
	{
		System.out.println("Contains 1 int and 1 string value");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ParameterizedConstructor(1);
		new ParameterizedConstructor("s");
		new ParameterizedConstructor(2,3);
		new ParameterizedConstructor(5,"ind");
	}

}
