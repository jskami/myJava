package array;

public class ObjectCopy {

	public static void main(String[] args) {
		// 객체 배열 복사 213p
		
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		System.out.println(bookArray1);
		System.out.println(bookArray2);
		
		bookArray1[0] = new Book("책1", "작가A");
		bookArray1[1] = new Book("책2", "작가B");
		bookArray1[2] = new Book("책3", "작가C");
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for (int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
				
	}

}
