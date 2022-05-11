package generic;

// 제네릭문법 활용해보기
public class GenericPractice {
	
	public <N1, N2> Integer exampleOne(N1 t, N2 e) {
		// t와 e에 숫자가 아닌 것이 들어오면 오류 발생
		return (Integer)t + (Integer)e;
	}
	/* 메서드 내부에서 Integer로 강제 형변환, 오류 없이 실행 가능하지만
	 * cannot be cast 오류를 발생 할 수 있으므로 아래와 같이 수정한다. */
	
	public <P1 extends Integer, P2 extends Integer> Integer exampleThree(P1 p, P2 pp) {
		return Integer.valueOf(p) + Integer.valueOf(pp);
	}
	
	public <S1, S2> String exampletwo(S1 s, S2 ss) {
		return (String)s + (String)ss;
	}
	
	public static void main(String[] args) {
		GenericPractice gp = new GenericPractice();
//		int result = gp.exampleOne("hello", "world"); // 에러 발생
		int result = gp.exampleOne(7, 3);
		System.out.println(result);
		
		String result2 = gp.exampletwo("hello", "world");
		System.out.println(result2);
		
		int result3 = gp.exampleThree(2, 8);
		System.out.println(result3);
	}

}
