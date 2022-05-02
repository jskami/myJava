package individual_practice;

public class CalculatorDemo {
	public static void sum(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void avg(int a, int b) {
		System.out.println((a+b)/2);
	}
	
	public static void main(String[] args) {
		sum(10, 20);
		sum(30, 70);
		avg(100, 50);
	}
}
