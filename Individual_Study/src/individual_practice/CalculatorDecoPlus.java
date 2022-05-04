package individual_practice;

public class CalculatorDecoPlus extends Calculator {
	public void sum() {
		System.out.println("+ sum : " + _sum());
	}
	
	public void avg2() {
		System.out.println("+ avg : " + (this.a+this.b)/2);
	}
	
}
