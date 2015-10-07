import java.util.Arrays;

public class EightQueens {

    public static void main(String[] args) {
        boolean[][] result = getNieveResult();
        System.out.println(Arrays.deepToString(result));
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                if(result[i][j] == true) {
                    if(!test(result, i, j)) {
                        System.err.println("failure: " + i + " " + j);
                        System.exit(1);
                    }
                }
            }
        }
        System.out.println("Success!!!");
    }

    public static boolean test(boolean[][] t, int x, int y) {
       for(int i = 0; i < 8; i++) {
            if(t[x][i] || t[i][y]) return false;
            if(x-i > 0 && y-i > 0 && t[x-i][y-i]) return false;
            if(x+i < 8 && x+i < 8 && t[x+i][y+i]) return false;
            if(x-i > 0 && y+i < 8 && t[x-i][y+i]) return false;
            if(x+i < 8 && y-i > 0 && t[x+i][y-i]) return false;
        }
        return true;
    }

    public static boolean[][] getNieveResult() {
        boolean[][] table =
                        {{false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false},
                        {false, false, false, false, false, false, false, false}};
        return table;
    }
}