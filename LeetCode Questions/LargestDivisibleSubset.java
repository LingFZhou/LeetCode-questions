import java.util.*;
//2017-3-26
public class LargestDivisibleSubset {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> list = new ArrayList<>();
        if(nums.length == 0) return list;
        Arrays.sort(nums);
        int[] dp = new int[nums.length];
        dp[0] = 1;
        for(int i = 1; i < nums.length; i++){
        	for(int j = i-1; j>=0;j--){
        		if(nums[i]%nums[j]==0)
        			dp[i] = Math.max(dp[i], dp[j]+1);
        	}
        }
        int index = 0;
        for(int i = 1; i < dp.length; i++) index = dp[i]>dp[index]?i:index;
        int d = dp[index];
        int t = nums[index];
        for(int i = index; i >= 0; i--){
        	if(t%nums[i]==0&&dp[i]==d) {
        		list.add(nums[i]);
        		t = nums[i];
        		d--;
        	}
        }
        return list;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
