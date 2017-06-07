//2017-2-7
public class HouseRobber {
    public int rob(int[] nums) {
        int pre = 0;
        int cur = 0;
        for(int n : nums){
        	int temp = pre;
        	pre = Math.max(pre, cur);
        	cur = temp + n;
        }
        return Math.max(cur, pre);
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HouseRobber test = new HouseRobber();
		int[] nums = {1,2,3,4,5};
		int r = test.rob(nums);
		System.out.println(r);
	}

}
