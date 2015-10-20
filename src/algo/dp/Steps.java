package dp;

public class Steps {
    public int countWays(int n) {
        if(n < 0) {
            return 0;
        } else if(n == 0) {
            return 1;
        } else {
            return countWays(n-1) + countWays(n-2) + countWays(n-3);
        }
    }
    public static int countWaysDP(int n, int[] map) {
        if(n < 0) {
            return 0;
        } else if(n == 0) {
            return 1;
        } else if(map[n] > -1) {
            return map[n];
        } else {
            map[n] = countWaysDP(n-1, map) +
                    countWaysDP(n-2, map) +
                    countWaysDP(n-3, map);
            return map[n];
        }
    }
}
