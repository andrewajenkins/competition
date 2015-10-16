import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class BridgeBuildingDiv2 {
	
	public int minDiameter(int[] a, int[] b, int K) {

		int l = a.length;

		int n = 2 * l;

		int[] c = new int[2 * n];

		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);

		int[][] dist = new int[n+1][n+1];

		for(int[] row : dist) {
			Arrays.fill(row, 999);
		}

		dist[0][0] = dist[l][l] = 0;
		for(int i = 0; i < l; i++) {
			dist[i][i+1] = a[i];
			dist[i+1][i] = a[i];
			dist[i+l][i+l+1] = b[i];
			dist[i+l+1][i+l] = b[i];
			dist[i+1][i+1] = 0;
			dist[i+l+1][i+l+1] = 0;
		}

		String[] sa = Arrays.deepToString(dist).split("]");
		for(String s : sa) {
			System.out.println(s);
		}

		for(int k = 0; k < n+1; k++) {
			for(int s = 0; s < n+1; s++) {
				for(int d = 0; d < n+1; d++) {
					if(dist[s][k] + dist[k][d] < dist[s][d]) {
						dist[s][d] = dist[s][k] + dist[k][d];
					}
				}
			}
		}

		sa = Arrays.deepToString(dist).split("]");
		for(String s : sa) {
			System.out.println(s);
		}
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] - b[i] + " ");
		}
		return 0;
	}
}
