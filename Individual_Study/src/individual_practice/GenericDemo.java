package individual_practice;

public class GenericDemo {
	public static void main(String[] args) {
//		Person<String> p1 = new Person<String>();
//		Person<StringBuilder> p2 = new Person<StringBuilder>();
	
		GenericStudentInfo st1 = new GenericStudentInfo(2);
		GenericStudentPerson sp1 = new GenericStudentPerson(st1);
		System.out.println(sp1.info.grade);
		
		GenericEmployeeInfo ep1 = new GenericEmployeeInfo(1);
		GenericEmployeePerson ep2 = new GenericEmployeePerson(ep1);
		System.out.println(ep2.info.rank);
		
//		Person p3 = new Person("부장");
//		GenericEmployeeInfo e3 = (GenericEmployeeInfo)p3.info;
//		System.out.println(e3.rank);
	
//		Person<GenericEmployeeInfo> p4 = new Person<GenericEmployeeInfo>(new GenericEmployeeInfo(1));
//		GenericEmployeeInfo e4 = p4.info;
//		System.out.println(e4.rank);
//		
//		Person<String> p5 = new Person<String>("차장");
//		String e5 = p5.info;
//		System.out.println(e5.rank);	// 컴파일 실패
		// p5.info가 String이고 String은 rank필드가 없는데 호출하려 하기 때문
		
		
		GenericEmployeeInfo e = new GenericEmployeeInfo(1);
		Integer i = new Integer(10); // 래퍼(wrapper)클래스 : 기본데이터 타입인 int를 참조 데이터형으로 변환해주는 역할
//		Person<GenericEmployeeInfo, int> p6 = new Person<GenericEmployeeInfo, int>(new GenericEmployeeInfo(1), 1);
		// 제네릭 문법은 기본데이터 타입일 때 사용할 수 없다. 참조 데이터 타입에만 사용 할 수 있기 때문에 위의 문법을 아래와 같이 수정한다.
		Person<GenericEmployeeInfo, Integer> p6 = new Person<GenericEmployeeInfo, Integer>(e, i);
		System.out.println(p6.id.intValue());
		
	}
}
