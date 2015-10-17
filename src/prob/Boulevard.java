import java.awt.geom.Line2D;
import java.util.Arrays;
import java.util.Scanner;

public class Boulevard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[][] p = new int[n][6];
        for(int i = 0; i < n; i++) {
            String[] s = sc.nextLine().split(" ");
            p[i] = new int[]{Integer.parseInt(s[0])
                    , Integer.parseInt(s[1]), Integer.parseInt(s[2])
                    , (Integer.parseInt(s[2]) - Integer.parseInt(s[1])) > 1 ? 1 : -1, -1, 0};
        }

        System.out.println(Arrays.deepToString(p));

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i == j) continue;
                if(passed(p[i], p[j])) {
                    p[i][5]++;
                }
            }
        }
        //for(int t = 1; t < 1000001; t++) {
        //    for(int i = 0; i < n; i++) {
        //        if(p)
        //    }
        //}
        for(int i = 0; i < n; i++) {
            System.out.print(p[i][5] + " ");
        }
    }

    public static boolean passed(int[] a, int[] b) {
        //System.out.println();
        boolean result = Line2D.linesIntersect(a[1], a[0], a[2], a[0] + Math.abs(a[2] - a[1])
                , b[1], b[0], b[2], b[0] + Math.abs(b[2] - b[1]));
        System.out.println(result+" "+a[1]+" "+a[0]+" "+a[2]+" "+(a[0] + Math.abs(a[2] - a[1]))
                +" "+b[1]+" "+b[0]+" "+b[2]+" "+(b[0] + Math.abs(b[2] - b[1])));
        return result;
    }
}
