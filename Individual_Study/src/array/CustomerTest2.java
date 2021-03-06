package array;

import java.util.ArrayList;

public class CustomerTest2 {

	public static void main(String[] args) {
		// 하위 클래스 생성 242p
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer ct1 = new Customer(01, "피카츄");
		Customer ct2 = new Customer(02, "파이리");
		Customer ct3 = new GoldCustomer(03, "꼬부기");
		Customer ct4 = new GoldCustomer(04, "이상해씨");
		Customer ct5 = new VIPCustomer(05, "나옹", 0044);
		
		// ArrayList의 add 속성으로 객체 배열에 고객 추가
		customerList.add(ct1);
		customerList.add(ct2);
		customerList.add(ct3);
		customerList.add(ct4);
		customerList.add(ct5);

		int pricee = 10000;
		// 다형성 구현
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(pricee);
			System.out.println(customer.getctName() + "님이 " + cost + "원 지불했음" );
			System.out.println(customer.getctName() + "님의 현재 BP는 " + customer.bonusPoint + "입니다.");
		}
		
		System.out.println("==============================================");
		//========================================================
		Customer ctY = new Customer(1009, "양씨");
//		ctY.setctName("양씨");
//		ctY.setctID(1009);
		ctY.bonusPoint = 1000;
		System.out.println(ctY.showCustomerInfo());

		System.out.println("======================");
		
		VIPCustomer ctK = new VIPCustomer(0101, "K씨", 0014);
		System.out.println(ctK.showCustomerInfo());
		
		System.out.println("======================");

		VIPCustomer ctD = new VIPCustomer(0011, "D씨", 0210);
		System.out.println(ctD.showCustomerInfo());
	
		System.out.println("======================");

		// 다형성에 의한 재정의 264p
		Customer ctS = new VIPCustomer(1010, "S씨", 0321);
		ctS.bonusPoint = 777;
		
		System.out.println(ctS.showCustomerInfo());
		System.out.println("======== 할인율, 보너스 포인트 계산=======");
		
		int price = 10000;
		int Sprice = ctS.calcPrice(price);
		int Yprice = ctY.calcPrice(price);
		
		System.out.println(ctY.getctName() + " 님이 " + Yprice + "원 지불하셨습니다.");
		System.out.println(ctY.showCustomerInfo());
		
		System.out.println(ctS.getctName() + " 님이 " + Sprice + "원 지불하셨습니다.");
		System.out.println(ctS.showCustomerInfo());
		
	}
}
