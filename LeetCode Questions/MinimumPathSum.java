//2017-4-3
public class MinimumPathSum {	
    public int minPathSum(int[][] grid) {
    	int m = grid.length, n = grid[0].length;
        int[][] dp = new int[m][n];
        for(int i = 0; i<m; i++){
        	for(int j = 0; j<n; j++){
        		if(i==0&&j==0) dp[i][j]=grid[i][j];
        		else if(i==0) dp[i][j] = grid[i][j]+dp[i][j-1];
        		else if(j==0) dp[i][j] = grid[i][j]+dp[i-1][j];
        		else dp[i][j] = Math.min(grid[i][j]+dp[i-1][j], grid[i][j]+dp[i][j-1]);
        	}
        }
        for(int i = 0; i<m; i++){
        	for(int j = 0; j<n; j++){
        		System.out.print(dp[i][j]+" ");
        	}
        	System.out.println();
        }
        	
        return dp[m-1][n-1];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinimumPathSum test = new MinimumPathSum();
		int[][] grid = {
			{1,3,1},
			{1,5,1},
			{4,2,1}};
		test.minPathSum(grid);
	}

}
