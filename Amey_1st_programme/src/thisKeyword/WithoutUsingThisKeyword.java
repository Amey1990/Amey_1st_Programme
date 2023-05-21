package thisKeyword;

public class WithoutUsingThisKeyword {
     int a;
     public void myMethod(int f)
     {
    	 System.out.println(f);
    	 a = f;
    	 System.out.println(a);
     }
     public void fun()
     {
    	 System.out.println(a);
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WithoutUsingThisKeyword o = new WithoutUsingThisKeyword();
		o.myMethod(7);
		o.fun();
	}

}
