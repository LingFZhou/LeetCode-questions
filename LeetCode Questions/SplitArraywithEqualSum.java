import java.util.*;

public class SplitArraywithEqualSum {
    public boolean splitArray(int[] nums) {
    	int[] sums = new int[nums.length];  
        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();  
        for(int i = 0; i < nums.length; i++){
        	if(nums[i]<0) nums[i] = -nums[i];
        }
        int tmp = 0;  
        for (int i = 0; i < nums.length; ++i) {
        	tmp += nums[i];  
            sums[i] = tmp;  
            hashMap.put(tmp, i);  
        }  
  
        for (int pos1 = 1; pos1 < nums.length; pos1++) {  
            int sum = sums[pos1] - nums[pos1];
            if (hashMap.containsKey(sum + sums[pos1])) {  
                int pos2 = hashMap.get(sum + sums[pos1]) + 1;            
                if (pos2 < nums.length && hashMap.containsKey(sum + sums[pos2])) {  
                    int pos3 = hashMap.get(sum + sums[pos2]) + 1;              
                    if (pos3 < nums.length && sums[sums.length - 1] - sums[pos3] == sum) {  
                        return true;  
                    }  
                }  
            }  
        }  
        return false;  
//        if(nums.length < 7) return false;
//        int[][] dp = new int[nums.length][nums.length];
//        for(int i = 0; i < nums.length; i++){
//        	for(int j = 0; j < nums.length; j++)
//        		dp[i][j] = sum(i, j, nums);
//        }
//        for(int i = 1; i <= nums.length-6; i++){
//        	for(int j = i+2; j <= nums.length-4; j++){
//        		for(int k = j+2; k < nums.length-1; k++){
//        			if(dp[0][i-1]==dp[i+1][j-1]&&dp[i+1][j-1]==dp[j+1][k-1]&&
//        					dp[j+1][k-1]==dp[k+1][nums.length-1])
//        				return true;
//        		}
//        	}
//        }
//        return false;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SplitArraywithEqualSum test = new SplitArraywithEqualSum();
		int[] nums = {-1,0,-1,0,-1,0,-1};
		boolean res = test.splitArray(nums);
		System.out.println(res);
	}

}
