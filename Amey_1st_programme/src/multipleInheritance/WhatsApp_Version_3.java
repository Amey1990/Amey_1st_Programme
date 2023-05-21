package multipleInheritance;

public class WhatsApp_Version_3 extends WhatsApp_Version_2{
	 public void payments()
	 {
		 System.out.println("user can now pay through whatsapp");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         WhatsApp_Version_3 w = new WhatsApp_Version_3();
         w.sendMessage();
         w.saveDP();
         w.calling();
         w.status();
         w.payments();
	}
}
