package myProgram;

public class Grade_1 {
	// 학생 성적 관리 	
	
	public static void main(String[] args) {
		// 단일 학생 (테스트)
		int stId = 1;
		String stName = "";
		int kor = 80;
		int eng = 75; 
		int mat = 80;
		int total = 0;
		int avg = ((int) total)/3;
		char rank = ' ';
		
		// 학점 채점
		stName = "김철수";
		total = kor + eng + mat;
		avg = total / 3;
		
		if(avg >=90) {
			rank = 'A';
		} else if (avg >= 80) {
			rank = 'B';
		} else if (avg >= 70) {
			rank = 'C';
		} else if (avg >= 60) {
			rank = 'D';
		} else {
			rank = 'F';
		}		
		
		
		System.out.println("==================== 성적표 ===================");
		System.out.println("  학번 \t 학생 \t 총점 \t 평균 \t 학점");
		System.out.println("---------------------------------------------");
//		System.out.println("   1 \t 홍길동 \t 245 \t 81 \t  B ");
		System.out.println("   " + stId + "     " + stName + "    " + total + "     " + avg + "       " + rank);
		
	}

}
