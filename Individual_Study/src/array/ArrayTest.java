package array;

public class ArrayTest {

	public static void main(String[] args) {
		// 배열 초기화 및 출력 202p
		int[] num = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

		System.out.println("=====구분선=====");
		
		// 연습
		int[] array1 = new int[] {10, 20, 30, 40, 50, 0, 0};
		
		for	(int i = 0; i < array1.length; i++) {
			System.out.println(array1[2]);
		}
		System.out.println(array1[1] + array1[4]);
		
		System.out.println("=====구분선=====");

		// 배열 길이만큼 출력 204p
		double[] data = new double[5];
				
		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;
		
		for(int i = 0; i < data.length; i++) {
			System.out.println(data[i]);	
		}

		System.out.println("=====구분선=====");

		// 배열의 유효한 요소 값 출력 205p
		double[] data1 = new double[5];
		int size = 0;
		
		data1[0] = 15.0; size++;
		data1[1] = 25.0; size++;
		data1[2] = 35.0; size++;
		
		for(int i = 0; i < size; i++) {
			System.out.println(data[i]);
		}
		
		System.out.println("=====구분선=====");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
