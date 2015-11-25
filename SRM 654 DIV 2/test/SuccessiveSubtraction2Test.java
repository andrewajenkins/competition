import org.junit.Test;
import static org.junit.Assert.*;

public class SuccessiveSubtraction2Test {
	
	@Test(timeout=2000)
	public void test0() {
		int[] a = new int[] {1, 2, 3, 4, 5};
		int[] p = new int[] {1, 2, 0, 4, 3};
		int[] v = new int[] {3, 9, -10, 5, 1};
		assertArrayEquals(new int[] {10, 16, 5, 5, 2 }, new SuccessiveSubtraction2().calc(a, p, v));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] a = new int[] {-100, -100, -100, -100, -100};
		int[] p = new int[] {0, 1, 2, 3, 4};
		int[] v = new int[] {0, 0, 0, 0, 0};
		assertArrayEquals(new int[] {400, 300, 200, 100, 0 }, new SuccessiveSubtraction2().calc(a, p, v));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] a = new int[] {83, 0, 25, 21};
		int[] p = new int[] {0, 3, 2, 1, 3, 1, 2};
		int[] v = new int[] {10, -90, 33, 52, -100, 0, 45};
		assertArrayEquals(new int[] {56, 125, 133, 81, 91, 143, 155 }, new SuccessiveSubtraction2().calc(a, p, v));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] a = new int[] {1};
		int[] p = new int[] {0, 0, 0, 0};
		int[] v = new int[] {10, -10, 100, -100};
		assertArrayEquals(new int[] {10, -10, 100, -100 }, new SuccessiveSubtraction2().calc(a, p, v));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] a = new int[] {-11, -4, 28, 38, 21, -29, -45, 11, -58, -39, 92, 35, -56, -6, 29, -2, 61, 10, -29, -63};
		int[] p = new int[] {19, 5, 3, 10, 4, 18, 5, 2, 0, 15};
		int[] v = new int[] {-19, 21, 7, -66, 38, -39, -22, 24, -32, 13};
		assertArrayEquals(new int[] {451, 443, 412, 440, 457, 467, 468, 464, 443, 458 }, new SuccessiveSubtraction2().calc(a, p, v));
	}
}
