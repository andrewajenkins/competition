import java.util.Scanner;
/*
 * http://codeforces.com/contest/602/problem/A
 */
public class CompareDifferentBases {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int radix1 = Integer.valueOf(sc.nextLine().split(" ")[1]);
		int num1 = process(sc.nextLine(), radix1);
		int radix2 = Integer.valueOf(sc.nextLine().split(" ")[1]);
		int num2 = process(sc.nextLine(), radix2);
		//System.out.println(num1+" "+radix1+" "+num2+" "+radix2);
		if(num1 > num2) 
			System.out.println(">");
		else if(num1 < num2) 
			System.out.println("<");
		else
			System.out.println("=");
		sc.close();
	}
	public static int process(String s, int radix) {
		int value = 0;
		String[] sa = reverse(s.split(" "));
		for(int i = 0; i < sa.length; i++) {
			int newValue = new Double(Math.pow(radix, i)).intValue() * Integer.valueOf(sa[i], radix);
			//System.out.println(new Double(Math.pow(radix, i)).intValue()+" * "+Integer.valueOf(sa[i], radix)+" += "+value+" = "+(value+newValue));
			value += newValue;
		}
		return value;
	}
	public static String[] reverse(String[] sa) {
		String[] r = new String[sa.length];
		int counter = sa.length-1;
		for(String s : sa) {
			r[counter--] = s;
		}
		//System.out.println("returning" + Arrays.toString(sa));
		return r;
	}
}
