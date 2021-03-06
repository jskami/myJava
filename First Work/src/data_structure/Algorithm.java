package data_structure;

import java.util.Scanner;	// 스캐너 클래스 호출
import java.io.*;	// System.in을 위한 호출 

public class Algorithm {
	/* 알고리즘 예제 1 (백준 1000번)
	 * 두 정수 A, B를 입력받은 후, A + B를 출력하는 프로그램 작성*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	// System.in : 값을 입력받는 클래스(잘못된 값을 입력 받을 경우를 대비해서 예외처리 필수)
		int a = 1, b = 2;						// 단. Scanner를 이용해 값을 입력받으면 예외처리 안해도 됨
		a = sc.nextInt();	// 정수형으로 입력 받고 싶으면 nextInt()사용 
		b = sc.nextInt();
		System.out.println(a + b);
	}
}
