package individual_practice;

public class A {
	// 다양한 예외처리============================//
	private int[] arr = new int[3];
	A() {
		arr[0] = 0;
		arr[1] = 10;
		arr[2] = 20;
	}
	
	public void e(int a, int b) {
		try {
			System.out.println(arr[a] / arr[b]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		} catch(ArithmeticException e) {
			System.out.println("ArithmeticException");
		} catch(Exception e) {
			System.out.println("Exception"); // 위의 두 캐치문 보다 이녀석이 더 포괄적인 예외를 의미하는거라서 이녀석이 맨 앞에 위치하면 컴파일을 실행하지 못할 것이다.
		}	// 다중 catch의 예
		  finally {
			  System.out.println("finally"); // 예외와 상관없이 finally가 실행된다.
		  }
	}
	//=======================================//
	
	public String y() {
		return "public void y()";
	}
	
	private String z() {	// A클래스 밖에서 접근 할 수 없다.
		return "private void z()";
	}
	
	public String x() {
//		return z();
		return "A.x";
	}
	
	/* 추상클래스, 추상메서드 */
//	public abstract int b();
	
	public void d() {
		System.out.println("GoodDay Commander");
	}
}
