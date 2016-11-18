import java.util.*;

public class CountryGroup
{
	public int solve(int[] a)
	{
		int cur = -1;
		int counter = -1;
		int total = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] != cur || cur == 1) {
				if(counter != cur) {
					return -1;
				}
				total++;
				cur = a[i];
				counter = 1;
			} else {
				counter++;
			}
		}
		return counter == cur ? total : -1;
	}
}
