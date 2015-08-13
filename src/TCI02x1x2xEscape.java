import java.util.*;

public class TCI02x1x2xEscape {
	int SIZE = -1;
	public int lowest(String[] harmful, String[] deadly) {
		int DIST = (SIZE == -1) ? 501:SIZE; SIZE = DIST;
		int[][] area = new int[DIST][DIST];
		area = color(harmful, 1, area);
		area = color(deadly, 2, area);
		int[][] dmg = new int[DIST][DIST];
		LinkedList<Point> que = new LinkedList<Point>();
		int[][] d = {{0,1},{1,0},{-1,0},{0,-1}};
		
		que.add(new Point(-1, -1, 0, 0, 0));
		
		while(!que.isEmpty()) {
			Point cur = que.poll();
			for(int[] p : d){
				int x = cur.x + p[0];
				int y = cur.y + p[1];
				
				if(x >= 0 && x < DIST && y >= 0 && y < DIST //in bounds
						&& area[x][y] != 2 // not deadly
						&& (dmg[x][y] == 0 // not visited
						|| (cur.t+dmg[cur.x][cur.y]) < dmg[x][y])) { // or better path
					int t = dmg[x][y] = cur.t + ((area[x][y] == 1)? 1 : 0);

					que.add(new Point(cur.x, cur.y, x , y, t));
					if(t == 0) dmg[x][y] = -1;
				}
			}
		}
		if(dmg[DIST-1][DIST-1] == 0) return -1;
		else return dmg[DIST-1][DIST-1] < 1 ? 0 : dmg[DIST-1][DIST-1];
	}
	
	class Point{
		int x, y;
		int prevX, prevY;
		int t;
		Point(int prevX, int prevY, int x, int y, int t) {
			this.prevX = prevX;
			this.prevY = prevY;
			this.x = x;
			this.y = y;
			this.t = t;
		}
		@Override
		public String toString() { return x+"/"+y+"/"+t; }
	}
	
	public int[][] color(String[] strings, int a, int[][] area) {
		for(String s : strings) {
			StringTokenizer st = new StringTokenizer(s);
			int X1 = Integer.parseInt(st.nextToken());
			int Y1 = Integer.parseInt(st.nextToken());
			int X2 = Integer.parseInt(st.nextToken());
			int Y2 = Integer.parseInt(st.nextToken());
			if(X1 < X2)
				for(int i = X1; i <= X2; i++) for(int j = Y1; j <= Y2; j++) area[i][j] = a;
			else {
				for(int i = X2; i <= X1; i++) for(int j = Y1; j <= Y2; j++) area[i][j] = a;
			}
		}
		return area;
	}
	
	public static void main(String[] args) {
		TCI02x1x2xEscape e = new TCI02x1x2xEscape();
		e.SIZE = 3;
		String[] harmful = {"15 0 29 23"};
		String[] empty = {"0 23 29 25"};
		System.out.println("returns: " + e.lowest(harmful, empty));
	}
}
