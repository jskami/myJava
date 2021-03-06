package array;
import java.util.ArrayList;

public class StudentArrayListTest {

	public static void main(String[] args) {
		// 학생 arrayList 연습 225p
		ArrayList<Student> manage = new ArrayList<Student>();
		
		manage.add(new Student("박종수", 10));
		manage.add(new Student("문찬호", 11));
		manage.add(new Student("고유비", 12));
		
		for (int i = 0; i < manage.size(); i++) {
			Student stu = manage.get(i);
			stu.showStudentInfo();
		}

		
		System.out.println("==== 향상된 for문으로 출력해보기 ====");
		for (Student stu : manage) {
			stu.showStudentInfo();
		}
		
	}

}
