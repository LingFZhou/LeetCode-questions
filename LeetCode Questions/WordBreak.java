import java.util.*;
//2017-4-22
public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
    	boolean[] dp = new boolean[s.length()+1];
    	dp[0] = true;
    	for(int j = 1; j<=s.length(); j++){
    		for(int i = 0; i < j; i++){
    			if(dp[i]&&wordDict.contains(s.substring(i,j))){
    				dp[j]=true;
    				break;
    			}
    		}
    	}
    	return dp[s.length()];
//        int m = s.length();
//        boolean[][] dp = new boolean[m][m];
//        for(int i = 0; i< m; i++)
//        	for(int j = 0; j<m;j++)
//        		dp[i][j] = false;
//        for(int i = 0; i < m; i++)
//        	if(wordDict.contains(""+s.charAt(i))) dp[i][i] = true;
//        for(int j = 1; j < m; j++){
//        	for(int i = j-1; i>=0; i--){
//        		if(wordDict.contains(s.substring(i,j+1))){
//        			dp[i][j] = true;
//        			continue;
//        		}
//        		for(int k = i; k<j; k++){
//        			dp[i][j] = dp[i][j]||(dp[i][k]&&dp[k+1][j]);
//        		}
//        	}
//        }
//        return dp[0][m-1];
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordBreak test = new WordBreak();
		String s = "a";
		List<String > list = new ArrayList<>();
		list.add("a");
		//list.add("ode");
		boolean res = test.wordBreak(s, list);
		System.out.println(res);
	}

}
