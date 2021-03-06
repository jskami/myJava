package collection.arraylist;
import java.util.LinkedList;

public class LinkedListTest {
	// LinkedList 테스트 416p
	public static void main(String[] args) {
		// LinkedList list = new LinkedList(); 선언은 내부 값 사용시 캐스팅이 필요하고, 잘못된 타입으로 캐스팅시 에러 발생 / 추천하지 않는 문법
		LinkedList<String> List = new LinkedList<String>();
		
		// 리스트에 요소 추가
		List.add("Data A");
		List.add("Data B");
		List.add("Data C");
		List.add("Data D");
		
		// 리스트 전체 출력
		System.out.println(List);
		
		// 리스트의 첫 번째 위치에 F 추가 (기존 위치의 B부터 한 칸씩 밀린다.)
		List.add(1, "Data F");
		System.out.println(List);
		
		// 맨 앞에 요소 추가
		List.addFirst("NO data");
		System.out.println(List);
		// 리스트 크기 확인
		System.out.println(List.size());
		// 리스트의 모든 값 제거
		// List.clear();
	
		System.out.println("=======");
		System.out.println(List.removeLast());	// 리스트 맨 뒤 요소를 삭제하고 해당 요소 출력
		System.out.println(List);
		System.out.println(List.size());
		
		System.out.println("=======");
		List.addLast("Data Z");	// 마지막 위치에 요소 추가
		System.out.println(List);
		System.out.println(List.size());
		
		System.out.println("=======");
		System.out.println(List.removeFirst());
		System.out.println(List);
		System.out.println(List.size());
		
	}

}
