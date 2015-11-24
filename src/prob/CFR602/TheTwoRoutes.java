import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * http://codeforces.com/contest/602/problem/C
 */
public class TheTwoRoutes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] sat = sc.nextLine().split(" ");
		int towns = Integer.parseInt(sat[0]);
		int rails = Integer.parseInt(sat[1]);
		int[][] m = new int[towns][towns];
		for(int i = 0; i < rails; i++) {
			String[] coord = sc.nextLine().split(" ");
			int u = Integer.parseInt(coord[0]);
			int v = Integer.parseInt(coord[1]);
			m[u][v] = 1;
		}
		List<int[]> railRoutes = new ArrayList<>();
		railRoutes.add(travel(m, new int[towns], 0, 1, 0));
		List<int[]> roadRoutes = new ArrayList<>();
		roadRoutes.add(travel(m, new int[towns], 0, 0, 0));
		sc.close();
	}

	public static int[] travel(int[][] m, int[] p, int t, int v, int c) {
		//is this town already visited? t[c] != 0;
		if(p[t] != 0) return p;
		//update route and counter
		p[t] = c++;
		for(int i = 0; i < p.length; i++) {
			//if not current town and path accessible
			if(i != t && m[t][i] == v) {
				travel(m, p, i, v, c);
			}
		}
		return p;
	}

}