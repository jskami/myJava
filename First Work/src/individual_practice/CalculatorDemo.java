package individual_practice;

public class CalculatorDemo {
	public static void sum(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void avg(int a, int b) {
		System.out.println((a+b)/2);
	}
	
	public static void main(String[] args) {
		SubstarctionableCalculator c1 = new SubstarctionableCalculator();		
		c1.setOperands(10, 20);
		c1.sum();	// 메서드 오버라이딩 : calculator의 sum()를 상속받은 sub~이 sum()를 재정의 해서 불렀기 때문
		System.out.println("실행 결과 : " + c1.avg());
		c1.substract();
	
		c1.setOperands(10, 20, 30);
		c1.sum();
		c1.avg();
		System.out.println("========================");
		
		Calculator c2 = new Calculator();
		c2.setOprands(new int[] {10, 20});
		c2.sum1();
		c2.avg1();
		c2.setOprands(new int[] {10, 20, 30});
		c2.sum1();
		c2.avg1();
		System.out.println("========================");
		
		Calculator c3 = new Calculator();
		c3.setOprands(10, 20);
		c3.sumDecoPlus();
		c3.sumDecoMinus();
		
		
	}
}
