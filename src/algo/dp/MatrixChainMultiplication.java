package algo.dp;

import java.util.Arrays;

public class MatrixChainMultiplication {
	public static void main(String[] args) {
		int[][] a = {{1, 2},{3, 4}};
		int[][] b = {{5, 6},{7, 8}};
		int[][] r = squareMatrixMultiply(a, b);
		for(int[] c : r) {
			System.out.println(Arrays.toString(c));
		}
	}

	private static int[][] squareMatrixMultiply(int[][] a, int[][] b) {
		int n = a[0].length;
		int[][] c = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				c[i][j] = 0;
				for(int k = 0; k < n; k++) {
					c[i][j] += (a[i][k] * b[k][j]);
				}
			}
		}
		return c;
	}
}
