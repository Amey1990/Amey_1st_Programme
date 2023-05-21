
public class UpdateAndCheckBalance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountBalance a = new AccountBalance();
		System.out.println(a.getBalance());
		a.setBalance(100.60);
		System.out.println(a.getBalance());
		a.setBalance(20.20);
		System.out.println(a.getBalance());
	}

}
