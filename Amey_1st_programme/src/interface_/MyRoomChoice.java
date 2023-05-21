package interface_;

public class MyRoomChoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I'm entering Hall");
		Hall h = new Hall();
		h.tubelightInHall();
		h.tubelightInKitchen();
		
		System.out.println("I'm entering in Kitchen");
		Tubelight t = new Kitchen();
		t.tubelightInHall();
		t.tubelightInKitchen();
	}

}
