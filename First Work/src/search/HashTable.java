package search;

import java.util.LinkedList;

/* key값을 hash function을 통해 hashcode를 주고, 저장공간의 size로 나누어
 * index를 정한 후 value값을 저장한다.
 * =============================
 * ! 서로 다른 key값이 하나의 index에 저장될 수도 있다 -> 해시충돌
 * (참고 : https://dev2som.tistory.com/56) */
class HashTable { 
		class Node{ // key, value를 가지는 클래스 정의
		String key; 
		String value; 
		public Node(String key, String value){ 
			this.key = key; 
			this.value = value; 
		} 
		String value(){ 
			return value; 
		} 
		void value(String value){ 
			this.value=value; 
		} 
	} 
		
	// 해시테이블 (노드형 연결리스트로 선언)
	LinkedList<Node>[] data; 
	HashTable(int size){ 	// size를 인자로 받아 크기 초기화
		//배열방을 미리 만듦 
		this.data = new LinkedList[size]; 
		} 
	
	// 키 값을 통해 해시코드 생성
	int getHashCode(String key){ 
		int hashcode=0; 
		for(char c : key.toCharArray()){ // 문자열을 문자형으로 바꾸어 배열에 저장
			hashcode+=c; 
		} 
		return hashcode; 
	} 
	
	// 해시코드를 이용한 index 지정
	int convertToIndex(int hashcode){ 
		return hashcode%data.length; 
		} 
	
	//인덱스로 배열방을 찾은 이후, 배열방에 노드가 여러개 존재하는 경우, 검색 키를 가지고 해당 노드를 찾아오는 함수 
	Node searchKey(LinkedList<Node> list, String key){ 
		if(list==null) 
			return null; 
		for(Node node : list){ 
			if(node.key.equals(key)){ // 키 값의 내용을 비교
				return node; 
				} 
			} 
		return null; 
		} 
	
	//데이터를 받아 저장 (키를 통한 값 저장)
	void put(String key, String value){ 
		int hashcode = getHashCode(key); 
		int index=convertToIndex(hashcode); 
		System.out.println(key+", hashcode("+ hashcode +"), index("+index+")"); 
		
		//기존 배열방에 있는 것을 가져옴 
		LinkedList<Node> list = data[index]; 
		if(list==null){ 	// 없으면 저장
			list = new LinkedList<Node>(); 
			data[index] = list; 
			} 
		
		//기존에 해당 키로 데이터를 가지고 있는지 노드를 받아온다 
		Node node = searchKey(list, key); 
		if(node == null){ 
			list.addLast(new Node(key, value)); 
			} else{ 
				node.value(value); 
			} 
		} 
	
	// 키를 통한 값 호출
	String get(String key){ 
		int hashcode = getHashCode(key); 
		int index = convertToIndex(hashcode); 
		LinkedList<Node> list = data[index]; 
		Node node = searchKey(list, key); 
		return node == null? "Not found" : node.value(); 
		} 

	public static void main (String[] args){ 
	HashTable h = new HashTable(3); 
	h.put("sung", "She is smart"); 
	h.put("jin", "She is ambitious"); 
	h.put("hee", "She is loud"); 
	h.put("min", "She is strict"); 
	h.put("min", "She is not strict"); 
	
	System.out.println(h.get("sung")); 
	System.out.println(h.get("jin")); 
	System.out.println(h.get("hee")); 
	System.out.println(h.get("min")); 
	}
}