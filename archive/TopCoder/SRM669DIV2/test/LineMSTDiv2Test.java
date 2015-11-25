import org.junit.Test;
import static org.junit.Assert.*;

public class LineMSTDiv2Test {
	
	@Test(timeout=2000)
	public void test0() {
		int N = 3;
		assertEquals(15, new LineMSTDiv2().count(N));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int N = 2;
		assertEquals(2, new LineMSTDiv2().count(N));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int N = 16;
		assertEquals(682141922, new LineMSTDiv2().count(N));
	}
}
