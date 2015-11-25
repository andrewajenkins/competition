import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class InfiniteString {
	
	public String equal(String s, String t) {
		String shorter = s.length() > t.length() ? t : s;
		String longer = shorter.equals(s) ? t : s;
		while(shorter.length() < longer.length()) {
			shorter += shorter;
		}
		if(shorter.startsWith(longer)) return "Equal";
		else return "Not equal";
	}
}
