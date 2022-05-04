package individual_practice;

public class CalculatorDecoMinus extends Calculator {
	public void sum() {
		System.out.println("- sum : " + _sum());
	}
	
	public void avg2() {
		System.out.println("- avg : " + (this.a+this.b)/2);
	}
	
}
