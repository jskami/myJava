package myProgram;

import java.util.Arrays;

public class Grade_4 {
	public static String solution(int[] arr) {
		int total = arr.length;
		int[] result = new int[total];
		for(int i=0; i<total; i++) {
			int rank = 1;
			for(int j=0; j<total; j++) {
				if(i==j) {
					continue;
				}
				int myscore = arr[i];
				int otherscore = arr[j];
				
				// 나보다 다른 사람의 점수가 높으면 등수++
				if(otherscore > myscore) {
					rank++;
				}
			}
			result[i] = rank;
		}
		return Arrays.toString(result);
	}
	
	public static void main(String[] args) {
		int[] input = {73, 64, 85};
		System.out.println(solution(input));
	}	
}
