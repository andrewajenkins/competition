import org.junit.Test;
import static org.junit.Assert.*;

public class BearPermutations2Test {
	
	@Test(timeout=2000)
	public void test0() {
		int N = 3;
		int MOD = 502739849;
		assertEquals(4, new BearPermutations2().getSum(N, MOD));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int N = 1;
		int MOD = 1000003;
		assertEquals(0, new BearPermutations2().getSum(N, MOD));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int N = 4;
		int MOD = 973412327;
		assertEquals(38, new BearPermutations2().getSum(N, MOD));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int N = 100;
		int MOD = 89;
		assertEquals(49, new BearPermutations2().getSum(N, MOD));
	}
}
