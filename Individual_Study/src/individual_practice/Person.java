package individual_practice;

// 제네릭을 배워보자
// 제네릭 : 클래스 내부에서 사용할 데이터 타입을 외부에서 지정하는 기법
class Person<T, S> {	// 복수의 제네릭 사용
	public T info;
	public S id;
	
	Person(T info, S id){
		this.info = info;
		this.id = id;
	}
	
//	public Object info;
//	
//	Person(Object info){
//		this.info = info;
//	}
}


