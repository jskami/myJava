package individual_practice;

public class ObjectDemo {
	public static void main(String[] args) {
		// equals
		Student s1 = new Student("egoing");
		Student s2 = new Student("egoing");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	
		// clone
		Student s3 = new Student("egoing");
		try {
			Student s4 = (Student)s3.clone();
			System.out.println(s3.name);
			System.out.println(s4.name);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
			
	
	}
}
