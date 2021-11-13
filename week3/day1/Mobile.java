package week3.day1;

public class Mobile {
	
	public void sendMsg() {
		System.out.println("Send Message");
	}
	
	public void makeCall()
	{
		System.out.println("Make Calls");
	}
	
	public void saveContact() {
		System.out.println("Save Contact");
	}

	public static void main(String[] args) {

		Mobile mob=new Mobile();
		
		mob.sendMsg();
		mob.makeCall();
		mob.saveContact();
		

	}

}
