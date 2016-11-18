import org.junit.Test;
import static org.junit.Assert.*;

public class RockPaperScissorsMagicEasyTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] card = new int[] {0,1,2};
		int score = 2;
		assertEquals(6, new RockPaperScissorsMagicEasy().count(card, score));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] card = new int[] {1,2};
		int score = 0;
		assertEquals(4, new RockPaperScissorsMagicEasy().count(card, score));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] card = new int[] {2,2,1,0,0};
		int score = 10;
		assertEquals(0, new RockPaperScissorsMagicEasy().count(card, score));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] card = new int[] {0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2};
		int score = 7;
		assertEquals(286226628, new RockPaperScissorsMagicEasy().count(card, score));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] card = new int[] {0,1,2,0,1,2,2,1,0};
		int score = 8;
		assertEquals(18, new RockPaperScissorsMagicEasy().count(card, score));
	}
}
