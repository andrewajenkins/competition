import org.junit.Test;
import static org.junit.Assert.*;

public class BearSlowlySortsTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] w = new int[] {2,6,8,5};
		assertEquals(1, new BearSlowlySorts().minMoves(w));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] w = new int[] {4,3,1,6,2,5};
		assertEquals(2, new BearSlowlySorts().minMoves(w));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] w = new int[] {93,155,178,205,213,242,299,307,455,470,514,549,581,617,677};
		assertEquals(0, new BearSlowlySorts().minMoves(w));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] w = new int[] {50,20,30,40,10};
		assertEquals(3, new BearSlowlySorts().minMoves(w));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] w = new int[] {234,462,715,596,906,231,278,223,767,925,9,526,369,319,241,354,317,880,5,696};
		assertEquals(2, new BearSlowlySorts().minMoves(w));
	}
}
