import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ExactTreeEasy {
	public int[] getTree(int n, int m) {
		int[] e = new int[2*(n-1)];
		e[0] = 0;
		e[1] = 1;
		int counter = 1;
		for(int i = 2; counter++ < m; ) {
			e[i++] = 1;
			e[i++] = counter;
		}
		for(int i = counter+1; i <= n; ) {
			e[(i%2 == 0) ? i : ++i] = counter-1;
			e[++i] = counter++;
		}
		return e;
	}
}
