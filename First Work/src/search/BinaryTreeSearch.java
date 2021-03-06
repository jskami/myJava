package search;

public class BinaryTreeSearch {
	// https://favtutor.com/blogs/binary-search-tree-java 참고
	static class Node {
		// 노드 클래스의 인스턴스 변수
		public int data;
		public Node left;
		public Node right;
		
		// 생성자
		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	// BTS 클래스의 인스턴스 변수
	public Node root;
	
	// root를 null로 초기화 하기 위한 생성자
	public BinaryTreeSearch() {
		this.root = null;
	}
	
	// 주어진 트리를 확인하는 방법, 이진 트리인가 아닌가
	public boolean isBSTOrNot() {
		return isBSTOrNot(this.root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
		private boolean isBSTOrNot(Node root, int minValue, int maxValue) {
		// root가 null이 아닌지 확인
		if(root == null) {
			return true;
		}
		// 왼쪽 노드 값과 오른쪽 노드 값으로 현재 노드 값을 확인하고 왼쪽 서브 트리와 오른쪽 서브 트리를 재귀적으로 확인
		if (root.data >= minValue && root.data <= maxValue && isBSTOrNot(root.left, minValue, root.data) && isBSTOrNot(root.right, root.data, maxValue)) {
			return true;
		}
		return false;
	}
	
	/*================insert===============*/
	// 새로운 데이터를 삽입하기 위한 메서드
	public void insert(int newData) {
		this.root = insert(root, newData);
	}
	
	public Node insert (Node root, int newData) {
		if (root == null) {
			// 루트가 null이면 새로운 데이터 삽입
			root = new Node(newData);
			// 현재 루트를 하위 트리로 반환
			return root;
		} else if (root.data >= newData) {	// 루트 값이 새 값보다 크거나 같으면
			root.left = insert(root.left, newData);	// 왼쪽 하위에 새 값을 삽입
		} else {
			root.right = insert(root.right, newData); // 오른쪽 하위에 새 값을 삽입
		}
		return root;		
	}
	
	// 순회
	public void preorder() {
		preorder(root);
	}
	
	public void preorder(Node root) {
		if (root == null) {
			return;
		}
		System.out.println(root.data + " ");
		preorder(root.left);
		preorder(root.right);
	}
	
	/*=================================================*/

		
	/*=================main method================*/
	public static void main(String[] args) {
		// 객체 생성
		BinaryTreeSearch bts = new BinaryTreeSearch();
		bts.root = new Node(100);
		bts.root.left = new Node(90);
		bts.root.right = new Node(110);
		bts.root.left.left = new Node(80);
		bts.root.left.right = new Node(95);
		System.out.println(bts.isBSTOrNot());
		System.out.println("================");
		
		// 삽입 메서드 호출
		bts.insert(2);
		bts.insert(4);
		bts.insert(1);
		bts.insert(3);
		bts.insert(5);
		bts.preorder(); // 전위 연산
	}

}
