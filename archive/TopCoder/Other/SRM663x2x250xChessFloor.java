package prob;

public class SRM663x2x250xChessFloor {
	public int minimumChanges(String[] floor) {
		int[] a = new int[256];
		int[] b = new int[256];
		int x = 0;
		for(int i = 0; i < floor.length; i++) {
			for(int j = 0; j < floor.length; j++) {
				if(j%2==x){
					int h = floor[i].charAt(j);
					a[h]++;
				} else {
					int h = floor[i].charAt(j);
					b[h]++;
				}
			}
			if(x == 0) x = 1;
			else x = 0;
		}
		int maxA = 0;
		int maxAIndex = -1;
		int maxB = 0;
		int maxBIndex = -1;
		int missingA = 0;
		int missingB = 0;
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] > maxA) { maxA = a[i]; maxAIndex = i; }
			if(b[i] > maxB) { maxB = b[i]; maxBIndex = i; }
		}
		
		if(maxAIndex == maxBIndex && maxA > maxB) {
			maxB = 0; maxBIndex = -1;
			for(int i = 0; i < a.length; i++) {
				if(b[i] > maxB && i != maxAIndex) { maxB = b[i]; maxBIndex = i; }
			}
		} else if(maxAIndex == maxBIndex) {
			maxA = 0; maxAIndex = -1;
			for(int i = 0; i < a.length; i++) {
				if(a[i] > maxA && i != maxBIndex) { maxA = a[i]; maxAIndex = i; }
			}
		}

		for(int i = 0; i < a.length; i++) {
			if(i != maxAIndex) missingA+=a[i];
			if(i != maxBIndex) missingB+=b[i];
		}

		return missingA + missingB;
	}
}