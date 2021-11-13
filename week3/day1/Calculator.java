package week3.day1;

public class Calculator {
	
	public void add(int num1,int num2) {
		System.out.println(num1+num2);
	}

	public void add(int num1,int num2,int num3) {
		System.out.println(num1+num2+num3);
		
	}
	
	public void mul(int num1,int num2) {
		System.out.println(num1*num2);
	}
	
	public void mul(int num1,double num2) {
		System.out.println(num1*num2);
	}
	
	public void sub(int num1,int num2) {
		System.out.println(num1-num2);
	}
	
	public void sub(double num1,double num2) {
		System.out.println(num1-num2);
	}
	
	public void div(int num1,int num2) {
		System.out.println(num1/num2);
	}
	
	public void div(double num1,int num2) {
		System.out.println(num1/num2);
	}
	public static void main(String[] args) {
		
		Calculator calc=new Calculator();
		calc.add(5, 7);
		calc.add(8, 12, 11);
		calc.mul(4, 2);
		calc.mul(2, 2.4567399);
		calc.sub(15, 4);
		calc.sub(3.14563345, 1.045736);
		calc.div(8, 2);
		calc.div(12.2653, 2);

		
	}

}
