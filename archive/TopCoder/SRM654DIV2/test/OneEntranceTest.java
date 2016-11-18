import org.junit.Test;
import static org.junit.Assert.*;

public class OneEntranceTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] a = new int[] {0, 1, 2};
		int[] b = new int[] {1, 2, 3};
		int s = 0;
		assertEquals(1, new OneEntrance().count(a, b, s));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] a = new int[] {0, 1, 2};
		int[] b = new int[] {1, 2, 3};
		int s = 2;
		assertEquals(3, new OneEntrance().count(a, b, s));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] a = new int[] {0, 0, 0, 0};
		int[] b = new int[] {1, 2, 3, 4};
		int s = 0;
		assertEquals(24, new OneEntrance().count(a, b, s));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] a = new int[] {7, 4, 1, 0, 1, 1, 6, 0};
		int[] b = new int[] {6, 6, 2, 5, 0, 3, 8, 4};
		int s = 4;
		assertEquals(896, new OneEntrance().count(a, b, s));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] a = new int[] {};
		int[] b = new int[] {};
		int s = 0;
		assertEquals(1, new OneEntrance().count(a, b, s));
	}
}
