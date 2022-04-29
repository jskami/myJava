package individual_practice;

abstract class SmartPhone {
	String call = "전화";
	String sns = "sns";
	String search = "검색";
	String game = "게임";
	String company, name, color, size, weight, price;
	
	// 일반 메서드 (공통으로 사용될 내용들)
	public void purpose() {
		System.out.println("사용목적 : " + call + " / " + sns + " / " + search + " / " + game);
	}
	
	// 추상 메서드(오버라이딩 필수, 중괄호 없이 선언)
	abstract public void spec();	
}
