import java.util.*;
/**
 * Fyi add all three/3 is what the solution will be
 * if any of the three aren't 
 */
public class BearPlaysDiv2 {
	public String equalPiles(int A, int B, int C) {
		if(((A+B+C)%3) > 0) return "impossible";
		int i = -1;
		List<Piles> list = new ArrayList<Piles>();
		list.add(new Piles(A, B, C));
		while(true) {
			i++;
			int a = list.get(i).A;
			int b = list.get(i).B;
			int c = list.get(i).C;
			if(a == b && a == c) return "possible";
			if(i > 1000) return "impossible";
			if(a > b) list.add(new Piles((a-b),(b+b), c)); 
			if(b > c) list.add(new Piles(a, (b-c), (c+c)));
			if(a > c) list.add(new Piles((a-c), b, (c+c)));
			if(b > a) list.add(new Piles((a+a), (b-a), c));
			if(c > b) list.add(new Piles(a, (b+b), (c-b)));
			if(c > a) list.add(new Piles((a+a), b, (c-a)));
		}
	}
	
	class Piles{
		int A;
		int B;
		int C;
		Piles(int A, int B, int C) {
			this.A = A;
			this.B = B;
			this.C = C;
		}
	}
}