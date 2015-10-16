import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class BridgeBuildingDiv2 {
	
	public int minDiameter(int[] a, int[] b, int K) {

		int n = 2 * (a.length - 1);

		int[] c = new int[2 * n];

		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);

		int[][] dist = new int[n][n];

		for(int i = 0; i < n - 1; i++) {
			dist[i][i+1] = c[i];
			dist[i+1][i] = c[i];
		}

		String[] sa = Arrays.deepToString(dist).split("]");
		for(String s : sa) {
			System.out.println(s);
		}
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] - b[i] + " ");
		}
		return 0;
	}
}
