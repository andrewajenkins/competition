import java.util.Arrays;
import java.util.Scanner;

public class CFR328x2xAxPawnChess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] b = new String[8];
        for(int i = 0; i < 8; i++) {
            b[i] = sc.next();
        }
        int countA = Integer.MAX_VALUE;
        boolean[] blockedA = new boolean[8];
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                if(b[i].charAt(j) == 'B') {
                    blockedA[j] = true;
                } else if(b[i].charAt(j) == 'W' && countA > i && !blockedA[j]) {
                    countA = i;
                }
            }
        }
        int countB = Integer.MAX_VALUE;
        boolean[] blockedB = new boolean[8];
        for(int i = 7; i >= 0; i--) {
            for(int j = 7; j >= 0; j--) {
                if(b[i].charAt(j) == 'W') {
                    blockedB[j] = true;
                } else if(b[i].charAt(j) == 'B' && countB > 7-i && !blockedB[j]) {
                    countB = 7-i;
                }
            }
        }
        if(countA <= countB) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
    }
}