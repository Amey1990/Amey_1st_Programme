package encapsulation;

public class UpdateAndCheckBalance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		{
			AccountBalance a = new AccountBalance();
			System.out.println(a.getBalance());
			a.setBalance(11000.50);
			System.out.println(a.getBalance());
			a.setBalance(110);
			System.out.println(a.getBalance());
		}
	}

}
