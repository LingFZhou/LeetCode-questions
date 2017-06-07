//2017-2-8
public class PerfectSquares {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        for(int i = 1; i <= n; i++){
        	int j = 1;
        	int min = Integer.MAX_VALUE;
        	while(i - j*j >= 0){
        		dp[i] = Math.min(min, dp[i-j*j] + 1);
        		j++;
        		min = dp[i];
        	}
        }
        return dp[n];
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PerfectSquares test = new PerfectSquares();
		int re = test.numSquares(13);
		System.out.println(re);
	}

}
