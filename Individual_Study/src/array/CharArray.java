package array;

public class CharArray {

	public static void main(String[] args) {
		// 문자와 아스키 코드 값 출력 206p
		char[] alphabets = new char[26];
		char ch = 'A';
		System.out.println((int)ch); // 정수형으로 형 변환 출력 테스트
		
		for (int i = 0; i < alphabets.length; i++, ch++) {
			alphabets[i] = ch;
		}
		System.out.println(alphabets[18]); // 임의의 문자 출력
		
		for (int i = 0; i < alphabets.length; i++) {
			System.out.println(alphabets[i] + " = " + (int)alphabets[i]); // 형변환 진행
		}
		
		System.out.println("===== 구분선 =====");
		
		// 연습 : 소문자 출력
		char[] alphabet2 = new char[26];
		char ch2 = 'a';
		System.out.println((int)ch2);
		
		for (int i = 0; i < alphabet2.length; i++, ch2++) {
			alphabet2[i] = ch2;			
		}
		System.out.println(alphabet2[18]);
		
		for (int i = 0; i < alphabet2.length; i++) {
			System.out.println(alphabet2[i] + " = " + (int)alphabet2[i]);
		}
		
		System.out.println("===== 구분선 =====");
		
		
		
	}
	
}
