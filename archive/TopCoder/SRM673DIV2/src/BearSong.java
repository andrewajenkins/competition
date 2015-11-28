import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class BearSong {
	
	public int countRareNotes(int[] notes) {
		Map<Integer, Integer> m = new HashMap<>();
		for(int i : notes) {
			if(m.containsKey(i)) {
				m.put(i, m.get(i) + 1);
			} else {
				m.put(i, 1);
			}
		}
		int rares = 0;
		for(int k : m.keySet()) {
			if(m.get(k) == 1) {
				rares++;
			}
		}
		return rares;
	}
}
