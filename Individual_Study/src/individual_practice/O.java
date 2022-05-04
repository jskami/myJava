package individual_practice;

/* 다형성 공부 
 * "동일한 조작방법으로 동작, 그러나 동작 방법은 다른 것 
 * */
public class O {
	// 오버로딩 다형성
	public void a(int param) {
		System.out.println("숫자출력");
		System.out.println(param);
	}
	
	public void a(String param) {
		System.out.println("문자출력");
		System.out.println(param);
	}
}
