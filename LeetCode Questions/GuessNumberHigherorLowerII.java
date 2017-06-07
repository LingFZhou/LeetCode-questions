//2017-3-31
public class GuessNumberHigherorLowerII {
    public int getMoneyAmount(int n) {
        int[][] dp = new int[n+1][n+1];
        for(int i = 1; i < n; i++){
        	for(int j = 0; i+j<=n;j++){
        		int end = i+j;
        		dp[j][end] = Integer.MAX_VALUE;
        		for(int k = j; k <= end; k++)
        			dp[j][end] = Math.min(dp[j][end], 
        				k+Math.max(k-1>=j?dp[j][k-1]:0,k+1<=end?dp[k+1][end]:0 ));
        	}
        }
        return dp[1][n];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
