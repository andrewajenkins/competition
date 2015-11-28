package algo.sort;

import java.util.Arrays;

class Quicksort {

	static int q = -1;//partition
	
	public static int[] sort(int[] a) {
		return quicksort(a, 0, a.length - 1);
	}

	public static int[] quicksort(int[] a, int p, int r) {
		if(p >= r) return a;
		a = partition(a, p, r);
		a = quicksort(a, p, q - 1);
		a = quicksort(a, q, r);
		return a;
	}

	public static int[] partition(int[] a, int p, int r) {
		int x = a[r];
		int i = p - 1;
		for(int j = p; j <= r - 1; j++) {
			if(a[j] <= x) {
				i++;
				a = swap(a, i, j);
			}
		}
		a = swap(a, i+1, r);
		q = i + 1;
		return a;
	}

	public static int[] swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		return a;
	}

	class ReturnObject {
		int p;
		int[] a;
	}

	public static void main(String[] args) {
		int[] a = {3,2,1,4,5,6,8,7,9};
		System.out.println(Arrays.toString(sort(a)));
	}
}
