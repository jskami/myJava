package graph;

public class GraphLinkedListTest {

	public static void main(String[] args) {
		
		GraphLinkedList gl = new GraphLinkedList(0);
		
		// 정점 4개 추가
		gl.addVertex(1);
		gl.addVertex(2);
		gl.addVertex(3);
		gl.addVertex(4);
		
		// 양방향 정점 정의
		gl.addCompleteEdge(1, 2);
		gl.addCompleteEdge(1, 4);
		gl.addCompleteEdge(2, 3);
		gl.addCompleteEdge(2, 4);
		gl.addCompleteEdge(3, 4);
		
		// 정점 1개 추가 & 양방향 정의
		gl.addVertex(5);
		gl.addCompleteEdge(5, 4);
		
		// 출력
		gl.printGraph();
	}

}
