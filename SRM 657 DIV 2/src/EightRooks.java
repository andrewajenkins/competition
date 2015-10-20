import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class EightRooks {
	
	public String isCorrect(String[] board) {

		boolean[] b = new boolean[8];

		for(int i = 0; i < board.length; i++) {
			int k = board[i].indexOf("R");
			if(k == -1 || b[k]){
				return "Incorrect";
			} else {
				b[k] = true;
			}
		}
		return "Correct";
	}
}
