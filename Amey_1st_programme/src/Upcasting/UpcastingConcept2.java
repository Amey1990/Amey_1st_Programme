package Upcasting;

public class UpcastingConcept2 {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father f = new Son();    //upcasting
		f.home();     //upcasting
		f.farm();     //upcasting
		System.out.println(f.age);
		Son c = (Son)f;   //downcasting
		c.job();          //downcasting
	}

}
