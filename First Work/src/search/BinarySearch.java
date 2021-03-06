package search;

/* 이진탐색은 기본적으로 정렬된 자료구조 내에서 특정 값을 찾을때 둘로 나누어 탐색한다.
 * Divide conquer algorithm과 매우 유사하다.
 * (참고 : https://minhamina.tistory.com/127) */

public class BinarySearch {
	static int[] arr = {1, 3, 5, 7, 8, 10, 20, 35, 99, 100};
	
	public static void main(String[] args) {
		System.out.println("1. 순환 호출을 이용한 이진 탐색");
		System.out.println(binarySearch1(7, 0, arr.length-1));
		
		System.out.println("\n2. 반복을 이용한 이진 탐색");
		System.out.println(binarySearch2(35, 0, arr.length-1));
		
	}
	
	// 재귀 탐색
	static int binarySearch1(int key, int start, int end) {
		int mid;
		if(start <= end) {
			mid = (start + end) / 2;
			
			if(key == arr[mid]) {	// 기준 값이 찾고자 하는 key값과 일치하다면
				return mid;
				
			} else if(key < arr[mid]) {
				return binarySearch1(key, start, mid -1);	// 왼쪽 부분 탐색
			} else {
				return binarySearch1(key, mid +1, end);	// 오른쪽 부분 탐색
			}
		}
		return -1; // 탐색 실패
	}
	
	// 반복 탐색
	static int binarySearch2(int key, int start, int end) {
		int mid;
		
		while(start <= end) {
			mid = (start + end) / 2;
			
			if(key == arr[mid]) {
				return mid;
			} else if(key < arr[mid]) {
				return end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}
}