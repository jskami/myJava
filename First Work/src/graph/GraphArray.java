package graph;

public class GraphArray {
	// 1.인접행렬 방식으로 구현하기 / 참고 : https://blog.naver.com/PostView.nhn?isHttpsRedirect=true&blogId=diddnjs02&logNo=222001183249
	private int[][] array;	// 2차원 배열 선언
							// 0 : 서로 인접하지 않음(연결 x)
							// 1 : 서로 인접함(연결 o)

	public GraphArray(int size) {	// 행렬 그래프 생성
		array = new int[size+1][size+1];	// 사용자가 선언하는 만큼의 크기와 딱 맞게([size]) 설정 + 정점의 숫자와 동일하게 index에 배치하고 싶다면 +1을 추가
	}
	
	public int[][] getArray() {   // array를 가져오는 함수
		return array;
	}
	
	public boolean isEmpty() {	 // array가 비어있는지 확인하는 함수
		return array == null;
	}
	
	public void addDirectedEdge(int x, int y) {		// 정점 x와 y를 단방향으로 연결해주는 함수(x->y)
		array[x][y] = 1;
	}
	
	public void addCompleteEdge(int x, int y) {		// 정점 x와 y를 양방향으로 연결해주는 함수(x<->y)
		array[x][y] = 1;
		array[y][x] = 1;
	}
	
	public void deleteDirectedEdge(int x, int y) {		// 정점 x와 y의 단방향 연결을 끊는 함수
		array[x][y] = 0;
	}
	
	public void deleteCompleteEdge(int x, int y) {		// 정점 x와 y의 양방향 연결을 끊는 함수
		array[x][y] = 0;
		array[y][x] = 0;
	}
	
	public void printArray() {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	
	
}
