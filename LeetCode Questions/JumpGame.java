//2017-5-5
public class JumpGame {
    public boolean canJump(int[] nums) {
        int len = nums.length;
        int ma = 0;
        if(len==1) return true;
        for(int i = 0; i < len-1; i++){
        	int m = i+nums[i];
        	ma = Math.max(m, ma);
        	if(ma==i) return false;
        	if(ma>=len-1) return true;
        	int count = i;
        	for(int j = 1; j <= nums[i]; j++){
        		if(i+j+nums[i+j]>ma){
        			i=i+j-1;
        			break;
        		}
        		i=count+j-1;
        	}
        	
        }
        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JumpGame test = new JumpGame();
		int[]nums = {0,1};
		System.out.println(test.canJump(nums));
	}

}
