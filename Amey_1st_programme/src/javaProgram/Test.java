package javaProgram;

public class Test {

	public void myMethod()
	{
		System.out.println("I'm insidenon static method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Test obj = new Test();
        obj.myMethod();
        obj.myMethod();
	}

}
