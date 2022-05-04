package array;

	// 연습하기 : 다형성 
	class Studentt {
		public void Homework() {
			System.out.println("공부해라");
		}
	}
	
	class kid extends Studentt {
		public void Homework() {
			System.out.println("아이도 공부해");
		}
	}
	
	class senior extends Studentt {
		public void Homework() {
			System.out.println("어른도 공부해");
		}
	}

	class alien extends Studentt {
		public void Homework() {
			System.out.println("외계인도 공부해");
		}
	}
	
	public class StudentTest99 {
		public static void main(String[] args) {
			StudentTest99 st = new StudentTest99();
			st.study(new kid());
			st.study(new senior());
			st.study(new alien());
		}
		
		public void study(Studentt student) {
			student.Homework();
		}

	}
	