package array;

// 고객 클래스 구현 234p
public class Customer {
	// 고객 멤버 변수
	protected int ctID;
	protected String ctName;
	protected String ctGrade;
	int bonusPoint;
	double bonusRatio;
	
	// 디폴트 생성자
	public Customer() {
		ctGrade = "Silver";
		bonusRatio = 0.01;
		System.out.println("Customer() 생성자호출");
	}
	
	// 보너스 포인트 적립, 지불 가격 계산 메서드
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return ctName + " 님의 등급은 " + ctGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}
	
	// protected 멤버변수들의 get, set 메서드, 외부에서 사용하도록 함 
	public int getctID() {
		return ctID;
	}
	
	public void setctID(int ctID) {
		this.ctID = ctID;
	}
	
	public String getctName() {
		return ctName;
	}
	
	public void setctName(String ctName) {
		this.ctName = ctName;
	}
	
	public String getctGrade() {
		return ctGrade;
	}
	
	public void setctGrade(String ctGrade) {
		this.ctGrade = ctGrade;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
