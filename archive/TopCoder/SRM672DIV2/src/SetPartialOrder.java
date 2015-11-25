import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class SetPartialOrder {
	
	public String compareSets(int[] a, int[] b) {
		Arrays.sort(a);
		Arrays.sort(b);
		if(Arrays.equals(a, b)) {
			return "EQUAL";
		} else if(compare(a, b)) {
			return "LESS";
		} else if(compare(b, a)) {
			return "GREATER";
		} else {
			return "INCOMPARABLE";
		}
	}

	public boolean compare(int[] a, int[] b) {
		for(int i = 0; i < a.length; i++) {
			if(Arrays.binarySearch(b, a[i]) < 0) {
				return false;
			}
		}
		return true;
	}
}
