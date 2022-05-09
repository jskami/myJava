package individual_practice;

public class ReferenceDemo1 {
	
	public static void runValue() {
		int a = 1;
		int b = a;
		b = 2;
		System.out.println("runValue, " +a);	
	}
	
	public static void runReference() {
		ReferA a = new ReferA(1);
		ReferA b = a;
		b.id = 2;
		System.out.println("runReference, " + a.id);
	}	// 변수 b의 id를 2로 변경했는데 a의 id도 2로 변경됐다! 즉, 변수 b와 a에 담긴 인스턴스가 서로 같다는걸 의미함
	
	
	public static void main(String[] args) {
		runValue();
		runReference();
	}
	
}
