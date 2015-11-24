import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//http://codeforces.com/contest/602/problem/C

public class Routes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] sat = sc.nextLine().split(" ");
		int towns = Integer.parseInt(sat[0]);
		int rails = Integer.parseInt(sat[1]);
		int[][] m = new int[towns][towns];
		for(int i = 0; i < rails; i++) {
			String[] coord = sc.nextLine().split(" ");
			int u = Integer.parseInt(coord[0]) - 1;
			int v = Integer.parseInt(coord[1]) - 1;
			m[u][v] = 1;
		}
		System.out.println(Arrays.deepToString(m));
		List<int[]> railRoutes = new ArrayList<>();
		int[] p = new int[towns];
		Arrays.fill(p, -1);
		railRoutes.add(travel(m, Arrays.copyOf(p, p.length), 0, 1, 0));
		List<int[]> roadRoutes = new ArrayList<>();
		roadRoutes.add(travel(m, p, 0, 0, 0));
		sc.close();
	}
	public static int[] travel(int[][] m, int[] p, int t, int v, int c) {
		//is this town already visited?
		if(p[t] != 0) return p;
		//update route and counter
		p[t] = c++;
		for(int i = 0; i < p.length; i++) {
			//if not current town and path accessible
			if(i != t && m[t][i] == v) {
				System.out.println("Call: "+t+" "+v+" "+c+" "+Arrays.toString(p));
				System.out.println("From "+t+" visit "+i);
				travel(m, p, i, v, c);
			}
		}
		return p;
	}
}
