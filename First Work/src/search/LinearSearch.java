package search;

/* 선형 탐색
 * 1. 배열 탐색
 * 2. key 요소와 배열 요소 일치
 * 3. key 요소가 발견되면 배열 요소의 index 위치 반환
 * 4. key 요소를 찾을 수 없으면 -1 반환 
 * */

public class LinearSearch {
	public static int linearSearch(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == key) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String a[]) {
		int[] a1 = {10, 20, 30, 50, 70, 90};
		int key = 50;
		System.out.println(linearSearch(a1, key) + "번 인덱스에서 값 " + key + "을(를) 찾았습니다.");
	}
}