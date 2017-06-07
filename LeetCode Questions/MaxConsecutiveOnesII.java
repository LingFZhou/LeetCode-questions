//2017-3-12
public class MaxConsecutiveOnesII {
    public int findMaxConsecutiveOnes(int[] nums) {
        int zero = 0, one = 0, maxcon = 0;
        for(int i = 0; i < nums.length; i++){
        	one++;
        	if(nums[i]==0){
        		zero = one;
        		one = 0;
        	}
        	maxcon = Math.max(maxcon, zero+one);
        }
        return maxcon;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
