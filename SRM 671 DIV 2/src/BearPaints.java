import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class BearPaints {
	
	public long maxArea(int W, int H, long M) {
		long large = W > H ? W : H;
		long small = W < H ? W : H;
		if(large * small < M) return large * small;
		for(int i = (int)large; i > 0; i--) {
			System.out.println(large + " " + small);
			if(large <= small) {
				long temp = large;
				large = small;
				small = temp;
			}
			if(large * small <= M) {
				return large * small;
			}
			large--;
		}

		return 0;
	}
}
