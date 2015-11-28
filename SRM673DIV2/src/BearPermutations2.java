
public class BearPermutations2 {
	static final int inf = 110;
	static int[][] c = new int[inf][inf];
	static int[][] dp = new int[inf][inf];
	static int[] sumdp = new int[inf];
	static int[] fact = new int[inf];
	
	public static int getSum(int a, int b) {
		int mod = b;
		fact[0] = c[0][0] = 1;
		for(int i = 1; i < inf; i++) {
			fact[i] = (fact[i-1]*i) % mod;
			for(int j = 0; j <= i; j++) {
				c[i][j] = (c[i-1][j] + (j==0 ? 0:c[i-1][j-1])) % mod;
			}
		}
		for(int i = 3; i <= a; i++) {
			dp[i][1] = dp[i][i] = sumdp[i-1];
			sumdp[i] = (2*sumdp[i-1]) % mod;
			for(int j = 2; j < i; j++) {
				int a1 = j - 1;
				int a2 = i - j;
				dp[i][j] = (sumdp[a1]*fact[a2]+sumdp[a2]*fact[a1]) % mod;
				for(int k = j + 1; k <= i; k++) {
					dp[i][j] = (dp[i][j] + ((((k*fact[a1])%mod)*fact[a2-1])%mod))%mod;
				}
				for(int k = 1; k < j; k++) {
					dp[i][j] = (dp[i][j]-((((k*fact[a2])%mod)*fact[a1-1])%mod))%mod;
				}
				dp[i][j] = (dp[i][j]+mod)%mod;
				dp[i][j] = (dp[i][j]*c[i-1][j-1])%mod;
				sumdp[i]=(sumdp[i]+dp[i][j])%mod;
			}
		}
		return sumdp[a];
	}
}
