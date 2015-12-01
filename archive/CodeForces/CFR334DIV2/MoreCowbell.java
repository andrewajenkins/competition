import java.util.Scanner;

public class MoreCowbell {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] nums = sc.nextLine().split(" ");
		String[] scb = sc.nextLine().split(" ");
		sc.close();
		Integer.parseInt(nums[0]);
		int nb = Integer.parseInt(nums[1]);
		int sb = nb - ((int)Math.floor(scb.length/2d));
		int max = Integer.MIN_VALUE;
		int ri = 0;
		boolean first = true;
		for(int i = scb.length-1; i >= ri; i--) {
			int n = 0;
			if(sb-- >= 1) {
				n = Integer.parseInt(scb[i]);
			} else if(first && i % 2 == 0) {
				n = Integer.parseInt(scb[i]);
				first = false;
			} else {
				n = Integer.parseInt(scb[i]) + Integer.parseInt(scb[ri++]);
			}
			if(n > max) {
				max = n;
			}
		}
		System.out.println(max);
	}
}