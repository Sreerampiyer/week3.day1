package week3.day1;

public class SmartPhone extends AndroidPhone{
	public void whatsapp() {
		System.out.println("Connect to whatsapp");
	}
	
	public void takeVideo() {
		System.out.println("video taken from Smartphone");
	}

	public static void main(String[] args) {
		SmartPhone smart=new SmartPhone();
		
		
		smart.takeVideo();
		
		/*smart.whatsapp();
		smart.sendMsg();
		smart.makeCall();
		smart.saveContact();*/
	}

}
