package individual_practice;

public class CalculatorDemo1 {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.setOperands(10, 20);
		c.sum();
		c.avg();
		
		Calculator c1 = new Calculator();
		c1.setOperands(20, 40);
		c1.sum();
		c1.avg();
		
		Calculator c2 = new Calculator();
		// 인스턴스를 통한 pi 접근
		System.out.println(c2.PI);
		System.out.println(c1.PI);
		System.out.println(c.PI);
		// 클래스를 통한 pi 접근
		System.out.println(Calculator.PI);
		
		Calculator.base = 10;
		
		c.sum();
		c1.sum();
		c2.sum();
		
		SubstarctionableCalculator c3 = new SubstarctionableCalculator(); 
		c3.setOperands(10, 20);
		c3.sum();
		c3.avg();
		c3.substract();
		
		MultiplicationableCalculator c4 = new MultiplicationableCalculator();
		c4.setOperands(10, 20);
		c4.sum();
		c4.avg();
		c4.multiplication();
		
		DivisionableCalculator c5 = new DivisionableCalculator();
		c5.setOperands(10, 20);
		c5.sum();
		c5.avg();
		c5.multiplication();
		c5.division();
		
	}
}
