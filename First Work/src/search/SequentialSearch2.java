package search;

import java.util.ArrayList;
import java.util.Arrays;

public class SequentialSearch2 {

	//정렬된 배열에서 순차 검색
		public static void main(String[] args) {
			int[] a = {1, 2, 3, 4, 6, 8, 9};
			boolean ans = contains(a, 8);
			if(ans) {
				System.out.println("===번호를 찾았습니다.");
			} else {
				System.out.println("===번호를 찾지 못했습니다.");
			}
		}
		
		public static boolean contains(int[] a, int b) {
			for (int i : a) {
				System.out.println("Comparing with : " + i);
				if (i == b) {
					return true;
				} else if(i > b) {
					return false;
				}
			}
			return false;
		}
	}
