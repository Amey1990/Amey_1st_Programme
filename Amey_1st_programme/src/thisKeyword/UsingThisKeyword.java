package thisKeyword;

public class UsingThisKeyword {
    int a;
    public void myMethod(int a)
    {
    	System.out.println(a);
    	this.a = a;
    	System.out.println(a);
    }
    public void fun()
    {
    	System.out.println(a);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsingThisKeyword g = new UsingThisKeyword();
		g.myMethod(10);
		g.fun();
	}

}
