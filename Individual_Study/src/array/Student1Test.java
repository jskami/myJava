package array;

public class Student1Test {

	public static void main(String[] args) {
		// 학생 성적 출력하기 229p
		Student1 st1 = new Student1(1001, "park");
		st1.addSubject("자바", 70);
		st1.addSubject("php", 50);
		
		Student1 st2 = new Student1(1002, "Moon");
		st2.addSubject("자바", 80);
		st2.addSubject("php", 40);
		st2.addSubject("자바스크립트", 60);
		
		st1.showStudentInfo();
		System.out.println("=========");
		st2.showStudentInfo();
	}

}