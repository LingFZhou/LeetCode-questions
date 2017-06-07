//2017-4-10
public class RangeSumQuery2DMutable {
	int[][] dp ;
	int[][] ma;
    public RangeSumQuery2DMutable(int[][] matrix) {
    	if(matrix.length==0||matrix[0].length == 0) return;
    	
        int m = matrix.length;
        int n = matrix[0].length;
        ma = new int[m][n];
        dp = new int[m+1][n+1];
        for(int i = 0; i < m; i++){
        	for(int j = 0; j < n; j++){
        		ma[i][j] = matrix[i][j];
        	}
        }
        for(int i = 1; i <= m; i++){
        	for(int j = 1; j <= n; j++){
        		dp[i][j] = dp[i-1][j]+dp[i][j-1]-dp[i-1][j-1]+matrix[i-1][j-1];
        	}
        }
    }
    
    public void update(int row, int col, int val) {
        int temp = ma[row][col];
        ma[row][col] = val;
        for(int i = row; i <= ma.length-1;i++){
        	for(int j = col; j <= ma[0].length-1; j++){
        		dp[i+1][j+1] = dp[i+1][j+1]-temp+val; 
        	}
        }
        
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
    	return dp[row2+1][col2+1]-dp[row2+1][col1]-dp[row1][col2+1]+dp[row1][col1];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
