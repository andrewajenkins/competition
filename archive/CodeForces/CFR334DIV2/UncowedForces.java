import java.util.Scanner;

public class UncowedForces {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] ss = sc.nextLine().split(" ");
		String[] us = sc.nextLine().split(" ");
		String[] h = sc.nextLine().split(" ");
		int[] mp = {500, 1000, 1500, 2000, 2500};
		int ts = 0;
		for(int i = 0; i < ss.length; i++) {
			int ssi = Integer.parseInt(ss[i]);
			int usi = Integer.parseInt(us[i]);
			double eq = ((1d-(ssi/250d)) * mp[i]) - (50d * usi);
			ts += Math.max(.3d * mp[i], eq);
		}
		ts += Integer.parseInt(h[0]) * 100;
		ts -= Integer.parseInt(h[1]) * 50;
		System.out.println(ts);
		sc.close();
	}
}