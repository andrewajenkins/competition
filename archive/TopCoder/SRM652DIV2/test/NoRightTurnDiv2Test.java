import org.junit.Test;
import static org.junit.Assert.*;

public class NoRightTurnDiv2Test {
	
	@Test(timeout=2000)
	public void test0() {
		int[] x = new int[] {-10, 0, 10};
		int[] y = new int[] {10, -10, 10};
		assertArrayEquals(new int[] {0, 1, 2 }, new NoRightTurnDiv2().findPath(x, y));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] x = new int[] {0,0,-3,-3,3,3};
		int[] y = new int[] {-1,1,-3,3,-3,3};
		assertArrayEquals(new int[] {0, 4, 5, 3, 2, 1 }, new NoRightTurnDiv2().findPath(x, y));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] x = new int[] {10,9,8,7,6,5,4,3,2,1};
		int[] y = new int[] {1,4,9,16,25,36,49,64,81,100};
		assertArrayEquals(new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, new NoRightTurnDiv2().findPath(x, y));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] x = new int[] {0, 2,-2, 4,-4, 2,-2, 0};
		int[] y = new int[] {1, 2, 2, 4, 4, 6, 6, 5};
		assertArrayEquals(new int[] {4, 2, 0, 1, 3, 5, 6, 7 }, new NoRightTurnDiv2().findPath(x, y));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] x = new int[] {-76,98,83,58,-15,94,21,55,80,84,-39,-90,-46,100,-80,-49,-2,-70,36,48,88,10,
55,-56,22,67,31,81,100,-39,64,-62,-7,45,-82,-24,51,-33,53,11,20,-74,-83,47,
9,39,42,63,-97,94};
		int[] y = new int[] {-90,68,91,-92,-6,88,99,10,39,-69,-61,-4,71,-5,90,-51,21,-53,-21,-86,41,-9,
42,-23,-4,12,94,-59,55,18,70,-88,-86,-17,-97,-33,87,80,91,-80,-79,-79,-78,
-99,57,67,-52,-46,61,-10};
		assertArrayEquals(new int[] {39, 32, 40, 31, 19, 27, 47, 46, 0, 34, 43, 3, 9, 13, 28, 1, 5, 2, 6, 14, 48, 42, 41, 49, 20, 38, 26, 37, 12, 11, 17, 10, 33, 25, 8, 30, 36, 44, 29, 23, 15, 18, 7, 22, 45, 16, 4, 35, 24, 21 }, new NoRightTurnDiv2().findPath(x, y));
	}
}
