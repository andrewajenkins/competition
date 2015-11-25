import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class CombiningSlimes {
	
	public int maxMascots(int[] a) {
		int n = 0;
		for(int i = 0; i < a.length - 1; i++) {
			n += a[i]*a[i+1];
			a[i+1] += a[i];
		}
		return n;
	}
}