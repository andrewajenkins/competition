import java.util.Arrays;

public class TCCC04OR4x1x250xBadNeighbors {
	public int maxDonations(int[] donations) {
		
		int dL = donations.length;
		
		if(dL == 2) return Math.max(donations[0], donations[1]);

		int[] max1 = donations.clone();
		int[] max2 = donations.clone();
		
		for(int i = 2, j = 3; j < dL; i++, j++) {
			max1[i] += max1[i-2];
			max2[j] += max2[j-2];
		}

		return Math.max(max1[dL-2], max2[dL-1]);
	}

	void debug(Object... os) {
		System.out.println(Arrays.deepToString(os));
	}
}