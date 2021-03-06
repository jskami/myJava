package sort;

import java.util.Arrays;

public class HeapSort {
	static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	// 힙 정렬
	static void buildHeap(int[] a) {
		int end = a.length - 1;
		for(int i = end/2; i > 0; i--)
			heapify(a, i, end);
	}
	
	// heapify : 특정 노드를 중심으로 하위 트리들이 힙 성질을 만족하게 끔 작업
	static void heapify(int[] a, int k, int end) {
		int left = 2 * k +1, right = 2 * k + 2;
		int larger;
		// 왼쪽, 오른쪽 자식 노드 둘 다 있는 경우
		if(right <= end) {
			larger = (a[left] > a[right]) ? left : right;
		} else if(left <= end) larger = left; // 왼쪽 노드만 있는 경우
		else {
			return;			
		}
		
		if(a[larger] > a[k]) {	// 부모노드 a[k]보다 자식노드의 값이 더 크다면 swap!
			swap(a, larger, k);
			heapify(a, larger, end); // swap 후 다시 자식노드와 그 아래 자식 노드들의 힙 교체
		} 
	}
	
	// 가장 큰 값인 루트노드부터 이진 트리에서 제거
	static void heapSort(int[] a) {
		buildHeap(a);
		System.out.printf("최대 힙 : %s \n", Arrays.toString(a));
		for(int end = a.length - 1; end >= 1; --end) {
			swap(a, 0, end); // 마지막 노드와 루트 노드 swap
			heapify(a, 0, end-1); // 제거한 노드를 제외하고 다시 힙 조정 / end-1 주의, 배열 마지막 값부터 정렬
		}
	}
	
	public static void main(String[] args) {
		int[] a = {3, 8, 2, 10, 4, 6, 7, 1, 9, 5};
		heapSort(a);
		System.out.printf("힙 정렬 : %s \n", (Arrays.toString(a)));
	}
	
}