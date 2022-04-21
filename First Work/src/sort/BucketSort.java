package sort;

import java.util.Arrays;

public class BucketSort {
	// Bucket Sort (참고 : https://m.blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=xxxstarxxx&logNo=220961534625)
	public static void sort(int[] a, int maxVal) {
		int[] bucketArr = new int[maxVal + 1];
		
		for (int i = 0; i < bucketArr.length; i++) {
			bucketArr[i] = 0;
		}
		
		for (int i = 0; i < a.length; i++) {
			bucketArr[a[i]]++;
		}
		
		int outPos = 0;
		for (int i = 0; i < bucketArr.length; i++) {
			for (int j = 0; j < bucketArr[i]; j++) {
				a[outPos++]=i;
			}
		}
	}
	
	
	public static void main(String[] args) {
		int maxVal = 5;
		int[] myArr = {5, 3, 0, 2, 4, 1, 0, 5, 2, 3, 1, 4};
		
		System.out.println("정렬 전 : " + Arrays.toString(myArr));
		sort(myArr, maxVal);
		System.out.println("정렬 후 : " + Arrays.toString(myArr));
		
	}

}
