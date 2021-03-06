package individual_practice;

public class OOP_Ex1 {
	int x = 5;
	final int y = 7;
	String msg = "너무 피곤해";
	String msg1 = "공부할게 많다";
	
	// 클래스에 메서드를 만들고 메인 메서드의 새로운 객체가 이 메서드를 엑세스하는 방법을 공부해보자
	static void myMethod() {
		System.out.println("메서드 소환!");
	}
	
	public static void main(String[] args) {
		// 클래스 1개에서 객체 하나 생성
		OOP_Ex1 myobj = new OOP_Ex1();
		// 클래스 속성값 수정(재정의 가능)하기
		myobj.x = 40;
		System.out.println(myobj.x);
		
		OOP_Ex1 mesege = new OOP_Ex1();
		System.out.println(mesege.msg);
		
		// 클래스 1개에서 여러 객체 생성
		OOP_Ex1 myobj1 = new OOP_Ex1();
		OOP_Ex1 myobj2 = new OOP_Ex1();
		OOP_Ex1 myobj3 = new OOP_Ex1();
		System.out.println(myobj1.x);
		System.out.println(myobj2.x + 5);
		System.out.println(myobj3.x + 10);
		
		// 클래스 속성값을 재정의 하기 싫다면 클래스에서 final 사용
		OOP_Ex1 myobj4 = new OOP_Ex1();
//		myobj4.y = 33;	// 에러가 나타나는게 당연하다.
		System.out.println(myobj4.y);
		// 여러 객체중 클래스의 속성값에 영향을 주지 않고 객체값 재정의 후 변경
		OOP_Ex1 myobj5 = new OOP_Ex1();
		myobj5.x = -10;
		System.out.println(myobj5.x);
		
		OOP_Ex1 msg1 = new OOP_Ex1();
		System.out.println(msg1.msg1);
		
		// 메서드를 객체가 불러오고, 객체 없이도 불러 올 수 있다.
		OOP_Ex1 my = new OOP_Ex1();
		my.myMethod();
		myMethod();
		
	}
}
