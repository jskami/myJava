package individual_practice;

public class OverloadingDemo2 extends OverloadingDemo {
	void A (String arg1, String arg2) {
		System.out.println("sub class : void A(String arg1, String arg2)");
	}
	
	void A () {
		System.out.println("sub class : void A()");
	}
	
	public static void main(String[] args) {
		OverloadingDemo2 od = new OverloadingDemo2();
		od.A();	// 오버 라이딩
		od.A(10);	// 오버 로딩
		od.A("Final Attack");	// 오버 로딩
		od.A("Final Attack", "Ride");	// 오버 라이딩
		
	}
}
