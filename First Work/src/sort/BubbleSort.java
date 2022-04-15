package sort;

public class BubbleSort {

	// [(n-1)-n]
	public static void bubbleSort(int[] arr) {

		final int length = arr.length;
		for (int i = 0; i < length; i++) {		// 배열의 길이만큼 반복
			for (int j = 0; j < length - 1; j++) {		// 배열의 길이 -1 만큼 반복
				if (j + 1 < length && arr[j] > arr[j + 1]) {	// 논리곱, 둘 다 참이면 위치 변경
					
					arr[j] = arr[j] + arr[j + 1];
					arr[j + 1] = arr[j] - arr[j +1];
					arr[j] = arr[j] - arr[j + 1];
				}
			}
			System.out.print(i + "번째 과정 ");
			for (int x : arr)
				System.out.print(x + " ");
			System.out.println();
		}
	
		
	}
	public static void main(String[] args) {
		int[] arr = {8, 54, 99, 3, 2, 1, 0};
		bubbleSort(arr);
		for (int i : arr)
			System.out.print(i + " ");
	}
}
