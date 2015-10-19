package dp;

import java.util.Arrays;

/**
 * Created by username on 10/16/2015.
 */
public class RodCutting {

    //recursive top down
    public static int cutRod(int[] p, int n) {
        if(n == 0) {
            return 0;
        }
        int q = Integer.MIN_VALUE;
        for(int i = 1; i <= n; i++) {
            q = Math.max(q, p[i] + cutRod(p, n-1));
        }
        return q;
    }

    public static int memoizedCutRod(int[] p, int n) {
        int[] array = new int[n];
        Arrays.fill(array, Integer.MIN_VALUE);
        return memoizedCutRodAux(p, n, array);
    }

    public static int memoizedCutRodAux(int[] p, int n, int[] r) {
        int q = 0;
        if(r[n] >= 0) {
            return r[n];
        }
        if(n == 0) {
            q = 0;
        }
        else {
            q = Integer.MIN_VALUE;
            for(int i = 0; i < n; i++) {
                q = Math.max(q, p[i] + memoizedCutRodAux(p, n-i, r));
            }
            r[n] = q;
        }
        return q;
    }

    public static void main(String[] args) {

        int[] price = new int[]{1, 5, 8, 9, 10, 17, 17, 20, 24, 30};

        int revenue = cutRod(price, 3);

        System.out.println(revenue);
    }
}
