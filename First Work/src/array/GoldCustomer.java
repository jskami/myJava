package array;

// 골드 등급 고객 추가 267p
/* 할인율 10%, 보너스 포인트 2% 적립, 담당 상담원 없음*/
public class GoldCustomer extends Customer {
	double saleRatio;
	
	public GoldCustomer(int ctID, String ctName) {
		super(ctID, ctName);
		ctGrade = "Gold";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}
	
	// 재정의 한 메서드
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
}
