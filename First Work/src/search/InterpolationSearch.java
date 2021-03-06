package search;

import java.util.Arrays;

/* 보간 탐색
 * 이진 탐색과 다르게 탐색대상이 위치한 곳에 가까운 위치에서 탐색 개시
 * (참고 : https://banjjak1.tistory.com/53?category=978276) */
public class InterpolationSearch {
	public static int search(int[] arr, int start, int end, int target) throws Exception {
        // 찾고자하는 값의 인덱스
        int targetIndex = 0;

        // 재귀 탈출 조건
        // 재귀가 계속해서 호출될수록 아래 targetIndex - 1 또는 targetIndex + 1에 의해
        // 값이 배열의 범위에서 벗어날 수 있음
        if (arr[start] > target || arr[end] < target) {
            throw new Exception("데이터를 찾을 수 없습니다.");
        }
        // 데이터의 모든 값이 중복된 경우 (10, 10, 10, 10, 10 등)
        // targetIndex를 구할 때 DivideByZero 예외가 발생하게 되므로 처음과 끝을 확인
        else if (arr[start] == arr[end]) {
            if (arr[start] == target) {
                return start;
            }
            else {
                throw new Exception("데이터를 찾을 수 없습니다.");
            }
        }

        // double로 계산 후 다시 int로 변환한 이유는 아래와 같다.
        // 10 ~ 30까지의 범위에서 12값을 찾을 때, 아래 수식은
        // ((12 - 10) / (30 - 10) * (20 - 0)) + 0 => (1/10 * 20) + 0 이 된다.
        // 그러나, 1/10은 int에서는 0으로 변환되므로 최종값은 0이 되기 때문에 double형으로 먼저 계산 후 int형으로 바꿔주는 방식으로 구현해야 한다.
        targetIndex = (int)((double)(target-arr[start]) / (arr[end] - arr[start]) * (end - start)) + start;
        System.out.println("targetIndex : " + targetIndex);

        if (arr[targetIndex] == target) {
            return targetIndex;
        }
        else if (target < arr[targetIndex]) {
            return search(arr, start, targetIndex - 1, target);
        }
        else {
            return search(arr, targetIndex + 1, end, target);
        }
    }
	
	 private static final int MAX_COUNT = 30;

	    public static void main(String[] args) throws Exception {
	        int[] arr = new int[MAX_COUNT];
	        for(int i=0; i<MAX_COUNT; i++) {
	            // 0 ~ MAX_COUNT 범위내의 난수를 생성
	            arr[i] = (int)(Math.random() * MAX_COUNT);
	        }
	        Arrays.sort(arr);
	        
	        System.out.println("배열 값 출력");
	        for(int i : arr) {
	            System.out.print(i + " ");
	        }
	        System.out.println();
	        int search = InterpolationSearch.search(arr, 0, arr.length - 1, 5);
	        System.out.println("탐색완료 : " + search);
	    }

}
