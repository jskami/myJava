package array;

public class Book {
	// 객체 배열 만들기 207p
	
	private String bookName;
	private String author;
	
	// 디폴트 생성자
	public Book() {
	}

	// 매개변수를 받는 생성자
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;	
	}
	
	// 각 매개변수마다 get, set 메서드 정의
	public String getBookName() {
		return bookName;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	// 정보 출력용 메서드 정의
	public void showBookInfo() {
		System.out.println(bookName + "의 저자 : " + author);
	}
	
	
	
	
}
