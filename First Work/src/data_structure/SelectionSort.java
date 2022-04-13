package data_structure;

public class SelectionSort {
	/*=======================선택 정렬========================*/
	public static void selectionSort (int[] arr) {
		
		final int length = arr.length;
		for (int i = 0; i < length; i++) {
			int min = i;

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
		// bubbleSort
		selectionSort(arr);
		for (int i : arr)
			System.out.print(i + " ");
	}
	
	
	
}