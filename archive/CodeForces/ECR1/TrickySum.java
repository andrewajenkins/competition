import java.math.BigDecimal;
import java.util.Scanner;

public class TrickySum {
    public static void main(String[] args) {
        int[] a = new int[2];
        a[0] = 4;
        a[1] = 1000000000;
        summationSolution(a.length, a); 
    }

    public static void summationSolution(int t, int[] ns) {
        for(int s = 0; s < t; s++) {
            BigDecimal n = BigDecimal.valueOf(ns[s]);
            BigDecimal top = n.multiply(n.add(BigDecimal.ONE));
            BigDecimal sum = top.divide(BigDecimal.valueOf(2));
            int powCounter = 0;
            while(BigDecimal.valueOf(Math.pow(2, powCounter)).compareTo(BigDecimal.valueOf(ns[s])) < 1) {
                BigDecimal debug = BigDecimal.valueOf(2).pow(powCounter).multiply(BigDecimal.valueOf(2));
                sum = sum.subtract(debug);
                powCounter++;
            }
            System.out.println(sum.toString());
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