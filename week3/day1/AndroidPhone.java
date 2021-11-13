package week3.day1;

public class AndroidPhone extends Mobile {

	public void takeVideo() {
		System.out.println("Take Video  from AndroidPhone");
	}
	public static void main(String[] args) {
	
		AndroidPhone aphon = new AndroidPhone();
		aphon.takeVideo();
		aphon.sendMsg();
		aphon.makeCall();
		aphon.saveContact();

	}

}
