//2017-2-27
public class RangeSumQueryImmutable {
	int[] nums;
	int[] sum;
    public RangeSumQueryImmutable(int[] nums) {
        this.nums = nums;
        sum = new int[nums.length];
        if(nums.length != 0){
	        sum[0] = nums[0];
	        for(int i = 1; i < nums.length;i++){
	        	sum[i] = sum[i-1] + nums[i];
	        }
        }
    }
    
    public int sumRange(int i, int j) {
    	if(nums.length == 0) return 0;
        return sum[j]-sum[i]+nums[i];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {};
		RangeSumQueryImmutable test = new RangeSumQueryImmutable(nums);
		int res = test.sumRange(0,5);
		System.out.println(res);
	}

}
