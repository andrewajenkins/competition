public class SRM668x2x600xIsItASquare {

	int[] x;
	int[] y;

	public String isSquare(int[] x, int[] y) {

		String nope = "Not a square";
		String yup = "It's a square";

		this.x = x;
		this.y = y;

		double d01 = d(0, 1);
		double d02 = d(0, 2);
		double d03 = d(0, 3);

		if(d01 == d02) {
			return d(3, 1) == d(3, 2) ? yup : nope;
		} else if(d02 == d03) {
			return  d(1, 2) == d(1, 3) ? yup : nope;
		} else if(d01 == d03) {
			return  d(2, 1) == d(2, 3) ? yup : nope;
		} else {
			return nope;
		}
	}

	double d(int a, int b) {
		return Math.hypot((Math.abs(x[a] - x[b])),(Math.abs(y[a] - y[b])));
	}
}
