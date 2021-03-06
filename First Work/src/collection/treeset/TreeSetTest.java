package collection.treeset;
import java.util.TreeSet;

public class TreeSetTest {
	
	public static void main(String[] args) {
		// 간단한 트리셋 테스트 428p
		TreeSet<String> treeSet = new TreeSet<String>();

		// D -> A -> C -> B 순으로 요소 추가
		treeSet.add("사원 D");
		treeSet.add("사원 A");
		treeSet.add("사원 C");
		treeSet.add("사원 B");
		
		for (String str : treeSet) {
			System.out.println(str);	// 정렬하여 출력될 것이다.(이진트리 사용)
		}
	
	}
}
