//2017-4-22
public class LongestLineofConsecutiveOneinMatrix {
    public int longestLine(int[][] M) {
    	if(M.length==0||M[0].length==0) return 0;
    	if(M.length==1&&M[0].length==1) return M[0][0]==0?0:1;
        int m = M.length, n = M[0].length;
        int ma = 0;
        int[][] dp = new int[m][n];
        for(int i = 0; i < m; i++){
        	dp[i][0] = M[i][0]==0?0:1;
        }
        for(int i = 0; i < m; i++){
        	for(int j = 1; j < n; j++){
        		if(M[i][j]==0) dp[i][j] = 0;
        		else dp[i][j] = dp[i][j-1]+1;
        		ma = Math.max(ma, dp[i][j]);
        	}
        }
        int[][] dp1 = new int[m][n];
        for(int i = 0; i < n; i++){
        	dp1[0][i] = M[0][i]==0?0:1;
        }
        for(int i = 1; i < m; i++){
        	for(int j = 0; j < n; j++){
        		if(M[i][j]==0) dp1[i][j] = 0;
        		else dp1[i][j] = dp1[i-1][j]+1;
        		ma = Math.max(ma, dp1[i][j]);
        	}
        }
        int[][] dp2 = new int[m][n];
        for(int i = 0; i < m; i++){
        	dp2[i][0] = M[i][0]==0?0:1;
        }
        for(int i = 0; i < n; i++){
        	dp2[0][i] = M[0][i]==0?0:1;
        }
        for(int i = 1; i < m; i++){
        	for(int j = 1; j < n; j++){
        		if(M[i][j]==0) dp2[i][j] = 0;
        		else dp2[i][j] = dp2[i-1][j-1]+1;
        		ma = Math.max(ma, dp2[i][j]);
        	}
        }
        int[][] dp3 = new int[m][n];
        for(int i = 0; i < n; i++){
        	dp3[0][i] = M[0][i]==0?0:1;
        }
        for(int i = 0; i < m; i++){
        	dp3[i][n-1] = M[i][n-1]==0?0:1;
        }
        for(int i = 1; i < m; i++){
        	for(int j = 0; j < n-1; j++){
        		if(M[i][j]==0) dp3[i][j] = 0;
        		else dp3[i][j] = dp3[i-1][j+1]+1;
        		ma = Math.max(ma, dp3[i][j]);
        	}
        }
        return ma;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestLineofConsecutiveOneinMatrix test =  new LongestLineofConsecutiveOneinMatrix();
		int[][] M ={{1}
		 };
		int res = test.longestLine(M);
		System.out.println(res);
	}

}
