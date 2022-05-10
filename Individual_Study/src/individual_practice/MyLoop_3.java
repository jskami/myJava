package individual_practice;

public class MyLoop_3 {
	
	public static void main(String[] args) {
		
		int i;
		int j;
		
		for(i = 1; i <= 9; i++) {
			for(j = 1; j <= 9; j++) {
				if( j > i)
					break;
				System.out.println(i + "x" + j + "=" + i*j);
			}
			System.out.println();
		}
	}
}
