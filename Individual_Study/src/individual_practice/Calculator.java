package individual_practice;

public class Calculator {
	static final double PI = 3.14;
	static int base = 0;
	int a, b;
	private int x, y;
	int c = 0;
	int[] oprands;
	
	public Calculator()	{
		
	}
	
	public Calculator(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void setOprands(int[] oprands) {
		this.oprands = oprands;
	}
	
	public void sum1() {
		int total = 0;
		for(int value : this.oprands) {
			total += value;
		}
		System.out.println(total);
	}
	
	public void avg1() {
		int total = 0;
		for(int value : this.oprands) {
			total += value;
		}
		System.out.println(total/this.oprands.length);
	}
	
	public void setOperands(int a, int b) {
		System.out.println("setOperands(int a, int b)");
		this.a = a;
		this.b = b;
	}
	
	public void setOperands(int a, int b, int c) {
		System.out.println("setOperands(int a, int b, int c)");
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	// 예외 처리 학습 =======================//
	public void setOprandsEx(int a, int b) {
		// 첫 번째 조치
		if(b == 0) {
			throw new IllegalArgumentException("두 번째 인자 값은 0이 될 수 없다.");
		}
		this.a = a;
		this.b = b;
	}
	
//	public void divide() {
//		try {
//			System.out.print("계산 결과는 : ");
//			System.out.print(this.a / this.b);
//			System.out.print(" 입니다.");
//		} catch(Exception e) {	// Exception은 java.lang에 소속된 기본 클래스이다.
//			System.out.println("오류 발생 : " + e.getMessage());
//			System.out.println("\n\ne.getMessage()\n" + e.getMessage());
//			System.out.println("\n\ne.toString()\n" + e.toString());
//			System.out.println("\n\ne.printStackTrace()");
//			e.printStackTrace();
//		}
//	}
	
	// 두 번째 조치
	public void divide(){
        if(this.b == 0){
            throw new ArithmeticException("0으로 나누는 것은 허용되지 않습니다.");
        }
        try {
            System.out.print("계산결과는 ");
            System.out.print(this.a/this.b);
            System.out.print(" 입니다.");
        } catch(Exception e){
            System.out.println("\n\ne.getMessage()\n"+e.getMessage());
            System.out.println("\n\ne.toString()\n"+e.toString());
            System.out.println("\n\ne.printStackTrace()");
            e.printStackTrace();
        }
    }
	
	//====================================//
	
	public void sum() {
//		System.out.println(this.a + this.b + base);
		System.out.println(this.a + this.b);
//		System.out.println(this.a + this.b + this.c);
	}
	
	public int avg() {
////		System.out.println((this.a+this.b + base)/2);
//		return ((this.a+this.b)/2);
		return ((this.a+this.b+this.c)/3);
	}
	
	public void avg2() {
		System.out.println((this.a + this.b)/2);
	}
	
	
	/* 접근제어자 공부 */
//	private 
	int _sum() {
		return this.x + this.y;
	}
	
	public void setOprands(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void sumDecoPlus() {
		System.out.println("+++++"+_sum()+"+++++");
	}
	
	public void sumDecoMinus() {
		System.out.println("-----"+_sum()+"-----");
	}
	
	/* 추상클래스, 추상메서드 공부(클래스도 추상으로 만들어줘야 에러 안뜸) */
//	public abstract void sum2();
//	public abstract void avg2();
	public void run() {
		sum();
		avg2();
	}
	
	
}
