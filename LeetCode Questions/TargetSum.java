//2017-2-7
public class TargetSum {
    public int findTargetSumWays(int[] nums, int S) {
        int i = nums.length-1;
        int count = 0;
        count = helper(nums,i,S,count);
        return count;
    }
    public int helper(int[] nums, int i, int S,int count){
    	if(i == -1&& S==0) {
    		count++;
    		return count;
    	}
    	else if(i != -1){
    		return helper(nums,i-1,S-nums[i],count) + helper(nums,i-1,S+nums[i],count);
    	}
    	else return 0;
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TargetSum test = new TargetSum();
		int[] nums = {0,0,0,0,0,0,0,0,1};
		int S = 1;
		int r = test.findTargetSumWays(nums, S);
		System.out.println(r);
	}

}
