package individual_practice;

public class A {
	public String y() {
		return "public void y()";
	}
	
	private String z() {	// A클래스 밖에서 접근 할 수 없다.
		return "private void z()";
	}
	
	public String x() {
//		return z();
		return "x";
	}
	
	/* 추상클래스, 추상메서드 */
//	public abstract int b();
	
	public void d() {
		System.out.println("GoodDay Commander");
	}
}
