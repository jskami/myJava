package myProgram;

public class Grade_Test {
	
	public static void main(String[] args) {
		int[] stId = { 1, 2, 3 };	// 학생 
		int[] kor = { 80, 62, 90 };	// 국어
		int[] eng = { 75, 70, 70 };	// 영어
		int[] mat = { 66, 55, 95 };	// 수학
		int[] total = new int[3]; 	// 총점
		int[] avg = new int[3];		// 평균
		char[] point = new char[3];	// 학점
		int[] rank = new int[3];	// 등수		
	
		for(int i = 0; i < stId.length; i++) {
			total[i] = kor[i] + eng[i] + mat[i];
			avg[i] = total[i] / kor.length;
			rank[i] = 1;
			for(int j = 0; j < i; j++)
				if(total[i] < total[j])
					rank[i]++;
				else
					rank[j]++;
		}
		
		for(int i = 0; i < stId.length; i++) {
			total[i] = kor[i] + eng[i] + mat[i];
			avg[i] = total[i] / kor.length;
			if(avg[i] >= 90) {
				point[i] = 'A';
			} else if(avg[i] >= 80) {
				point[i] = 'B';
			} else if(avg[i] >= 70) {
				point[i] = 'C';
			} else if(avg[i] >= 60) {
				point[i] = 'D';
			} else {
				point[i] = 'F';
			}
		}
		
		System.out.println("================================= 성적표 ===============================");
		System.out.println("\t학번\t국어\t영어\t수학\t총점 \t평균\t학점\t등수");
		System.out.println("----------------------------------------------------------------------");
		for (int i = 0; i < stId.length; i++) {
			System.out.println("\t" + stId[i] + "\t" + kor[i] + "\t" + eng[i] + "\t" + mat[i] + "\t" + total[i] + "\t"
					+ avg[i] + "\t" + point[i] + "\t" + rank[i]);
		}
		
		
		
	}	
}
