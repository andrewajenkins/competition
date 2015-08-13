import java.util.*;
public class TCCC03x1x1xCircuits {

	/**
	 * Me :P
	 * @param connects
	 * @param costs
	 * @return
	 */
	public int howLong(String[] connects, String[] costs) {
		int n = connects.length;
		int[][] graph = new int[n][n];

		for(int i = 0; i < n; i++) for(int j = 0; j < n; j++) graph[i][j] = 0;
		
		//convert string arrays to cost based adjacency matrix
		for(int i = 0; i < n; i++) {
			StringTokenizer a = new StringTokenizer(connects[i]);
			StringTokenizer b = new StringTokenizer(costs[i]);
			while(a.hasMoreTokens()) {
				int j = Integer.parseInt(a.nextToken());
				int c = Integer.parseInt(b.nextToken());
				graph[i][j] = c;
			}
		}

		int ret = 0;
		for(int i = 0; i < n; i++)
			if(graph[i][0] == 0) {
				int local = fill(i, 0, graph);
				if(local > ret) ret = local;
			}
			
		return ret;
	}

	public int fill(int i, int total, int[][] graph) {
		int n = graph.length;
		int max = total;
		if(i < 0 || i >= n) return total;
		for(int j = 1; j < n; j++){
			if(graph[i][j] > 0 && i != j) {
				int local = fill(j, total + graph[i][j], graph);
				if(local > max) max = local;
			}
		}
		return max;
	}
}
