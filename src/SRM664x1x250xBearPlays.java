public class BearPlays {
	public int pileSize(int A, int B, int K) {
		while(K > 0) {
			K--;
			if(A < B) {
				A += A;
				B -= A;
			} else {
				B+=B;
				A-=B;
			}
			if(A < 0) return A;
			if(B < 0) return B;
		}
		return A > B ? B : A;
	}
}