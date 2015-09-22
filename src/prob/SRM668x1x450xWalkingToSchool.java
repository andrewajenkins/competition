public class SRM668x1x450xWalkingToSchool {

	int[] from;
	int[] to;

	public String canWalkExactly(int N, int[] from, int[] to) {
		this.from = from;
		this.to = to;

		if(visit(0, N)) {
			return "Freedom";
		}
		return "Chores";
	}
	
	public boolean visit(int cur, int N) {
		if(N < 0) return false;
		if(cur == 1 && N == 0) {
			return true;
		}
		for(int i = 0; i < from.length; i++) {
			if(from[i] == cur) {
				return visit(to[i], --N);
			}
		}
		return false;
	}
}