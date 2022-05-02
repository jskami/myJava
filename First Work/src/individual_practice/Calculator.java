package individual_practice;

public class Calculator {
	static double PI = 3.14;
	static int base = 0;
	int a, b;
	
	public void setOperands(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void sum() {
		System.out.println(this.a + this.b + base);
	}
	
	public void avg() {
		System.out.println((this.a+this.b + base)/2);
	}
	
}
