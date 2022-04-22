package array;

public class VIPCustomer extends Customer {
	// 고객 클래스의 멤버변수와 동일 -> 나중에 상속받아서 쓰면 필요없음
//	private int ctID;
//	private String ctName;
//	private String ctGrade;
//	int bonusPoint;
//	double bonusRatio;
	
	// vip 고객 관련 기능 구현때만 필요한 멤버변수
	private int agentID;
	double saleRatio;
	
	// vip 디폴트 생성자
//	public VIPCustomer() {
//		ctGrade = "VIP";
//		bonusRatio = 0.05;
//		saleRatio = 0.1;
//		System.out.println("VIPCustomer() 생성자 호출");
//	}
	
	// 디폴트 생성자를 명시하여 호출하기 245p + vip매개변수 하나 추가
	public VIPCustomer(int ctID, String ctName, int agentID) {	// 상위 클래스의 생성자의 형태 정의
		super(ctID, ctName);	// 컴파일러가 자동으로 추가하는 코드. 상위 클래스의 Customer()가 호출된다. 상위 클래스의 생성자 호출
		ctGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
//		System.out.println("VIPCustomer(int, String, int) 생성자 호출");
	}
	
	
//	@Override	// 상위 클래스의 calcPrice메서드를 상속받았지만 vip에 해당하는 기능이 없으므로 오버라이딩을 통해 상속받은 메서드를 재 정의 하였다.
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);	// 할인율 적용
	}
	
	// vip에게만 필요한 메서드
	public int getAgentID() {
		return agentID;
	}
	
//	public String showCustomerInfo() {
//		return ctName + " 님의 등급은 " + ctGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
//	}
	
//	public String showVIPInfo() {
//		return super.showCustomerInfo() + "담당 상담원 ID는 " + agentID + "입니다.";
//	}
	
	// 고객 정보 출력 메서드 재정의 263p
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "담당 상담원 ID는 " + agentID + "입니다.";
	}
	
	
}
