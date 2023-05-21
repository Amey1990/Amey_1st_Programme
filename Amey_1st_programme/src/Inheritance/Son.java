//SIngle Level Inheritance
package Inheritance; 

public class Son extends Father{ // "Son class" is child class or sub class
    public void job()
    {
    	System.out.println("Son has his own job");
    }
    public void bike()
    {
    	System.out.println("Son has his own bike");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Son s = new Son();
       s.home();
       s.farm();
       s.job();
       s.bike();
	}

}
