package data_structure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Algorithm3 {
	/* 알고리즘 예제 3 (https://sas-study.tistory.com/170?category=769068)
	 * 함수 solution은 정수 n을 매개변수로 입력받는다. n의 각 자릿수를 큰 수부터 작은 수 순으로
	 * 정렬 후 새로운 정수를 리턴하라. (ex. n = 118372) */
	String res = "";
	public int reverseInt(int n) {
		res = "";
		Integer.toString(n).chars().sorted().forEach(c -> res = Character.valueOf((char)c) + res);
		return Integer.parseInt(res);
	}
	
	public static void main(String[] args) {
		Algorithm3 a1 = new Algorithm3();
		System.out.println("정렬 결과 :" + a1.reverseInt(118372));
	}
}

/* 람다식과 스트림을 이용.
 * 자연수 n을 Integer.toString()메서드를 통해 String으로 형변환
 * chars()메서드를 통해 char배열로 쪼갠다. 이를 sorted()메서드로 오름차순 변환
 * 각 요소를 c라는 변수로 forEach(람다식) 형태로 접근
 * 오름차순된 값을 (ex. 12345 -> 1부터 오른쪽으로 붙여넣기 -> 54321) 정렬
 * 반환 */