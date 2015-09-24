public class SRM352x2x2x500xNumberofFiboCalls {

	int zero = 0;
	int one = 0;

	public int[] fiboCallsMade(int n ) {
			fib(n);
			int[] result = {zero, one};
			return result;
	}
	
	public int fib(int n) {
		if(n == 0) {
			zero++;
			return 0;
		}
		if(n == 1) {
			one++;
			return 1;
		}
		else return fib(n-1) + fib(n-2);
	}
}