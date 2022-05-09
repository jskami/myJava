package individual_practice;

// toString을 알아보자
public class Calc {
	int a, b;
	
	public void setOp(int a, int b) {		
		this.a = a;
		this.b = b;
	}
	
	public void Calcsum() {
		System.out.println(this.a + this.b);
	}
	
	public void Calcavg() {
		System.out.println((this.a + this.b) / 2);
	}
	
	public String toString() {
		return "a : " + this.a + ", b : " + this.b;
	}
	
}
