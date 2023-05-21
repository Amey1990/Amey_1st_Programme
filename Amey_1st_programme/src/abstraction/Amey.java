package abstraction;

public class Amey {
	public void toGoToAirportByCar()
	{
		System.out.println("Amey wants to use a car to go to Airport");
		Fuel f = new Car();
		f.petrol();
		f.ready();
	}
	public void flyInAeroplane()
	{
		System.out.println("Now AMey will fly in aeroplane to Europe");
		Aeroplane a = new Aeroplane();
		a.petrol();
		a.ready();
	}
	
}
