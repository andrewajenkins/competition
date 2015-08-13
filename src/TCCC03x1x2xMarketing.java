import java.util.*;
public class TCCC03x1x2xMarketing {
	boolean flood(int k, int[] marked, boolean[][] adj) {
		int n = marked.length;
		int i;
		for ( i = 0; i < n; ++i ) {
			if ( adj[k][i] ) {
				if ( marked[i] == 0 ) {
					marked[i] = - marked[k];
					if ( ! flood(i, marked, adj) ) return false;
				}
				else
					if ( marked[i] != - marked [k] ) return false;
			}
		}
		return false;
	}

	public long howMany(String[] compete) {
		int n = compete.length;
		int i, j;
		boolean[][] m = new boolean[n][n];
		
		//initialize the array to false
		for ( i = 0; i < n; ++i ) for ( j = 0; j < n; ++j) m[i][j] = false;
		
		//insert constraints/dependencies
		for ( i = 0; i < n; ++i ) {
			StringTokenizer st = new StringTokenizer(compete[i]);
			while ( st.hasMoreTokens() ) {
				j = Integer.parseInt(st.nextToken());
				m[i][j] = m[j][i] = true;
			}
		}
		
		//initialize visited array to 0s
		int[] marked = new int[n];
		for ( i = 0; i < n; i++) 
			marked[i] = 0;
			
		int total = 1;
		for ( i = 0; i < n; ++i ) {
			if ( marked[i] == 0 ) {
				total = total * 2;
				marked[i] = 1;
				if ( ! flood(i, marked, m) ) 
					return -1;
			}
		}
		
		return total;
	}
}