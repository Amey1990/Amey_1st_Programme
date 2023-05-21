package thisKeyword;

public class InvokeMethod {
    public void show()
    {
    	System.out.println("I'm in show method");
    }
    public void display()
    {
    	this.show();
    	show();  //this keyword added automatically
    	System.out.println("I'm in dsplay method");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InvokeMethod i = new InvokeMethod();
		i.display();
	}

}
