package individual_practice;

public class SubstarctionableCalculator extends Calculator {
	
	public SubstarctionableCalculator() {
		
	}
	
	public SubstarctionableCalculator(int a, int b) {
		super(a, b);	// super는 부모 클래스를 의미, ()를 붙이면 부모 클래스의 생성자를 의미, 부모클래스의 기본 생성자가 없어져도 오류가 발생하지 않는다.
	}

	public void sum() {
		System.out.println("실행 결과 : " + (this.a + this.b) + "입니다.");
	}
	
	public int avg() {	// 상속하는 cal-의 avg()타입은 void타입인데 상속받는 sub-의 avg()타입은 return이라서 에러가 나타난다.(상속 받으려면 타입도 일치해야함)
		return super.avg();	// cal-과 sub-에 동일한 avg()가 있어서 중복을 피하고자 여기서 avg()를 지우고 cal-의 avg()를 super를 통해 호출
	}
	
	public void substract() {
		System.out.println("상속받았습니다.");
		System.out.println(this.a - this.b);
	}
	
	// 매개변수가 있는 생성자를 만들었다.
//	public SubstarctionableCalculator(int a, int b) {
//		this.a = a;
//		this.b = b;
//	}
	
	
}
