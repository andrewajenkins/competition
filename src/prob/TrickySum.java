import java.math.BigDecimal;
import java.util.Scanner;

public class TrickySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next());
        int[] ns = new int[t];
        for(int i = 0; i < t; i++) {
            ns[i] = Integer.parseInt(sc.next());
        }
        for(int s = 0; s < t; s++) {
            long sum = (ns[s]*(ns[s]+1))/2;
            int powCounter = 0;
            while(Math.pow(2, powCounter) < ns[s]) {
                sum -= 2*(Math.pow(2, powCounter));
                powCounter++;
            }
            System.out.println(sum);
        }
    }

    public static void distributedBruteForce() {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next());
        int[] ns = new int[t];
        for(int i = 0; i < t; i++) {
            ns[i] = Integer.parseInt(sc.next());
        }
        for(int i = 0; i < ns.length; i++) {
            int INC = 1000000;
            int mult = 1;
            double sum = 0;
            int powCounter = 0;
            while(INC*(mult-1) < ns[i]+1) {
                int start = (INC*(mult-1));
                int fin = (ns[i]+1 > INC*mult) ? INC*mult : ns[i]+1;
                boolean[] b = new boolean[fin - start];
                while (Math.pow(2, powCounter) <= fin) {
                    b[(int) Math.pow(2, powCounter++) - start] = true;
                }
                for (int j = 0; j < b.length; j++) {
                    if (b[j]) {
                        sum -= j + start;
                    } else {
                        sum += j + start;
                    }
                }
                mult++;
            }
            System.out.println((new BigDecimal(sum)).toPlainString());
        }
    }
}
