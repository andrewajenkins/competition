import org.junit.Test;
import static org.junit.Assert.*;

public class SingingEasyTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] pitch = new int[] {1,3,8,12,13};
		assertEquals(7, new SingingEasy().solve(pitch));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] pitch = new int[] {1,5,6,2,1};
		assertEquals(3, new SingingEasy().solve(pitch));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] pitch = new int[] {5,5,5,5,4,4,4,4};
		assertEquals(0, new SingingEasy().solve(pitch));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] pitch = new int[] {1000000};
		assertEquals(0, new SingingEasy().solve(pitch));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] pitch = new int[] {24,13,2,4,54,23,12,53,12,23,42,13,53,12,24,12,11,24,42,52,12,32,42};
		assertEquals(188, new SingingEasy().solve(pitch));
	}
}
