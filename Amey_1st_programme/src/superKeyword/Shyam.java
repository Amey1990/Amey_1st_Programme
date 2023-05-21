package superKeyword;

public class Shyam extends Ram{
	int age =40;
	public void myMethod()
	{
		System.out.println(age);
		System.out.println(super.age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shyam s = new Shyam();
		s.myMethod();
	}

}
