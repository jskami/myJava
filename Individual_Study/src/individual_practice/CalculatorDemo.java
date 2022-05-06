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
		
		System.out.println("========================");
		Calculator c4 = new CalculatorDecoPlus();
		c4.setOprands(10, 20);
		c4.run();
		
		Calculator c5 = new CalculatorDecoMinus();
		c5.setOprands(10, 20);
		c5.run();
		
		// 예외 처리 학습
		Calculator c6 = new Calculator();
		c6.setOprands(10, 0);
		c6.divide();
		
		Calculator c7 = new Calculator();
		c7.setOprands(20, 5);	// 예외처리 조치 두 가지중 택, 1.setOprands의 두번째 인자값에 0이 들어오면 예외를 발생시킨다.
		c7.divide();	// 2.메서드 divide를 실행할 때 right의 값이 0이라면 예외 발생
		
		
	}
}
