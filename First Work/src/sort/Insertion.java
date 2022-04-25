package sort;

public class Insertion {
//    public static void sort(int[] arr) {
//        for (int end = 1; end < arr.length; end++) {
//            for (int i = end; i > 0; i--) {
//                if (arr[i - 1] > arr[i])
//                    swap(arr, i - 1, i);
//            }
//        }
//    }
//
//    private static void swap(int[] arr, int a, int b) {
//        int tmp = arr[a];
//        arr[a] = arr[b];
//        arr[b] = tmp;
//    }
//    
    
    // ================================================
    
	public static void main(String[] args) {
		int[] arr = {8, 2, 1, 4, 5};
		
		System.out.println(arr[2] + "\n");
				
		if(arr.length > 1) {
			int i, j;
			for(i=1; i<arr.length; i++) {
				int tmp = arr[i];
				for(j=i-1; j>=0; j--) {
					arr[j+1] = arr[j];
					if(tmp > arr[j]) {
						break;
					}
				}
				arr[j+1] = tmp;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
			if(i+1 != arr.length) {
				System.out.print(", ");
			}
		}
	}
	
}
