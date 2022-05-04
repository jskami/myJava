package array;

public class BookArray {

	public static void main(String[] args) {
		// 객체 배열 만들기(2) 208p
		Book[] library = new Book[5];
		
		for (int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
		
		// Book 인스턴스 5개를 생성, 하지만 인스턴스를 가리키는 '주소값'은 아직 없고 이 주소값을 담을
		// 공간 5개만 생성한 것이다. 때문에 출력시 값은 null로 나타난다.
		
		
	}

}
