package collection.arraylist;

public class LinerList {

	public static void main(String[] args) {
		// 선형 리스트 (참고 : https://debugdaldal.tistory.com/8)
		
		// 1차원 배열의 순차표현
		System.out.println("===1차원 배열의 순차표현===");
		int list[] = new int[] {157, 209, 151, 73};
		
		for(int i = 0; i < list.length; i++) {
			System.out.print(list[i] + ", ");
		}
		System.out.println();
		
		
		// 2차원 배열의 순차표현
		System.out.println("===2차원 배열의 순차표현===");
		int list2[][] = new int [][] {
			{44, 84, 140, 130},
			{157, 209, 85, 17}
		};
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(list2[i][j] + ", ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		// 3차원 배열의 순차표현
		System.out.println("===3차원 배열의 순차표현===");
		int list3[][][] = new int[][][] {
			{{63, 84, 140, 130},
			{157, 39, 112, 251}},
			{{56, 11, 177, 913},
			{555, 106, 4, 279}}
		};
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				for(int k = 0; k < 4; k++) {
					System.out.print(list3[i][j][k] + ", ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}

}
