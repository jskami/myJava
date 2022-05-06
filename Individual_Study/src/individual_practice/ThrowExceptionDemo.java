package individual_practice;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowExceptionDemo {
	public static void main(String[] args) {
//		C c = new C();
//		c.run();
		
		C c = new C();
		try {
			c.run();
		} catch (FileNotFoundException e) {
			System.out.println("out.txt 파일은 설정 파일입니다. 이 파일은 프로젝트 루트 dir에 존재해야 합니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
