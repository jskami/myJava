package individual_practice;

abstract class MyFriends {
	String name = "성명";
	String age = "나이";
	String sex = "성별";
	String adr = "주소";
	String tall, weight, hoby;
	
	public void info() {
		System.out.println("개인 정보 : " + name + " / " + age + " / " + sex + " / " + adr);
	}
	
	abstract void addInfo();
}
