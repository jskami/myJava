package individual_practice;

public class MyLoop_2 {
	public static void main(String[] args) {
		
		int i;
		int j;
		for(i = 1; i <= 9; i++) {
			if(i % 2 != 0)
				continue;
			for(j = 1; j <= 9; j++) {
				System.out.println(i + "x" + j + "=" + i*j);
			}
		}
	}
}
