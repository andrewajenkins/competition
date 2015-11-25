package prob.CFR602DIV2;

import java.util.Scanner;
/*
 * http://codeforces.com/contest/602/problem/B
 */
public class ApproxConstantRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		String[] ns = sc.nextLine().split(" ");
		int result = -1;
		for(int i = 0; i < ns.length; i++) {
			int j = i;
			int min = Integer.parseInt(ns[i]);
			int max = Integer.parseInt(ns[i]);
			while((max - min) <= 1 && ++j < ns.length) {
				int val = Integer.parseInt(ns[j]);
				if(val < min) min = val;
				if(val > max) max = val;
			}
			result = Math.max(result, j-i);
		}
		System.out.println(result);
		sc.close();
	}
}