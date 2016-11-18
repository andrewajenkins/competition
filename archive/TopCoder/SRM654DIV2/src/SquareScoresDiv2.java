import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class SquareScoresDiv2 {
	
	public int getscore(String s) {
		char cur = ' ';
		int counter = 1;
		int sum = 0;
		for(int i = 0; i < s.length(); i++) {
			if(cur == s.charAt(i)) {
				counter++;
			} else {
				sum += mult(counter);
				System.out.println(counter+" "+cur+" makes new sum "+sum);
				counter = 1;
				cur = s.charAt(i);
			}
		}
		return mult(s.length());
	}

	public int mult(int n) {
		int mult = 1;
		int sum = 0;
		for(int i = n; i >= 0; i--) {
			System.out.println(sum+" = "+mult+" * "+i);
			sum += mult * i;
		}
		return sum;
	}
}
