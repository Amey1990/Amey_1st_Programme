package controlStatements;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int age=19;
      int weight=65;
      if(age>=18)
      {
    	  System.out.println("Age is Valid");
          if(weight>50)
          {
        	  System.out.println("Weight is Valid");
        	  System.out.println("You are valid donor");
          }
      }
      else
      {
    	  System.out.println("You are not valid dodnor");
      }
	}

}
