package search;

import java.util.Scanner;

/* 배열이 미리 정의되지 않은 방법을 사용할 수 있다.
 * 사용자는 요소를 입력하고 하나의 요소를 선택하여 위치를 확인해야 한다.
 *  */
public class LinearSearch2 {
	public static void main(String args[]) {
		int c, n, search, array[];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("요소 수를 입력하세요.");
		n = sc.nextInt();
		array = new int[n];
		
		System.out.println("해당" + n + "요소를 입력하세요.");
		
		for (c = 0; c < n; c++)
		array[c] = sc.nextInt();
		
		System.out.println("찾을 값을 입력하세요.");
		search = sc.nextInt();
		
		for (c = 0; c < n; c++) {
			if (array[c] == search) {	// 검색 요소 존재시
				System.out.println(search + "의 현재 위치는 " + (c + 1) + ".");
				break;
			}
		}
		if(c == n)	// 검색 요소 존재하지 않을시
			System.out.println(search + "은(는) 현재 배열에 없습니다.");
		
		sc.close();
	}
}