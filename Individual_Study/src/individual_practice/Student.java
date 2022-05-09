package individual_practice;

// equals를 알아보자 + clone
public class Student implements Cloneable {
	String name;
	Student (String name){
		this.name = name;
	}
	
	public boolean equals(Object obj) {
		Student _obj = (Student)obj;
		return name == _obj.name;
	}
	
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	
}

/* 1. 객체간의 동일성을 비교하고 싶을 때 == 보다 equals를 이용한다.
 * 2. equals를 직접 구현해야 한다면 hashCode도 함께 구현해야 한다.
 * 3. equals를 직접 구현해야 한다면 eclipse 개발도구는 equals와 hashCode를 자동으로 생성해주는
 * 기능이 있다. 파일 우클릭 -> Source	, generate hashCode() and equals() 선택 
 * 4. 그 이유가 분명하지 않다면 비교 연산자 ==은 원시 데이터형을 비교할 때만 사용하자. 
 * 
 * - Student 클래스가 인터페이스 Cloneable을 구현하고 있는 것을 주의 깊게 살펴보자
 * - Cloneable 인터페이스는 비어있는 인터페이스이다. */
