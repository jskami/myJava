package individual_practice;

import java.io.FileNotFoundException;
import java.io.IOException;

public class C {
//	void run() {
//		B3 b = new B3();
//		b.run();
//	}
	
	// B3로부터 넘겨받은 예외처리를 실행해야 하는 코드
//	void run() {
//		B3 b = new B3();
//		try {
//			b.run();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
	
	// -를 이번엔 main에게 예외를 넘겨보자
	void run() throws IOException, FileNotFoundException {
		B3 b = new B3();
		b.run();
	}

}
