import java.util.*;
public class SRM670x2x2xDrbalance {
	public int lesscng(String s, int k) {
		List<String> list = new ArrayList<>();
		int count = 0;
		int n = getNegativity(s);
		while(n > k) {
			s = neg(s);
			count++;
			n = getNegativity(s);
		}
		return 0;
	}
	
	public String neg(String s) {
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '-') {
				char[] ca = s.toCharArray();
				ca[i] = '+';
				return new String(ca);
			}
		}
		return null;
	}
	
	public int getNegativity(String s) {
		int negCount = 0;
		for(int i = s.length(); i > 0; i--) {
			String str = s.subSequence(0, i).toString();
			int count = 0;
			for(char c : s.toCharArray()) {
				if(c == '+') {
					count++;
				}
				if(c == '-') {
					count--;
				}
			}
			if(count < 0) negCount++;
		}
		return negCount;
	}
}