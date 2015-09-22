package prob;

import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.LinkedList;

public class SRM211x1x2xgrafixMask {

	/**
	 * An interesting solution that seems to use flood fill (filling in 4 directions)
	 * in order to solve what is actually only a two direction problem. We use a two
	 * dimensional boolean array to track our graph. Initially we set all values to 
	 * true. When we use the string array passed as input to determine the non traversable
	 * sections of the graph by parsing the strings for their two points, then marking
	 * on the boolean array all the pixels within this rectangle to be false to signify
	 * that these pixels can not be traversed. There does seem to be a duplicaton of efforts
	 * in this solution. We move across, then down across the entire graph, searching for
	 * open points. When we find a point, we increment the point counter, we add it 
	 * to the que to be explored and then mark its value on the graph as false. 
	 * We then pop a value off the que, explore adjacent nodes in accordance with our 
	 * dx and dy exploration arrays, and add those elements to the array. While 
	 * being added the values are also set to false on the graph so that when the value
	 * pulled off to be checked later, it will not be explored because its already been
	 * set false. When we run out of space in the rectangle we add the total number of
	 * pixels explored to the array list, and continue exploring for more available 
	 * rectangles. When the search is done we convert our array list of Integer objects
	 * to an primitive integer array and return it. 
	 * @param rectangles contains rectangles of the string format "x1 y1 x2 y2"
	 * @return an ordered integer array of the unopaque rectangles
	 */
	public int[] sortedAreas(String[] rectangles) {
		//map to track opaque and visited nodes
		boolean[][] open = new boolean[400][600];
		//prefill array with all true values
		for(int i = 0; i < open.length; i++){
			Arrays.fill(open[i], true);
		}
		//add opaque pixels in the format "x1 y1 x2 y2"
		for(int i = 0; i < rectangles.length; i++){
			StringTokenizer st = new StringTokenizer(rectangles[i]);
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			for(int j = x1; j <= x2; j++){
				for(int k = y1; k <= y2; k++){
					open[j][k] = false;
				}
			}
		}
		ArrayList al = new ArrayList(); //stores area sizes
		LinkedList que = new LinkedList(); //stores visited nodes
		int[] dx = {-1, 1, 0, 0}; //x axis directions to try
		int[] dy = {0, 0, -1, 1}; //y axis directons to try
		for(int i = 0; i < open.length; i++){ //for every x node
			for(int j = 0; j < open[i].length; j++){ //for every y node
				int ret = 0; //counter to increment for each visited node
				if(open[i][j])que.add(new State(i,j)); //add this to the visited states
				open[i][j] = false; //set the graph value to false/visited
				while(que.size() > 0){
					ret++;
					State s = (State)que.removeFirst();
					for(int k = 0; k < dx.length; k++){
						int x = s.x+dx[k];
						int y = s.y+dy[k];
						if(x < 0 || y < 0 || x >=400 || y >= 600 || !open[x][y]) continue;
						open[x][y] = false;
						que.add(new State(x,y));
					}
				}
				if(ret != 0) al.add(new Integer(ret));
			}
		}
		int[] ret = new int[al.size()];
		for(int i = 0; i < al.size(); i++){
			ret[i] = ((Integer)al.get(i)).intValue();
		}
		Arrays.sort(ret);
		return ret;
	}

	class State {
		int x;
		int y;
		State(int xx, int yy) { x = xx; y = yy; }
	}
}