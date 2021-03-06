package myProgram;

public class Grade_2 {
	// 학생 성적 관리
	public static void main(String[] args) {
		// 학생 두 명 이상 (테스트)
		int[] stId = { 1, 2, 3 };
		int[] kor = { 80, 62, 55 };
		int[] eng = { 75, 60, 70 };
		int[] mat = { 66, 70, 95 };
		int[] total = new int[3];
		int[] avg = new int[3];
		char[] point = new char[3];
		int[] rank = new int[3];

		// 학점 채점
		for (int i = 0; i < stId.length; i++) { // 학생 배열 반복
			total[i] = kor[i] + eng[i] + mat[i];
			avg[i] = total[i] / 3;
			if (avg[i] >= 90) {
				point[i] = 'A';
			} else if (avg[i] >= 80) {
				point[i] = 'B';
			} else if (avg[i] >= 70) {
				point[i] = 'C';
			} else if (avg[i] >= 60) {
				point[i] = 'D';
			} else {
				point[i] = 'F';
			}
			rank[i] = 1;	// 등수 초기화
		}

		System.out.println("================================= 성적표 ===============================");
		System.out.println("\t학번\t국어\t영어\t수학\t총점 \t평균\t학점\t등수");
		System.out.println("----------------------------------------------------------------------");
//			System.out.println("   1 \t 홍길동 \t 245 \t 81 \t  B ");
		for (int i = 0; i < stId.length; i++) {
			System.out.println("\t" + stId[i] + "\t" + kor[i] + "\t" + eng[i] + "\t" + mat[i] + "\t" + total[i] + "\t"
					+ avg[i] + "\t" + point[i] + "\t" + rank[i]);
		}
	}
}
