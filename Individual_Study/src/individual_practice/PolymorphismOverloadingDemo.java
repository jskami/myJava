package individual_practice;

public class PolymorphismOverloadingDemo {

	public static void main(String[] args) {
		O o = new O();
		o.a(10);
		o.a("one");
	}
}
/* O클래스의 메서드 a는 동일한 이름의 메서드이지만 다른 동작 방법을 갖고있다.
 * 때문에 오버로딩역시 다형성의 한 예라 할 수 있다. */