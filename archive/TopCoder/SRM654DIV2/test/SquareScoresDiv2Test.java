import org.junit.Test;
import static org.junit.Assert.*;

public class SquareScoresDiv2Test {
	
	@Test(timeout=2000)
	public void test0() {
		String s = "aaaba";
		assertEquals(8, new SquareScoresDiv2().getscore(s));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String s = "zzzxxzz";
		assertEquals(12, new SquareScoresDiv2().getscore(s));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String s = "abcdefghijklmnopqrstuvwxyz";
		assertEquals(26, new SquareScoresDiv2().getscore(s));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String s = "p";
		assertEquals(1, new SquareScoresDiv2().getscore(s));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		assertEquals(5050, new SquareScoresDiv2().getscore(s));
	}
}
