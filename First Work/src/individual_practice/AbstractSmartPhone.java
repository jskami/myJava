package individual_practice;

public class AbstractSmartPhone {
	public static void main(String[] args) {
	// 추상클래스로 인스턴스 생성 불가
//	SmartPhone sp = new SmartPhone();
	
	Iphone ip = new Iphone();
	ip.spec();
	ip.purpose();
	
	System.out.println("================");
	
	Galaxy gy = new Galaxy();
	gy.spec();
	gy.purpose();
	}
}
