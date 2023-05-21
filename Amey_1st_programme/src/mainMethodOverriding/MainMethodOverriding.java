package mainMethodOverriding;

public class MainMethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is our original method");
		main(25);
		main(40,50);
	}
	public static void main(int a) {
		// TODO Auto-generated method stub
		System.out.println("Main method with int");
	}
	public static void main(int c, int d) {
		// TODO Auto-generated method stub
		System.out.println("Main method with 2 int");
	}
}
