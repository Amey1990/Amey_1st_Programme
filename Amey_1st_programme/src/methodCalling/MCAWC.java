package methodCalling;

public class MCAWC {
    public void mobile(double c)
    {
    	System.out.println("I'm having oppo");
    }
    public void computer(int a)
    {
    	System.out.println("I'm having Dell PC");
    }
    public void laptop(String a)
    {
    	System.out.println("I have Dell laptop");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MCAWC obj = new MCAWC();
        obj.mobile(40.12);
        obj.computer(12);
        obj.laptop("Amey");
	}

}
