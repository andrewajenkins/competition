import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class Hexspeak {
	
	public String decode(long ciphertext) {
		Set<Character> set = new HashSet<>(Arrays.asList('0', '1', 'a', 'b', 'c', 'd', 'e', 'f'));
		String hex = Long.toHexString(ciphertext);
		for(char c : hex.toCharArray()) {
			if(!set.contains(c)) return "Error!";
		}
		hex = hex.replaceAll("0", "o");
		hex = hex.replaceAll("1", "i");
		return hex.toUpperCase();
	}
}
