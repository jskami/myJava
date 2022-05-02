package individual_practice;

public class MultiplicationableCalculator extends Calculator {
	public void multiplication() {
		System.out.println("곱하기 메서드, Calculator 상속중");
		System.out.println(this.a * this.b);
	}
}
