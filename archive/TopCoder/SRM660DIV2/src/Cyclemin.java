import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class Cyclemin {
	
	public String bestmod(String s, int k) {
		String[] a = new String[s.length()];
		a[0] = s;
		for(int i = 0; i < a.length; i++) {
			a[i] = s.substring(i, s.length()) + s.substring(0, i);
			int count = k;
			for(int j = 0; j < a[i].length(); j++) {
				if(count <= 0) break;
				if(a[i].charAt(j) != 'a' ) {
					count--;
					a[i] = a[i].substring(0, j) + "a" + a[i].substring(j+1, a[i].length());
				}
			}
		}
		Arrays.sort(a);
		return a[0];
	}
}
