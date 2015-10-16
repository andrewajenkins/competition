import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class FallingSand {
	
	public String[] simulate(String[] board) {
		int l = board[0].length();
		int h = board.length;
		for(int i = h - 1; i >= 0; i--) {
			for(int j = 0; j < l; j++) {
				if(board[i].charAt(j) == 'o') {
					int drop = i;
					while(drop < h - 1 && board[drop+1].charAt(j) == '.') {
						board[drop] = board[drop].substring(0, j) + "." + board[drop].substring(j + 1, l);
						board[drop+1] = board[drop+1].substring(0, j) + "o" + board[drop+1].substring(j+1, l);
						drop++;
					}
				}
			}
		}
		return board;
	}
}
