package individual_practice;

public class If_Ex1 {
	
	public static void main(String[] args) {
		int score = 88;
		char grade;
	
		if(score > 90) {
			grade = 'A';
		} else if(score >= 80) {
			grade = 'b';
		} else if(score >= 70) {
			grade = 'c';
		} else if(score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.println(score + "점은 " + grade + "학점 입니다.");
	}
}
