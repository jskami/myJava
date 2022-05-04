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
	
	public void sum() {
//		System.out.println(this.a + this.b + base);
//		System.out.println(this.a + this.b);
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
