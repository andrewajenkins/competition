import org.junit.Test;
import static org.junit.Assert.*;

public class BichromeBoardTest {
	
	@Test(timeout=2000)
	public void test0() {
		String[] board = new String[] {"W?W",
 "??B",
 "???"};
		assertEquals("Possible", new BichromeBoard().ableToDraw(board));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String[] board = new String[] {"W??W"};
		assertEquals("Impossible", new BichromeBoard().ableToDraw(board));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String[] board = new String[] {"??"};
		assertEquals("Possible", new BichromeBoard().ableToDraw(board));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String[] board = new String[] {"W???",
 "??B?",
 "W???",
 "???W"};
		assertEquals("Possible", new BichromeBoard().ableToDraw(board));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String[] board = new String[] {"W???",
 "??B?",
 "W???",
 "?B?W"};
		assertEquals("Impossible", new BichromeBoard().ableToDraw(board));
	}
	
	@Test(timeout=2000)
	public void test5() {
		String[] board = new String[] {"B"};
		assertEquals("Possible", new BichromeBoard().ableToDraw(board));
	}
}
