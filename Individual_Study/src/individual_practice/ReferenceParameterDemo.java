package individual_practice;


// 참조를 배워보자
public class ReferenceParameterDemo {
	
	static void _value(int b) {
		b = 2;
	}
	
	public static void runValue() {
		int a = 1;	// 기본 데이터형으로 매개변수 전달, 기본 데이터형은 값이 복제된다.
		_value(a);
		System.out.println("runValue, " +a);
	}
	
	//======================================//
	
	static void _reference1(ReferA b) {
		b = new ReferA(2);
	}
	
	public static void runReference1() {
		ReferA a = new ReferA(1);	// 참조 데이터형으로 매개변수 전달, 복제가 아닌 참조가 될 뿐이다.
		_reference1(a);
		System.out.println("runReference1, " +a.id);
	}
	
	//======================================//

	static void _reference2(ReferA b) {
		b.id = 2;
	}
	
	public static void runReference2() {
		ReferA a = new ReferA(1);
		_reference2(a);
		System.out.println("runReference2, " +a.id);
	}
	
	//================================================//
	public static void main(String[] args) {
		runValue();
		runReference1();
		runReference2();
	}
}
