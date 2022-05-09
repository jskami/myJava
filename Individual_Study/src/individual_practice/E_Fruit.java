package individual_practice;

public enum E_Fruit {
	// Fruit의 상수를 선언하면서 동시에 생성자를 호출하고 있다.
	APPLE("red"), PEACH("pink"), BANANA("yellow");
	
	public String color;
	
	// 생성자
	E_Fruit(String color){
		System.out.println("Call Constructor" + this);
		this.color = color;
	}
	
	String getColor() {
		return this.color;
	}
	
//	E_Fruit(){
//		System.out.println("call Constructor" + this);
//	}
	/* call constructor가 출력된 것은 생성자 E_Ftuit가 호출되었음을 의미한다.
	 * 세 번 호출된 것은 필드의 숫자만큼 호출됨 즉,enum은 생성자를 가질 수 있다. */
}


/* enum은 class, interface와 동급의 형식을 가지는 단위다. 하지만 사실상 class이고,
 * 편의를 위해서 enum만을 위한 문법적 형식을 가지고 있기 때문에 구분하기 위해서 enum이라는
 * 키워드를 사용하는 것이다.
 * 위에 선언한 변수들은 아래와 동일하다.

//private final static int FRUIT_APPLE = 1;
//private final static int FRUIT_PEACH = 2;
//private final static int FRUIT_BANANA = 3; 
 * 
 * enum을 사용하는 이유
 * 1. 코드가 단순해진다.
 * 2. 인스턴스 생성과 상속을 방지한다.
 * 3. 키워드 enum을 사용하기 때문에 구현의 의도가 열거형이다.
 * 
 * 열거형은 메서드를 가질 수 있다.
 * 열거형은 연관된 값들을 저장한다. 또 그 값들이 변경되지 않도록 보장한다.
 * 열거형 자체가 클래스이기 때문에 내부에 생성자, 필드, 메서드를 가질 수 있어서 단순히
 * 상수가 아니라 더 많은 역할을 할 수 있다.
 * */