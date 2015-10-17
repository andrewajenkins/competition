package dp;

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

    public static void main(String[] args) {

        int[] price = new int[]{1, 5, 8, 9, 10, 17, 17, 20, 24, 30};

        int revenue = cutRod(price, 3);

        System.out.println(revenue);
    }
}
