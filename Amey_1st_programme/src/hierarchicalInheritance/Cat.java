package hierarchicalInheritance;

public class Cat extends Animals{
	 public void sound()
     {
   	  System.out.println("Meoww");
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Cat c = new Cat();
         c.sound();
         c.eats();
         c.drink();
     
	}

}
