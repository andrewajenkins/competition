import org.junit.Test;
import static org.junit.Assert.*;

public class BridgeBuildingDiv2Test {
	
	@Test(timeout=2000)
	public void test0() {
		int[] a = new int[] {2,1,1,1,2};
		int[] b = new int[] {1,9,1,9,1};
		int K = 4;
		assertEquals(6, new BridgeBuildingDiv2().minDiameter(a, b, K));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] a = new int[] {1,50,1,50,1,50,1,50};
		int[] b = new int[] {50,1,50,1,50,1,50,1};
		int K = 9;
		assertEquals(8, new BridgeBuildingDiv2().minDiameter(a, b, K));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] a = new int[] {50,10,15,31,20,23,7,48,5,50};
		int[] b = new int[] {2,5,1,8,3,2,16,11,9,1};
		int K = 3;
		assertEquals(124, new BridgeBuildingDiv2().minDiameter(a, b, K));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] a = new int[] {2,4,10,2,2,22,30,7,28};
		int[] b = new int[] {5,26,1,2,6,2,16,3,15};
		int K = 5;
		assertEquals(54, new BridgeBuildingDiv2().minDiameter(a, b, K));
	}
}
