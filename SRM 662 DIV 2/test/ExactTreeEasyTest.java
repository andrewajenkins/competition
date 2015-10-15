import org.junit.Test;
import static org.junit.Assert.*;

public class ExactTreeEasyTest {
	
	@Test(timeout=2000)
	public void test0() {
		int n = 4;
		int m = 2;
		assertArrayEquals(new int[] {0, 1, 1, 2, 2, 3 }, new ExactTreeEasy().getTree(n, m));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int n = 4;
		int m = 3;
		assertArrayEquals(new int[] {0, 1, 1, 2, 1, 3 }, new ExactTreeEasy().getTree(n, m));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int n = 3;
		int m = 2;
		assertArrayEquals(new int[] {0, 1, 1, 2 }, new ExactTreeEasy().getTree(n, m));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int n = 5;
		int m = 3;
		assertArrayEquals(new int[] {0, 1, 1, 2, 1, 3, 3, 4 }, new ExactTreeEasy().getTree(n, m));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int n = 10;
		int m = 9;
		assertArrayEquals(new int[] {0, 1, 1, 2, 1, 3, 1, 4, 1, 5, 1, 6, 1, 7, 1, 8, 1, 9 }, new ExactTreeEasy().getTree(n, m));
	}
}
