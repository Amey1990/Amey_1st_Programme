package methodCalling;

public class MCWC {
    public static void fun1()
    {
	     System.out.println("I'm in static method");
    }
    public void fun2()
    {
         System.out.println("I'm in non static method");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MCWC.fun1();
        MCWC f = new MCWC();
        f.fun2();
	}

}
