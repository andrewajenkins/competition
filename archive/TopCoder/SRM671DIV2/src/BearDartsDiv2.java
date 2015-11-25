import java.util.*;

public class BearDartsDiv2 {

	public static long count(int[] w) {
		int[] m = new int[4];
		countTheWays(w, 0, 0, m);
		return 0l;
	}

	public static void countTheWays(int[] w, int k, int j, int[] m) {
		if(k == w.length) return;
		else if(j == m.length) { System.out.println(Arrays.toString(m)); return; }
		else {
			for (int i = 0; i < w.length; i++) {
				countTheWays(w, j, i, m);
			}
		}
	}

	public static void main(String[] args) {
		int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8};
		count(a);
	}
}