package data_structure;

public class Algorithm2 {
	/* 알고리즘 예제 2 (https://sas-study.tistory.com/163?category=769068)
	 * 행렬의 덧셈: 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과
	 * 문제 : 2개의 행렬 arr1, arr2를 입력받아 행렬의 덧셈 결과를 반환하는 함수를 구현한다. 
	 * (arr1, arr2의 행과 열의 길이는 500을 넘지 않는다.) */
	public int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = {};
		answer = new int[arr1.length][arr1[0].length];
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr2.length; j++) {
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Algorithm2 a2 = new Algorithm2();
		int[][] arr1 = {{1, 2}, {2, 3}};
		int[][] arr2 = {{3, 4}, {5, 6}};
		int[][] answer = a2.solution(arr1, arr2);
		if (answer[0][0] == 4 && answer[0][1] == 6 && answer[1][0] == 7 && answer[1][1] == 9) {
			System.out.println("정답");
		} else {
			System.out.println("오답");
		}
	}

	/* 	   arr1	 		arr2		return
	 * [[1,2][2,3]] [[3,4][5,6]] [[4,6][7,9]]
	 */
}
