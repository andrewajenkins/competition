public class LuckyXor {
	public int construct(int a) {
		int[] b = {4, 7, 44, 47, 74, 77};
		for(int i = 0; i < b.length; i++) {
			int c = 0;
			for(int j = 0; j < 32; j++) {
				if(((a & 1 << j) != 0) == ((b[i] & 1 << j) != 0)) {
					c |= 0 << j;
				} else {
					c |= 1 << j;
				}
			}
			if(c > a && c >= 1 && c <= 100) { 
				return c;
			}
		}
		return -1;
	}
}