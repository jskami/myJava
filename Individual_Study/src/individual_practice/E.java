package individual_practice;

import java.io.IOException;

// 예외의 여러가지 상황
public class E {
	void throwArithmeticException() {
		throw new ArithmeticException();
	}
	
	void throwIOException1() {
		try {
			throw new IOException();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	void throwIOException2() throws IOException{
		throw new IOException();
	}
	
	/* Arithmetic~과 IOEx~ 둘 다 예외이다. 그러나 자바는 두 예외를 다른 방법으로
	 * 보고있다. 그래서 에러를 없애려면 IOException만 try~catch 또는 throw를 사용해야 한다. 
	 * 
	 * 수정후, IOException은 예외처리를 강제하고 있지만 ArithmeticException은 그렇지 않다 점이다. 그 이유를 알아보자.*/
	
}
