import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CleanerRobot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int last = 0;
        int w = sc.nextInt();
        int h = sc.nextInt();
        int total = (int)Math.floor((double)w * (double)h * 1.5);
        sc.nextLine();
        String[] room = new String[w];
        for(int i = 0; i < w; i++) {
            room[i] = sc.nextLine();
        }
        int x = 0;
        int y = 0;
        boolean breakOut = false;
        for(int i = 0; i < room.length; i++) {
            for(int j = 0; j < room[i].length(); j++) {
                char c = room[i].charAt(j);
                if(c == 'U' || c == 'R' || c == 'D' || c == 'L') {
                    x = j;
                    y = i;
                    breakOut = true;
                }
                if(breakOut) break;
            }
            if(breakOut) break;
        }
        int moves = 1;
        while(moves < total) {
            if (room[y].charAt(x) == 'U') {
                if (y - 1 >= 0 && room[y - 1].charAt(x) != '*') {
                    room[y] = replace(room[y], "x", x);
                    y -= 1;
                    ++moves;
                    if(room[y].charAt(x) != 'x') {
                       last = moves;
                    }
                    room[y] = replace(room[y], "U", x);
                } else {
                    room[y] = replace(room[y], "R", x);
                }
            } else if (room[y].charAt(x) == 'R') {
                if (x + 1 < room[y].length() && room[y].charAt(x + 1) != '*') {
                    room[y] = replace(room[y], "x", x);
                    x += 1;
                    ++moves;
                    if(room[y].charAt(x) != 'x') {
                        last = moves;
                    }
                    room[y] = replace(room[y], "R", x);
                } else {
                    room[y] = replace(room[y], "D", x);
                }
            } else if (room[y].charAt(x) == 'D') {
                if (y + 1 < room.length && room[y + 1].charAt(x) != '*') {
                    room[y] = replace(room[y], "x", x);
                    y += 1;
                    ++moves;
                    if(room[y].charAt(x) != 'x') {
                        last = moves;
                    }
                    room[y] = replace(room[y], "D", x);
                } else {
                    room[y] = replace(room[y], "L", x);
                }
            } else if (room[y].charAt(x) == 'L') {
                if (x - 1 >= 0 && room[y].charAt(x - 1) != '*') {
                    room[y] = replace(room[y], "x", x);
                    x -= 1;
                    ++moves;
                    if(room[y].charAt(x) != 'x') {
                        last = moves;
                    }
                    room[y] = replace(room[y], "L", x);
                } else {
                    room[y] = replace(room[y], "U", x);
                }
            }
        }
        System.out.println(last);
    }

    public static String replace(String s, String r, int x) {
        String a = s.substring(0, x);
        String b = s.substring(x+1, s.length());
        String t = s.substring(0, x) + r + s.substring(x+1, s.length());
        return s.substring(0, x) + r + s.substring(x+1, s.length());
    }
}
