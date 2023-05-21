package controlStatements;

public class SwitchCaseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("To check a particular day in a week");
      int day=3;
      switch(day)
      {
      case 1:
    	  System.out.println("Today is Monday");
    	  break;
      case 2:
    	  System.out.println("Today is Tuesday");
    	  break;
      case 3:
    	  System.out.println("Today id Wednesday");
    	  break;
      case 4:
    	  System.out.println("Today is Thursday");
    	  break;
      case 5:
    	  System.out.println("Today is Friday");
    	  break;
      case 6:
    	  break;
      case 7:
    	  System.out.println("Today is sunday");
    	  break;
      default:
    	  System.out.println("Not a valid input");
      }
	}

}
