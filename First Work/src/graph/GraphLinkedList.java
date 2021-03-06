package graph;
import java.util.ArrayList;

public class GraphLinkedList {
	// 2.리스트 방식으로 구현하기 / 참고 : https://blog.naver.com/PostView.nhn?isHttpsRedirect=true&blogId=diddnjs02&logNo=222001183249
	
	private ArrayList<ArrayList<Integer>> listGraph;
	
	public GraphLinkedList(int size) {
		listGraph = new ArrayList<ArrayList<Integer>>();
		// 그래프 전체를 연결하는 첫 번째 pointer
	
		for (int i = 0; i < size+1; i++) {
			listGraph.add(new ArrayList<Integer>());
		}
		// 각 arraylist 추가하기
	}
	
	// 그래프 가져오기
	public ArrayList<ArrayList<Integer>> getGraph() {
		return listGraph;
	}
	
	// 정점 추가하기
	public void addVertex(int x) {
		listGraph.add(new ArrayList<Integer>());
	}
	
	// 정점 x와 y를 단방향으로 연결하는 함수
	public void addDirectedEdge(int x, int y) {
		listGraph.get(x).add(y);
	}
	
	// 정점 x와 y를 양방향으로 연결하는 함수
	public void addCompleteEdge(int x, int y) {
		listGraph.get(x).add(y);
		listGraph.get(y).add(x);
	}
	
	// 출력 함수
	public void printGraph() {
		for (int i = 1; i < listGraph.size(); i++) {
			System.out.print("vertex " + i + " => ");
		 for (int j = 0; j < listGraph.get(i).size(); j++) {
			 System.out.print(" " + listGraph.get(i).get(j));
		 }
		 	System.out.println();
		}
	}
	
}
