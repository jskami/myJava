package search;

import java.util.ArrayList;
import java.util.Arrays;

public class SequentialSearch {
	// 단순 순차 검색
	public static void main(String[] args) {
		
		int[] a = {3, 2, 4, 5, 3, 2, 7, 6, 4};
		boolean ans = contains(a, 7);
		if(ans) {
			System.out.println("번호를 찾았습니다.");
		} else {
			System.out.println("번호를 찾지 못했습니다.");
		}
	}

	public static boolean contains(int[] a, int b) {
		for(int i : a) {
			if (i == b) {
				return true;
			}
		}
		return false;
	}	
}
