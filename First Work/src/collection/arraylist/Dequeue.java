package collection.arraylist;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Dequeue {

	public static void main(String[] args) {
		/* 자료구조 - 선형구조 : 데크 (참고 : https://crazykim2.tistory.com/581)
								(참고 : https://soft.plusblog.co.kr/24)*/
		System.out.println("=======Stack!=======");
		Deque<String> stack = new ArrayDeque<>();	// deque 선언, new Deque로 선언 불가능 / new ArrayDeque 또는 new LinkedList로 선언해야 함
		stack.addFirst("Element1");	// 데크의 맨 앞에 데이터 삽입, 용량 초과시 Exception 발생
		stack.offerFirst("Element2"); // 데크의 맨 앞에 데이터 삽입, 용량 초과시 false 리턴
		stack.addLast("Element3");	// 데크의 맨 뒤에 데이터 삽입, 용량 초과시 Exception 발생
		stack.offerLast("Element4");  // 데크의 맨 뒤에 데이터 삽입, 용량 초과시 false 리턴
		stack.add("Element5");		// addLast()와 동일, 용량 초과시 Exception 발생
		stack.add("Element6");		
		stack.add("Element7");		
		stack.add("Element8");				
		stack.add("Element9");		
		System.out.println(stack);
		System.out.println("=======값 삭제=======");
		stack.removeFirst();		// remove는 데크가 비어있다면 Exception 출력
		System.out.println(stack);
		stack.pollFirst();			// poll은 데크가 비어있다면 null 리턴
		System.out.println(stack);
		stack.remove();
		System.out.println(stack);
		stack.poll();
		System.out.println(stack);
		stack.removeLast();
		System.out.println(stack);
		stack.pollLast();
		System.out.println(stack);
		stack.clear();				// 값 전체 삭제
		System.out.println(stack);
		System.out.println("스택의 크기 : " + stack.size());
		
		System.out.println("=======Deque!=======");
		Deque<String> deque = new ArrayDeque<>();
		deque.addFirst("Element1");
		deque.offerFirst("Element2");
		deque.addLast("Element3");
		deque.offerLast("Element4");
		deque.add("Element5");
		deque.add("Element6");
		deque.add("Element7");
		deque.add("Element8");
		deque.add("Element9");
		deque.add("Element9");
		deque.add("Element9");
		deque.add("Element10");
		deque.add("Element11");
		System.out.println(deque);
		System.out.println("데크의 크기 : " + deque.size());	// 데크의 크기
		System.out.println("첫 번째 값 : " + deque.getFirst() + ", " + deque.peekFirst() + ", " + deque.peek());
		// 첫 번째 값을 가져오는 방법으로 getFirst(), peekFirst(), peek()메서드가 있고 모두 동일하다.
		System.out.println("마지막 값 : " + deque.getLast() + ", " + deque.peekLast());
		// 마지막 값을 가져오는 방법으로 getLast(), peekLast()메서드가 있다.
		
		System.out.println("=======값 삭제=======");
		deque.remove();
		System.out.println(deque);
		deque.removeFirst();
		System.out.println(deque);
		deque.remove();
		System.out.println(deque);
		deque.poll();
		System.out.println(deque);
		deque.pollLast();
		System.out.println(deque);
		deque.removeLast();
		System.out.println(deque);
		deque.remove("Element6");	// 데이터 지정 삭제
		System.out.println(deque);
		deque.removeFirstOccurrence("Element9");  // 데크의 앞에서부터 탐색하여 입력한 요소를 제거, 요소가 없다면 데크의 변경은 발생하지 않는다.
		System.out.println(deque);
		deque.removeLastOccurrence("Element9");  // 데크의 뒤에서부터 탐색하여 입력한 요소 제거, 위와 동일
		System.out.println(deque);		
		
		System.out.println("데크의 크기 :" + deque.size());
		
	}

}
