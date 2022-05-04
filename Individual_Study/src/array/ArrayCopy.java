package array;

public class ArrayCopy {

	public static void main(String[] args) {
		// 배열 복사 System.arraycopy() 메서드 활용 212p
		int [] array1 = {10, 20, 30, 40, 50};
		int[] array2 = {1, 2, 3, 4, 5};
		
		System.arraycopy(array1, 1, array2, 1, 3);
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}

		// 복사할 배열의 길이가 붙여넣을 배열의 길이보다 길면 붙여넣은 배열 값 이후에 다시 복사할 배열의 위치 값으로 나타난다.
		
		
		
	}

}
