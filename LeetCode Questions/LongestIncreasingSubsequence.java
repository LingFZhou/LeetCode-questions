import java.util.Arrays;
//2017-3-30
public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
    	int res = 0;
    	int[] dp = new int[nums.length];
    	for(int m : nums){
    		int i = Arrays.binarySearch(dp, 0, res, m);
    		if(i < 0) i = -i-1;
    		dp[i] = m;
    		if(i==res) res++;
    	}
    	return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestIncreasingSubsequence test = new LongestIncreasingSubsequence();
		int[] nums = {10,9,2,5,3,7,101,18};
		int res = test.lengthOfLIS(nums);
		System.out.println(res);
	}

}
