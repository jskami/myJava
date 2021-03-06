package array;

public class OverridingTest1 {
	// calcPrice() 테스트 252p

	public static void main(String[] args) {
		Customer ctLee = new Customer(2341, "이씨");
		ctLee.bonusPoint = 49291;
		
		VIPCustomer ctPark = new VIPCustomer(777, "박씨", 001);
		ctPark.bonusPoint = 99999;
		
		System.out.println("==========================");
		
		int price = 10000;
		System.out.println(ctLee.getctName() + "가 지불해야 할 금액은 " + ctLee.calcPrice(price) + "입니다.");
		System.out.println(ctPark.getctName() + "가 지불해야 할 금액은 " + ctPark.calcPrice(price) + "입니다.");
	}

}
