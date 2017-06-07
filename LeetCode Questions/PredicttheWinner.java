//2017-2-6
public class PredicttheWinner {
    public boolean PredictTheWinner(int[] nums) {
        return helper(0,nums.length-1,nums)>=0;
    }
    public int helper(int s, int e, int[] nums){
    	return s==e?nums[s]:Math.max(nums[s]-helper(s+1,e,nums), nums[e]-helper(s,e-1,nums));
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PredicttheWinner test = new PredicttheWinner();
		int[] nums = {1,5,233,2};
		boolean flag = test.PredictTheWinner(nums);
		System.out.println(flag);
	}

}
