package week3.day1;

public class AxisBank extends BankInfo{

	public void deposit() {
		System.out.println("The deposit rate is 7%");
	}
	public static void main(String[] args) {
		
		AxisBank axb=new AxisBank();
		axb.deposit();
		axb.fixed();
		axb.saving();

	}

}
