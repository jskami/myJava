package sort;

public class MergeSort {
	/* MergeSort (참고 : https://yunmap.tistory.com/entry/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-Java%EB%A1%9C-%EA%B5%AC%ED%98%84%ED%95%98%EB%8A%94-%EC%89%AC%EC%9A%B4-Merge-Sort-%EB%B3%91%ED%95%A9-%EC%A0%95%EB%A0%AC-%ED%95%A9%EB%B3%91-%EC%A0%95%EB%A0%AC)
				 (참고(그림 이해) : https://st-lab.tistory.com/233 ) */
	public static int[] src;
	public static int[] tmp;
	
	public static void main(String[] args) {
		src = new int[] {1, 9, 8, 5, 4, 2, 3, 7, 6};
		tmp = new int[src.length];
//		System.out.println(src.length);
		printArray(src);
		mergeSort(0, src.length-1);
		printArray(src);		
	}
	
	public static void mergeSort(int start, int end) {	// start : 배열의 시작 인덱스, end : 배열의 마지막 인덱스
		if (start < end) {
			int mid = (start + end)/2;	// 이진트리때 나온 공식
			mergeSort(start, mid);	// 첫 분할 : 시작점 - 중간
			mergeSort(mid+1, end);	// 두 번째 분할 : 중간 - 마지막
			
			int p = start;	// 분할 후 첫 번째 원소의 인덱스 저장
			int q = mid +1;	// 두 번째 분할의 첫 번째 원소 인덱스 저장
			int idx = p;	
			
			while (p <= mid || q <= end) {
				if (q > end || (p <= mid && src[p] <= src[q])) {
					tmp[idx++] = src[p++];
				} else {
					tmp[idx++] = src[q++];
				}
			}
			
			for (int i = start; i <= end; i++) {
				src[i] = tmp[i];
			}
		}
	}
	
	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

}
