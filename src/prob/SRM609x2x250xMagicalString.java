package prob;

public class SRM609x2x250xMagicalString {
    public int minimalMoves(String ms) {
        int moves = 0;
        for (int i = 0; i < (ms.length() / 2); i++)
            if (ms.charAt(i) != '>') moves++;
        for (int i = (ms.length() / 2); i < ms.length(); i++)
            if (ms.charAt(i) != '<') moves++;
        return moves;
    }
}