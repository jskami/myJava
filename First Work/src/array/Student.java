package array;

public class Student {
	// 객체 배열 연습하기 211p
	
	private String stuName;
	private int stuNum;
	
	public Student() {
		
	}
	
	public Student(String stuName, int stuNum) {
		this.stuName = stuName;
		this.stuNum = stuNum;
	}
	
	public String getStuName() {
		return stuName;
	}
	
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	
	public int getStuNum() {
		return stuNum;
	}
	
	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
	}
	
	public void showStudentInfo()	{
		System.out.println(stuName + "은(는) 학번이 " + stuNum + "입니다.");
	}
	
	
}
