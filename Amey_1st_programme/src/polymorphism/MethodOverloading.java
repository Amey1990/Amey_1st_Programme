package polymorphism;

public class MethodOverloading {
	public void sum(int a, int b)
	{
		System.out.println(a+b);
	}
	public void sum(int c, float d)
	{
		System.out.println(c+d);
	}
	public void sum(double e, double f)
	{
		System.out.println(e+f);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading m = new MethodOverloading();
		m.sum(2, 3);
		m.sum(5, 5.5);
		m.sum(6.2, 0.3);
	}

}
