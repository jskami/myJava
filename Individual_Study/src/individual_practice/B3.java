package individual_practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* 예외 처리 던지기(Throws) */
public class B3 {
//	void run() {
//		BufferedReader bReader = null;
//		String input = null;
//		try {
//			bReader = new BufferedReader(new FileReader("out.txt"));
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		
//		try {
//			input = bReader.readLine();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		System.out.println(input);
//	}
	
	// b.run에서 예외 처리를 하지 않고 C에게 넘겨버리기(Throw)
	void run() throws IOException, FileNotFoundException {
		BufferedReader bReader = null;
		String input = null;
		bReader = new BufferedReader(new FileReader("out.txt"));
		input = bReader.readLine();
		System.out.println(input);
	}
	
	
}
