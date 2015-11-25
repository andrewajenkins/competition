import java.util.Scanner;

public class CFR592x2xBxMonsterSquirrel {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int[] s = new int[sc.nextInt()+1];
        if(s.length == 3) {
            System.out.println(1);
        } else if(s.length == 4) {
            System.out.println(4);
        } else {
            int offset = 2;
            s[3] = 1;
            s[4] = 4;
            int i = 5;
            while (i < s.length) {
                s[i] = s[i - 1] + (s[i - 1] - s[i - 2] + offset++);
                i++;
            }
            System.out.println(s[s.length - 1]);
        }
    }
}