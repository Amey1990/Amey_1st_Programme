package polymorphism;

public class Icecream extends Panipuri{
	public void eat()
	{
		System.out.println("I want to eat Icecream");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Icecream i = new Icecream();
		i.eat();
		Panipuri p = new Panipuri();
		p.eat();
	}

}
