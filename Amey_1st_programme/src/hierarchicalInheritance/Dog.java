package hierarchicalInheritance;

public class Dog extends Animals{
       public void sound()
       {
    	   System.out.println("Boww Boww");
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Dog d = new Dog();
          d.sound();
          d.eats();
          d.drink();
	}

}
