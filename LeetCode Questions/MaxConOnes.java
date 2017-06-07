//2017-1-26
public class MaxConOnes {
	public int findMaxConsecutiveOnes(int[] nums) {
        int maxsum = 0;
        int curmax = 0;
        int len = nums.length;
        for(int i = 0; i < len; i++){
        	curmax = nums[i] == 1? curmax+1:0;
        	maxsum = Math.max(curmax, maxsum);
            
        }
        return maxsum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxConOnes test = new MaxConOnes();
		int[] nums = {1,1,0,1,1,1,1};
		int a = test.findMaxConsecutiveOnes(nums);
		System.out.println(a);
	}

}
