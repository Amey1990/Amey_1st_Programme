package controlStatements;

public class IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int money = 101;
     if(money>3000 && money<=10000)
     {
    	 System.out.println("I will buy smartphone");
     }
     else if(money>10000 && money<=30000)
     {
    	 System.out.println("I will buy Bicycle");
     }
     else if(money>30000 && money<=100000)
     {
    	 System.out.println("I will buy laptop");
     }
     else
     {
    	 System.out.println("Insufficient money");
     }
	}

}
