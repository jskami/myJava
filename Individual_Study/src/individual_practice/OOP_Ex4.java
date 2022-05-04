package individual_practice;

public class OOP_Ex4 {
	// public , static, 생성자 연습
	
	int a = 20;
	int b = 30;
	
	public OOP_Ex4() {
		
	}
	
	public OOP_Ex4(int num1, int num2) {
		a = num1;
		b = num2;
	}
	
	public void sum() {
		System.out.println("합계 : " + (a + b));
	}
	
	public static void main(String[] args) {
		OOP_Ex4 obj = new OOP_Ex4();
		obj.sum();
		OOP_Ex4 obj2 = new OOP_Ex4(99, 1);	// 필드 값 초기화 하고 인자 값으로 계산
		obj2.sum();
	}
	
}
