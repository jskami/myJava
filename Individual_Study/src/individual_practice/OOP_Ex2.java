package individual_practice;

public class OOP_Ex2 {
	
	// static과 public의 차이점
	static void myStaticMethod() {
		System.out.println("스태틱 메서드는 객체생성 없이 클래스 참조만으로도 호출 가능, 객체 참조도 가능");
	}
	
	public void myPublicMethod() {
		System.out.println("퍼블릭 메서드는 객체생성 후 객체참조로만 호출 가능");
	}
	
	public static void main(String[] args) {
		// 다른 클래스의 변수를 가져와서 객체로 생성하기
		OOP_Ex1 myobj = new OOP_Ex1();
		System.out.println(myobj.x);
	
	// static 메서드와 public 메서드 호출 차이
		myStaticMethod();
//		myPublicMethod();	// 에러 발생
	
		// 위에서 만든 객체 myobj를 이용해서 public 메서드를 호출해보자.
		OOP_Ex2 oop2 = new OOP_Ex2();
		oop2.myStaticMethod();
		oop2.myPublicMethod();
		
		System.out.println("==========================");
		// OOP_Ex3 클래스의 메서드를 다른 클래스에서 호출하는 방법을 연습해보자.
		OOP_Ex3 oop3 = new OOP_Ex3("여기도 마찬가지");	// 객체 생성
		oop3.fullThrottle();	// 객체 참조 -끝-
		oop3.speed(160);
		oop3.color("파란색");
		
		
		
		
		
	}
}
