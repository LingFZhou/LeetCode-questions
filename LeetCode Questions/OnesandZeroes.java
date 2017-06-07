//2017-2-17
public class OnesandZeroes {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m+1][n+1];
        for(String s : strs){
        	int[] co = count(s);
        	for(int i = m; i > co[0];i--){
        		for(int j = n; j > co[1]; j--)
        			dp[i][j] = Math.max(dp[i-co[0]][j-co[1]] + 1, dp[i][j]);
        	}
        }
        return dp[m][n];
        	
    }
    public int[] count(String str){
    	int[] count = new int[2];
    	char[] c = str.toCharArray();
    	for(int i = 0; i < str.length(); i++){
    		count[c[i]-'0']++;
    	}
    	return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
