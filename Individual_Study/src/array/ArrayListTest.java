package array;
import java.util.ArrayList;	// import 반드시 작성

public class ArrayListTest {

	public static void main(String[] args) {
		// ArrayList 클래스 사용하기 224p
		
		// ArrayList 선언
		ArrayList<Book> library = new ArrayList<Book>();
		
		// add()메서드로 요소 값 추가
		library.add(new Book("책1", "작가A"));
		library.add(new Book("책2", "작가B"));
		library.add(new Book("책3", "작가C"));
		library.add(new Book("책x", "작가??"));
		
		// 배열에 추가된 요소 만큼 출력
		for (int i = 0; i < library.size(); i++) {
			Book book = library.get(i);	// 요소를 하나씩 가져오는 메서드 get()
			book.showBookInfo();
		}
		System.out.println("=====구분선=====");
		
		// 향상된 for문 사용
		for (Book book : library) {
			book.showBookInfo();
		}
		
		
		
	}

}
