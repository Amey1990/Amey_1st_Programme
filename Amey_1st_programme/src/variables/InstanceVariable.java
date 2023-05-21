package variables;

public class InstanceVariable {
    int a=10;
    int b= 2;
    int ac;
    double hh;
    String str;
    boolean bt;
    int d = a-b;
    public void function()
    {
    	
    	int e = a/b;
    	System.out.println(a);
    	System.out.println(ac);
    	System.out.println(hh);
    	System.out.println(str);
    	System.out.println(bt);
    	System.out.println(d);
    	System.out.println(e);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        InstanceVariable obj = new InstanceVariable();
        obj.function();
	}

}
