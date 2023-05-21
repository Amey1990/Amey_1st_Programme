package Constructor;

public class ClassConstructor {
    String name;
    int age;
    ClassConstructor()
    {
    	name = "Amey";
    	age=20;
    	System.out.println("Name is "+name+" and age is "+age++);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      new ClassConstructor();
	}

}
