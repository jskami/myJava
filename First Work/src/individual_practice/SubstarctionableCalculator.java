package individual_practice;

public class SubstarctionableCalculator extends Calculator {
	public void substract() {
		System.out.println("상속받았습니다.");
		System.out.println(this.a - this.b);
	}
}
