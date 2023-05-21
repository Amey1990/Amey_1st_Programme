package Upcasting;

public class UpcastingConcept1 { //overriding takes place

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Shark s = new Shark();
		//s.nature();
		Animal a = new Shark(); //upcasting
		a.nature();            //upcasting
		Shark s = (Shark)a;//downcasting
		s.nature();   //downcasting
	}

}
