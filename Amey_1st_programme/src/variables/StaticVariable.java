package variables;

public class StaticVariable {
    static int a = 12;
    
    public void tintin()
    {
    	System.out.println(a);
    }
    public static void pinpin()
    {
    	System.out.println(a);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     pinpin();
     StaticVariable s = new StaticVariable();
     s.tintin();
	}

}
