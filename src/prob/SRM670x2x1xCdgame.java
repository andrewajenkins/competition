import java.util.*;
public class Cdgame {
	public int rescount(int[] a, int[] b) {
		Set<Integer> s = new HashSet<>();
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < b.length; j++) {
				int[] c = a.clone();
				int[] d = b.clone();
				int temp = c[i];
				c[i] = d[j];
				d[j] = temp;
				s.add(calc(c, d));
			}
		}
		return s.size();
	}
	private int calc(int[] a, int[] b) {
		int sumA = 0;
		int sumB = 0;
		for(int x : a) sumA += x;
		for(int y : b) sumB += y;
		return sumA * sumB;
	}
}