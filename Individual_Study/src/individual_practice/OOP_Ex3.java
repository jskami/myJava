package individual_practice;

public class OOP_Ex3 {
	// 디폴트 생성자 생성
	public OOP_Ex3(String text) {
		System.out.println(text + "기본생성자 출력");
	}	

	
	// static 메서드와 public 메서드 연습
	public void fullThrottle() {
		System.out.println("풀 스로틀!");
	}
	
	public void speed(int maxSpeed) {
		System.out.println("최대 속도 : " + maxSpeed);
	}
	
	static void color(String color) {
		System.out.println("디자인 컬러 : " + color);
	}
	
	public static void main(String[] args) {
		OOP_Ex3 car = new OOP_Ex3("텍스트 변수에 맞게 여기에 블라블라 사용자 정의");
		car.fullThrottle();
		car.speed(200);
		car.color("Red");
		color("빨강색");
	
	}
}
