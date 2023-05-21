package scannerFunction;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter first Number");
		int a = s1.nextInt();
		System.out.println("Enter second Number");
		int b = s1.nextInt();
		int c= a+b;
		System.out.println("This is required addition "+c);
		System.out.println("Write your name");
		String s = s1.next();
		System.out.println("My name is "+s);
	}

}
