package collection.arraylist;
import java.util.ArrayList;

public class Stack {

	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	// 스택의 맨 뒤에서 요소를 꺼낸다.
	public String pop() {
		int len = arrayStack.size();	// arrayStack에 저장된 유효한 자료 개수
		if (len == 0) {
			System.out.println("스택이 비어있습니다.");
			return null;
		}
		return(arrayStack.remove(len-1));	// 맨 뒤에 있는 자료를 반환, 배열에서 제거 
	}
	
}
