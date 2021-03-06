package sort;

public class InsertionSort {
	
	public static void InsertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {	// 두 번째 인덱스부터 시작
			int key = arr[i];
			int position = i;
			
			// 자신의 바로 앞 노드보다 값이 크면 나머지는 한 칸씩 밀린다.
			while (position > 0 && key < arr[position - 1]) {
				arr[position] = arr[position - 1];
				position--;
			}
			arr[position] = key;
			
			System.out.println(i + "번째 과정 : ");
			for (int x : arr)
				System.out.println(x + " ");
			System.out.println();
		}
	}
	
}
