package search;

public class HashSearching {
	private int[] arr = null;
	private int size = 0;
	
	public HashSearching(int size) {
		this.arr = new int[size];
		this.size = size;
	}
	
	// 해시 탐색법 저장
	public boolean set(int num) {
		int idx = getEmptySpace(num);
		if(idx < 0) {
			return false;
		}
		this.arr[idx] = num;
		return true;
	}
	
	// arr의 빈 공간 찾기
	private int getEmptySpace(int num) {
		int idx = hash(num);
		int i = 0;
		while(this.arr[idx] != 0) {
			idx ++;
			i++;
			if(idx == this.size) {
				idx = 0;
			}
			if(i == this.size) {
				return -1;
			}
		}
		return idx;
	}
	
	// hash 구하기
	private int hash(int num) {
		return num % this.size;
	}
	
	public int get(int num) {
		int idx = hash(num);
		
		if(this.arr[idx] == num) {
			return idx;
		} else {
			return getIdx(idx, num);
		}
	}
	
	// index 구하기
	private int getIdx(int idx, int num) {
		idx++;
		int i = 0;
		while(this.arr[idx] != num) {
			idx++;
			i++;
			if(idx == this.size) {
				idx = 0;
			}
			if(i == this.size) {
				return - 1;
			}
		}
		return idx;
	}
	
	public static void main(String[] args) {
		int[] array = {1, 21, 3, 23, 5};
		HashSearching search = new HashSearching(array.length);
		for(int i = 0; i < array.length; i++) {
			System.out.println(search.set(array[i]));
		}
		System.out.println("=================");
		for(int i = 0; i < array.length; i++) {
			System.out.print(search.get(array[i]) + ", ");
		}
	}

}
