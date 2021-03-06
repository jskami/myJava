package array;

public class BookArray2 {

	public static void main(String[] args) {
		// 객체 배열 만들기(3) : 각 배열 요소에 인스턴스 생성 후 넣어보자 209p
		Book[] library = new Book[5];
		
		// 인스턴스 생성 후 배열에 저장
		library[0] = new Book("책1", "작가A");
		library[1] = new Book("책2", "작가B");
		library[2] = new Book("책3", "작가C");
		library[3] = new Book("책4", "작가D");
		library[4] = new Book("책5", "작가E");
		
		// Book 인스턴스 멤버들
		for (int i = 0; i < library.length; i++) {
			library[i].showBookInfo();
		}
		
		// Book 인스턴스를 저장한 메모리 공간 주소
		for (int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
		
		
		
		
	}

}
