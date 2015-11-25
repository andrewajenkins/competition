import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class FilipTheFrog {
	
	public int countReachableIslands(int[] positions, int L) {
		int[] clusters = new int[positions.length];
		clusters[0] = positions[0];
		int counter = 1;
		for(int i = 0; i < counter; i++) {
			for(int j = 0; j < positions.length; j++) {
				if (positions[j] == -1) continue;
				if(clusters[i] == positions[j]) { positions[j] = -1; continue; }
				if (Math.abs(clusters[i] - positions[j]) <= L) {
					clusters[counter++] = positions[j];
					positions[j] = -1;
				}
			}
		}
		return counter;
	}
}
