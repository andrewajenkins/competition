import org.junit.Test;
import static org.junit.Assert.*;

public class CombiningSlimesTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] a = new int[] {3,4};
		assertEquals(12, new CombiningSlimes().maxMascots(a));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] a = new int[] {2,2,2};
		assertEquals(12, new CombiningSlimes().maxMascots(a));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] a = new int[] {1,2,3};
		assertEquals(11, new CombiningSlimes().maxMascots(a));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] a = new int[] {3,1,2};
		assertEquals(11, new CombiningSlimes().maxMascots(a));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] a = new int[] {7,6,5,3,4,6};
		assertEquals(395, new CombiningSlimes().maxMascots(a));
	}
}
