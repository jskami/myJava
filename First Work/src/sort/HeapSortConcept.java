package sort;

import java.util.Arrays;

// 힙 정렬 개념 정리 및 공부용
public class HeapSortConcept {
	
	// 부모 인덱스를 얻는 함수
	private static int getParent(int child) {
		return (child - 1) / 2;
	}
	
	// 두 인덱스의 원소를 교환하는 함수
	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	// 힙 만들기
//	private static void heapify(int[] a, int parentIdx, int lastIdx) {
//		/* 현재 트리에서 부모 노드의 자식 노드 인덱스를 각각 구한다.
//		 * 현재 부모 인덱스는 가장 큰 값을 갖고 있다고 가정한다.*/
//		int leftChildIdx = parentIdx *2 + 1;
//		int rightChildIdx = parentIdx *2 + 2;
//		int largestIdx = parentIdx;
//		
//		/* 왼쪽 자식 노드와 비교
//		 * 자식 노드 인덱스가 맨끝 원소 인덱스를 넘어가지 않고
//		 * 현재 가장 큰 인덱스보다 왼쪽 자식 노드의 값이 더 큰 경우
//		 * 가장 큰 인덱스를 가리키는 largestIdx 를 왼쪽 자식 노드 인덱스로 바꾼다.*/
//		if(leftChildIdx < lastIdx && a[largestIdx] < a[leftChildIdx]) {
//			largestIdx = leftChildIdx;
//		}
//		
//		/* 오른쪽 자식 노드와 비교
//		 * 자식 노드 인덱스가 맨끝 원소 인덱스를 넘어가지 않으면서
//		 * 현재 가장 큰 인덱스보다 오른쪽 자식노드의 값이 더 큰 경우
//		 * 가장 큰 인덱스를 가리키는 largestIdx를 오른쪽 자식 노드 인덱스로 바꾼다.*/
//		if(rightChildIdx < lastIdx && a[largestIdx] < a[rightChildIdx]) {
//			largestIdx = rightChildIdx;
//		}
//		
//		/* largestIdx와 부모 노드가 같지 않다면
//		 * 위 자식 노드 비교 과정에서 현재 부모 노드보다 큰 노드가 존재한다는 의미
//		 * 그렇다면, 자식 노드와 부모 노드를 swap한다.
//		 * swap된 자식 노드를 부모 노드로 삼은 서브트리를 검사하도록 재귀호출 한다. */
//		if(parentIdx != largestIdx) {
//			swap(a, largestIdx, parentIdx);
//			heapify(a, largestIdx, lastIdx);	// Top-Down 재귀호출 발생
//		}
//	}
	
	/* ▲ 상단의 heapify메서드가 재귀호출시 정렬할 원소가 많아지고, 매 재귀 마다 부모노드와 자식노드가
	교환되면 최악의 경우 트리 높이 만큼 재귀 호출을 하고 StackOverFlow가 발생할 수 있으며 메모리를
	많이 사용하게 된다. 따라서 재귀가 아닌 반복문으로 형식으로 구현해보자
	▼ */
	private static void heapify(int[]a, int parentIdx, int lastIdx) {
		int leftChildIdx;
		int rightChildIdx;
		int largestIdx;
		
		/* 
		 * 현재 부모 인덱스의 자식 노드 인덱스가 마지막 인덱스를 넘지 않을 때 까지 반복	
		 * 
		 * 확인 : 왼쪽 자식 노드를 기준으로 할 것
		 * (오른쪽 자식 노드를 기준으로 범위를 검사하면 마지막 부모 인덱스가
		 * 왼쪽 자식만 갖고 있을 경우, 왼쪽 자식 노드와는 비교 및 교환을 할 수 없기 때문
		 * */
		
		while((parentIdx * 2)+1 <= lastIdx) {
			leftChildIdx = (parentIdx * 2) +1;
			rightChildIdx = (parentIdx * 2) +2;
			largestIdx = parentIdx;
			
			/* 왼쪽 자식 노드와 비교
			 * (범위는 while문에서 검사했으므로 별도의 검사는 필요 없음)
			 * */
			if (a[leftChildIdx] > a[largestIdx]) {
				largestIdx = leftChildIdx;
			}
			
			/*
			 * 오른쪽 자식 노드와 비교 (범위 검사 필요)
			 * */
			if (rightChildIdx <= lastIdx && a[rightChildIdx] > a[largestIdx]) {
				largestIdx = rightChildIdx;
			}
			
			/*
			 * 교환 발생시 두 원소를 교체, 교환된 자식 노드를 부모 노드가 되도록 교체한다.
			 * */
			if (largestIdx != parentIdx) {
				swap(a, parentIdx, largestIdx);
				parentIdx = largestIdx;
			} else {
				return;
			}
		}
	}
	
	
	public static void heapsort(int[] a) {
		int size = a.length;
		
		/* 부모 노드와 heapify 과정에서 음수가 발생하면 잘못 된 참조가 발생하기 때문에
		 * 원소가 1개이거나 0개일 경우, 정렬 할 필요가 없으므로 바로 함수를 종료한다. */
		if(size < 2) {
			return;
		}
		
		// 가장 마지막 노드의 부모 노드 인덱스
		int parentIdx = getParent(size - 1);
		
		// max heap 만들기
		for(int i = parentIdx; i >= 0; i--) {
			// 부모노드(i값)를 1씩 줄이면서 heap 조건을 만족시키도록 재구성한다.
			heapify(a, i, size - 1);
		}
		
		// 정렬 과정
		for(int i = size - 1; i > 0; i--) {
			/* root인 0번째 인덱스와 i번째 인덱스의 값을 교환
			 * 0 ~ (i-1) 까지의 서브트리에 대해 max heap을 만족하도록 재구성한다.*/
			swap(a, 0, i);
			heapify(a, 0, i - 1);		
		}
		
	}
	
	public static void main(String[] args) {
		int[] a = {1, 4, 9, 10, 21, 42, 33, 15};
		heapsort(a);
		System.out.println("=====힙정렬=====");
		System.out.print(Arrays.toString(a));
	}
	
		
}
