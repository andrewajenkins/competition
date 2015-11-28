import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class BearSlowlySorts {
	
	public int minMoves(int[] w) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int n : w) {
			if(n > max) max = n;
			if(n < min) min = n;
		}
		int first = w[0];
		int last = w[w.length - 1];
		if(first == max && last == min) return 3;
		if(first != min && last != max) return 2;
		if((first == max && last != min) || (first != max && last == min)) return 1;
		if(first == min && last == max) {
			int[] sorted = Arrays.copyOf(w, w.length);
			Arrays.sort(sorted);
			if(Arrays.equals(w, sorted)) {
				return 0;
			}
		}
		return 1;
	}
}
