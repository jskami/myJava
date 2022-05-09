package individual_practice;

// 상수와 enum을 배워보자.
public class ConstantDemo {
	
	// fruit
//	private final static int FRUIT_APPLE = 1;
//	private final static int FRUIT_PEACH = 2;
//	private final static int FRUIT_BANANA = 3;
	
	// company
//	private final static int COMPANY_GOOGLE = 1;
//	private final static int COMPANY_APPLE = 2;
//	private final static int COMPANY_ORACLE = 3;
	
	/* 과일 apple과 기업 apple가 중복이 되는 것을 막고자 분류를 해주었다.
	 * 이러한 기법을 네임스페이스라고 한다. 
	 * 
	 * 상수가 너무 지저분해 보이면 과일과 기업에 대한 인터페이스를 만들고 
	 * 스위치-케이스문에서 참조를 하면 된다.
	 * 
	 * 인터페이스에서 선언된 변수는 무조건 public static final의 속성을 갖기 때문에
	 * 훨씬 구분하기 편리하다. */
	
	public static void main(String[] agere) {
		/* 1.사과
		 * 2.복숭아
		 * 3.바나나 */
			
//		int type = FRUIT.APPLE;
//		switch(type) {
//			case FRUIT.APPLE:
//				System.out.println(57 + "Kcal");
//				break;
//			case FRUIT.PEACH:
//				System.out.println(34 + "Kcal");
//				break;
//			case FRUIT.BANANA:
//				System.out.println(93 + "Kcal");
//				break;
//		}
		
		
		E_Fruit type = E_Fruit.APPLE;
		switch(type) {
			case APPLE:
				System.out.println(57 + "Kcal" + E_Fruit.APPLE.getColor());
				break;
			case PEACH:
				System.out.println(34 + "Kcal" + E_Fruit.PEACH.getColor());
				break;
			case BANANA:
				System.out.println(93 + "Kcal" + E_Fruit.BANANA.getColor());
				break;
		}
		
		for(E_Fruit f : E_Fruit.values()) {
			System.out.println(f + ",  " + f.getColor());			
		}
		
	}		

}
		