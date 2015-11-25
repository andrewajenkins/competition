import java.util.Arrays;
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] b = new int[n];
        for(int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        int total = 0;
        for(int i = 1; i <= k; i++) {
            int recolor = 0;
            for(int j = 0; j < n; j++) {
                if(b[j] == i){
                    recolor++;
                }
            }
            total += ((n/k)-recolor) >= 0 ? (n/k)-recolor : 0;
        }
        System.out.println(total);
    }
}
