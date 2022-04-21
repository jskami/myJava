package sort;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort2 {
	// 버킷정렬 연습
	static void bucketSort(double[] a) {
		int i, size = a.length;
		ArrayList[] buckets = new ArrayList[size];
		for(i = 0; i < size; i++) 
			buckets[i] = new ArrayList();
		
		for(double x : a) {
			buckets[(int)x * size].add(x);
		}
		
		int pos = 0;
		for(ArrayList bucket : buckets) {
			for(i = 0; i < bucket.size(); i++)
				a[pos++] = (double)bucket.get(i);
		}
	}
	
	public static void main(String[] args) {
		double[] arr = {0.9, 0.1, 0.37, 0.0, 0.21, 0.25, 0.83};
		bucketSort(arr);
		for(double x: arr)
			System.out.format("%s ", java.math.BigDecimal.valueOf(x).stripTrailingZeros());
	}

}
