package sort;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class SelectionSort {
	public static void selectionSort (int[] arr) {
		final int length = arr.length;
		for (int i = 0; i < length; i++) {
			int min = i;
			
			// 최소값을 가지고 있는 인덱스 찾기
			for (int j = i + 1; j < length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			
			// min이 i값이 아니라면
			if (min != i) {
				arr[min] = arr[min] + arr[i];
				arr[i] = arr[min] - arr[i];
				arr[min] = arr[min] - arr[i];
			}
			
			// 과정 출력
			System.out.println((i+1) + "번째 과정 : ");
			for (int x : arr)
				System.out.print(x + " ");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {8, 54, 99, 3, 2, 1, 0};
		// bubbleSort(arr);
		selectionSort(arr);
		for (int i : arr)
			System.out.print(i + " ");
	}
}
