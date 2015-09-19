
public class SRM667x2x500xOrderOfOperationsDiv2 {
	public int minTime(String[] s) {
		if(s.length == 0) return 0;
		boolean[] strUsed = new boolean[s.length];
		boolean[] newAccess = new boolean[s[0].length()];
		int time = 0;
		for(int i = 0; i < s.length; i++) {
			int minTime = -1;
			int position = -1;
			for(int k = 0; k < s.length; k++) {
				if(strUsed[k]) continue;
				int strTime = 0;
				for(int j = 0; j < s[k].length(); j++) {
					if(s[k].charAt(j) == '1' && newAccess[j] == false) {
						strTime++;
					}
				}
				if(strTime < minTime || minTime == -1) {
					minTime = strTime;
					position = k;
				}
			}
			for(int j = 0; j < s[position].length(); j++) {
				if(s[position].charAt(j) == '1') {
					newAccess[j] = true;
				}
			}
			strUsed[position] = true;
			time += minTime * minTime;
			System.out.println(time);
		}
		return time;
	}
}