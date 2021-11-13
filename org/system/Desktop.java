package org.system;

public class Desktop extends Computer {

	public  void desktopSize()
	{
		System.out.println("The desktop Size is 15.6'");
	}
	public static void main(String[] args) {
		
		Desktop des=new Desktop();
		des.desktopSize();
		des.computerModel();

	}

}
