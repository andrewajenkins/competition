public class BichromeBoard {

	public String[] board;

	public String ableToDraw(String[] board) {
		this.board = board;
		if(tryColor('W') || tryColor('B')) {
			return "Possible";
		}
		return "Impossible";
	}

	public boolean tryColor(char color) {
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length(); j++) {
				char cur = board[i].charAt(j);
				System.out.println("compare: " + color + " " + cur);
				if(cur != color && cur != '?') {
					return false;
				}
				color = flip(color);
			}
			if(board[i].length()%2==0) color = flip(color);
		}
		return true;
	}

	public char flip(char c) {
		if(c == 'W') return 'B';
		return 'W';
	}
}
