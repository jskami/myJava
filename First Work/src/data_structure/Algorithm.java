package data_structure;
import java.util.Scanner;	// 스캐너 : 사용자로부터 데이터를 입력 받는 기능을 제공

public class Algorithm {

	public static void main(String[] args) {
		// 알고리즘의 이해를 돕기 위한 코드
		Scanner sc = new Scanner(System.in);	// System.in : 화면에서 입력 받겠다는 의미, 입력 값은 byte 단위로 읽는다.
		int num1;
		int num2;
		int num3;
		
		System.out.println("세 정수의 최대 값은?");
		System.out.print("첫 번째 값 : ");
		num1 = sc.nextInt();
		System.out.print("두 번째 값 : ");
		num2 = sc.nextInt();
		System.out.print("세 번째 값 : ");
		num3 = sc.nextInt();
		
		// 입력받은 세 가지 수중 최대값 찾기
		int Max = num1;	// num1을 Max에 대입
		if (num2 > Max)	// num2가 Max보다 크다면
			Max = num2;	// num2를 Max에 대입
		if (num3 > Max)	// num3이 Max보다 크다면 
			Max = num3;	// num3을 Max에 대입
		
		System.out.printf("세 정수 중 최대값은 : %d 입니다.%n" , Max);	// printf() : 형식화 출력("출력 서식", 출력 내용);
		sc.close();	// 입출력 관련 객체들은 사용 후 반드시 닫아줘야한다.		// 값의 수와 지시자의 개수, 순서가 일치해야 함
			
	}

}
