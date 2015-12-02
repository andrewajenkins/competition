import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AlternativeThinking {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(args[0]));
		while(sc.hasNextLine()) {
			int a = Integer.parseInt(sc.nextLine().split(" ")[0]);
			char[] cr = sc.nextLine().toCharArray();
			boolean[] r = new boolean[cr.length];
			for(int i = 0; i < r.length; i++) {
				r[i] = cr[i] == '1';
			}
			int t = flip(r, 0, true, 0, 0);
			int f = flip(r, 0, false, 0, 0);
			System.out.println("Answer: "+Math.max(t, f)+" for input "+new String(cr));
		}
		sc.close();
	}

	public static int flip(boolean[] r, int i, boolean p, int f, int c) {
		if(i >= r.length) {
			return c;
		}
		if(f == 0) {
			if(r[i] == p) {
				return flip(r, i+1, f(p), f, c+1);
			} else {
				int iggy = flip(r, i+1, p, f, c);
				int flippy = flip(r, i, f(p), f+1, c);
				return Math.max(iggy, flippy);
			}
		} else if(f == 1) {
			if(r[i] == p) {
				return flip(r, i+1, f(p), f, c+1);
			} else {
				int iggy = flip(r, i+1, p, f, c);
				int term = flip(r, i+1, p, f+1, c+1);
				return Math.max(iggy, term);
			}
		} else {
			if(r[i] == p) {
				return flip(r, i+1, f(p), f, c+1);
			} else {
				return flip(r, i+1, p, f, c);
			}
		}
	}

	public static boolean f(boolean p) {
		return p ? false : true;
	}
}
/*
C. Alternative Thinking
time limit per test2 seconds
memory limit per test256 megabytes
inputstandard input
outputstandard output
Kevin has just recevied his disappointing results on the USA Identification of Cows Olympiad (USAICO) in the form of a binary string of length n. Each character of Kevin's string represents Kevin's score on one of the n questions of the olympiad—'1' for a correctly identified cow and '0' otherwise.

However, all is not lost. Kevin is a big proponent of alternative thinking and believes that his score, instead of being the sum of his points, should be the length of the longest alternating subsequence of his string. Here, we define an alternating subsequence of a string as a not-necessarily contiguous subsequence where no two consecutive elements are equal. For example, {0, 1, 0, 1}, {1, 0, 1}, and {1, 0, 1, 0} are alternating sequences, while {1, 0, 0} and {0, 1, 0, 1, 1} are not.

Kevin, being the sneaky little puffball that he is, is willing to hack into the USAICO databases to improve his score. In order to be subtle, he decides that he will flip exactly one substring—that is, take a contiguous non-empty substring of his score and change all '0's in that substring to '1's and vice versa. After such an operation, Kevin wants to know the length of the longest possible alternating subsequence that his string could have.

Input
The first line contains the number of questions on the olympiad n (1 ≤ n ≤ 100 000).

The following line contains a binary string of length n representing Kevin's results on the USAICO.

Output
Output a single integer, the length of the longest possible alternating subsequence that Kevin can create in his string after flipping a single substring.

Sample test(s)
input
8
10000011
output
5
input
2
01
output
2
Note
In the first sample, Kevin can flip the bolded substring '10000011' and turn his string into '10011011', which has an alternating subsequence of length 5: '10011011'.

In the second sample, Kevin can flip the entire string and still have the same score.
*/
