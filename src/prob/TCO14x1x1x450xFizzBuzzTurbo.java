import java.util.HashSet;
public class TCO14x1x1x450xFizzBuzzTurbo {
	public long[] counts(long A, long B) {

		A--;

		long nFizzBuzz = A/15;
		long nFizz = A/3 - nFizzBuzz;
		long nBuzz = A/5 - nFizzBuzz;

		long fizzBuzz = B/15;
		long fizz = B/3 - fizzBuzz - nFizz;
		long buzz = B/5 - fizzBuzz - nBuzz;

		fizzBuzz -= nFizzBuzz;

		long[] result = {fizz, buzz, fizzBuzz};
		return result;
	}
}
