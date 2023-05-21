package abstraction;

public class Car extends Fuel {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		c.petrol();
		c.ready();
		
		Fuel f = new Car();
		f.petrol();
		f.ready();
	}

	//@Override
	public void petrol() {
		// TODO Auto-generated method stub
		System.out.println("car petrol is being filled in car");
	}

}
