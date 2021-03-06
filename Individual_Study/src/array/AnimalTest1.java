package array;

import java.util.ArrayList;

// 상위 클래스 ==============================
	class Animal {
		public void move() {
			System.out.println("동물이 움직여!");
		}
	}
	
	// Animal을 상속받은 클래스들 ==================
	class Human extends Animal {
		public void move() {
			System.out.println("사람이 걷는다.");
		}
		
		public void readBook() {
			System.out.println("독서하는 인간");
		}
	}
	
	class Tiger extends Animal {
		public void move() {
			System.out.println("호랑이가 뛴다.");
		}
		
		public void hunting() {
			System.out.println("사냥하는 호랭이");
		}
	}
	
	class Eagle extends Animal {
		public void move() {
			System.out.println("독수리 날다!");
		}
		
		public void sleeping() {
			System.out.println("자고있는 독수리");
		}
	}
	// =======================================
	
	// instanceof()로 다운캐스팅 하기 275p
	public class AnimalTest1 {
		ArrayList<Animal> aniList = new ArrayList<Animal>();
		
		public static void main(String[] args) {
			AnimalTest1 aTest = new AnimalTest1();
			aTest.addAnimal();
			System.out.println("원래 형으로 다운 캐스팅");
			aTest.testCasting();
		}
		
		public void addAnimal() {
			aniList.add(new Human());
			aniList.add(new Tiger());
			aniList.add(new Eagle());
			
			for(Animal ani : aniList) {
				ani.move();
			}
			System.out.println("============================");
		}
		
	public void testCasting() {
		for(int i = 0; i < aniList.size(); i++) {	// 모든 배열 요소를 하나씩 돌면서
			Animal ani = aniList.get(i);			// Animal형으로 가져온다.
			if(ani instanceof Human) {				// Human이면
				Human h = (Human)ani;				// Human형으로 다운 캐스팅한다.
				h.readBook();
			} else if (ani instanceof Tiger) {
				Tiger t = (Tiger)ani;
				t.hunting();
			} else if (ani instanceof Eagle) {
				Eagle e = (Eagle)ani;
				e.sleeping();
			} else {
				System.out.println("지원되지 않는 형입니다.");
			}
		}
	}
	
	// 다형성 테스트 259p
//	public class AnimalTest1 {
//		public static void main(String[] args) {
//			AnimalTest1 aTest = new AnimalTest1();
//			aTest.moveAnimal(new Human());
//			aTest.moveAnimal(new Tiger());
//			aTest.moveAnimal(new Eagle());
//	}
//
//	public void moveAnimal(Animal animal) {	// (Animal 매개변수의 자료형이 상위 클래스)
//		animal.move();	// 재정의된 메서드 호출
//	}
				
}
