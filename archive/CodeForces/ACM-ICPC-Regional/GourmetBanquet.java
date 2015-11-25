import java.util.Arrays;
import java.util.Scanner;

public class GourmetBanquet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[][] a = new int[n][3];

        int maxValue = 0;
        for(int i = 0; i < n; i++) {
            String[] s = sc.nextLine().split(" ");
            int tempValue = Integer.parseInt(s[1]);
            if(tempValue > maxValue) maxValue = tempValue;
            a[i] = new int[]{Integer.parseInt(s[0]), Integer.parseInt(s[1]), 0};
        }

        int[] b = new int[maxValue];

        System.out.println(n * go(a, b, 1));
    }

    public static int go(int[][] a, int[] b, int t) {
        int max = 0;
        if(t == 9) {
            for(int i = 0; i < a.length; i++) {
                a[i][2] = 0;
            }
            for(int i = 1; i < b.length; i++) {
                a[b[i]][2]++;
            }
            int localMax = Integer.MAX_VALUE;
            for(int i = 0; i < a.length; i++) {
                if(a[i][2] < localMax) localMax = a[i][2];
            }
            return localMax;
        }
        for(int i = 0; i < a.length; i++) { //for each dish
            if(a[i][0] <= t && t <= a[i][1]) { //if dish is currently served
                b[t] = i; //set as current dish
                int result = go(a, b, ++t); //do next time unit
                if(result > max) max = result; //resolve max
            }
        }
        return max;
    }
}
