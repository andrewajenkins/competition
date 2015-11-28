package prob;

public class SRM564x2x500xAlternateColors {
	public String getColor(long r, long g, long b, long k) {
		int index = -1;
		long[] a = {r, g, b};
		for(int i = 0; i < k; i++) {
			if(r == 0 && g == 0) { index = 2; break; }
			if(r == 0 && b == 0) { index = 1; break; }
			if(b == 0 && g == 0) { index = 0; break; }
			index++;
			if(index > 2) index = 0;
			while(a[index] == 0){
				index++;
				if(index > 2) index = 0;
			}
			a[index] -= 1;
		}
		if(index == 0) return "RED";
		if(index == 1) return "GREEN";
		else return "BLUE";
	}
}