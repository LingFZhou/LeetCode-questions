//2017-4-22
public class UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    	if(obstacleGrid.length==0||obstacleGrid[0].length==0) return 0;
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        if(obstacleGrid[0][0]==1) dp[0][0]=0;
        else dp[0][0]=1;
        for(int i = 1; i < m; i++){
        	if(obstacleGrid[i][0]==1) dp[i][0]=0;
        	else dp[i][0]=dp[i-1][0];
        }
        for(int i = 1; i < n; i++){
        	if(obstacleGrid[0][i]==1) dp[0][i]=0;
        	else dp[0][i]=dp[0][i-1];
        }
        for(int i = 1; i < m; i++){
        	for(int j = 1; j < n; j++){
        		if(obstacleGrid[i][j]==1) dp[i][j]=0;
        		else dp[i][j] = dp[i][j-1]+dp[i-1][j];
        	}
        }
        return dp[m-1][n-1];
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniquePathsII test = new UniquePathsII();
		int[][] nums = {{0,0,0},
		  {0,1,0},
		  {0,0,0}};
		int res = test.uniquePathsWithObstacles(nums);
		System.out.println(res);
	}

}
