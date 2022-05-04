package individual_practice;

public class PolymorphismDemo1 {
	public static void main(String[] args) {
		A obj = new B();
		
		/* A,B클래스 모두 x라는 메서드가 존재한다. B클래스는 A클래스를 상속받기 때문에. B클래스에서 인스턴스를 생성한 객체가
		A클래스 자료형일지라도 B클래스에서 재정의 되었기 때문에 B클래스의 x메서드가 출력된다. */
		System.out.println(obj.x());
		obj.y();
	
		A obj2 = new B2();
		System.out.println(obj2.x());
		/* 클래스 B, B2는 동일한 A클래스를 상속받고, 동일한 x메서드를 호출했지만 결과는 서로 다르다.
		 * 이것이 상속과 오버라이딩 그리고 형변환을 이용한 다형성이다.*/
	}
}
