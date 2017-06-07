import java.util.*;
//2017-3-31
public class PartitionEqualSubsetSum {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int n: nums) sum+=n;
        if(sum%2!=0) return false;
        int subsum = sum/2;
        boolean[] dp = new boolean[subsum+1];
        for(int i = 0; i < dp.length; i++) dp[i] = false;
        dp[0] = true;
        for(boolean f : dp) System.out.print(f+" ");
    	System.out.println();
        for(int i = 0; i < nums.length; i++){
        	for(int j = subsum; j >= nums[i]; j--){
        		dp[j] = dp[j]||dp[j-nums[i]];
        	}
        	for(boolean f : dp) System.out.print(f+" ");
        	System.out.println();
        }
        return dp[subsum];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PartitionEqualSubsetSum test = new PartitionEqualSubsetSum();
		int[] nums = {1,11,5,5};
		test.canPartition(nums);

	}
}
