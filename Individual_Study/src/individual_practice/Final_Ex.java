package individual_practice;

public class Final_Ex {
	final int x = 10;
	final double Pi = 3.14;
	
	// static, public 메서드의 차이 복습
	static void myStaticMethod() {
		System.out.println("스태틱 메서드는 객체 생성 없이도 호출 가능");
	}
	
	public void myPublicMethod() {
		System.out.println("퍼블릭 메서드는 객체 참조를 해야 호출 가능");
	}
	
	
	public static void main(String[] args) {
		Final_Ex obj = new Final_Ex();
//		obj.x = 50;	// 에러가 나타나는게 당연하다.(final이니까)
//		obj.Pi = 25;
		System.out.println(obj.x);
	
		myStaticMethod();
//		myPublicMethod();	// 객체 참조 안해서 에러 발생
		obj.myPublicMethod();
	
	
	}
}
