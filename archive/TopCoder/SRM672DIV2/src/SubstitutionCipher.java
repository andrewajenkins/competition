import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class SubstitutionCipher {
	
	public String decode(String a, String b, String y) {
		char[] p = new char[26];
		boolean[] done = new boolean[26];
		int count = 0;
		for(int i = 0; i < a.length(); i++) {
			p[ b.charAt(i)-65] = a.charAt(i);
			done[a.charAt(i)-65] = true;
		}
		for(int i = 0; i < done.length; i++) {
			if(done[i]) count++;
		}
		if(count == 25) {
			int missingChar = -1;
			int missingSpot = -1;
			for(int i = 0; i < 26; i++) {
				if(!done[i]) missingChar = i;
			}
			for(int i = 0; i < 26; i++) {
				if(p[i] == 0) missingSpot = i;
			}
			p[missingSpot] = (char)(missingChar+65);
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < y.length(); i++) {
			if(p[y.charAt(i)-65] != 0) {
				sb.append(String.valueOf(p[y.charAt(i)-65]));
			} else {
				return "";
			}

		}
		return sb.toString();
	}
}
