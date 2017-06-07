//2017-4-29
public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
    	if(nums.length==0) return 0;
    	int m = nums.length;
        int sum = 0;
        int count = 0;
        for(int i = 0; i < m; i++){
        	for(int j = i; j < m; j++){
        		sum+=nums[j];
        		if(sum==k) count++;
        	}
        	sum = 0;
        }
        
        return count;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubarraySumEqualsK test = new SubarraySumEqualsK();
		int[] nums = {1,1,1,2,64,32,5,2,6,6,4,3,2,3,5,6,3,2,3,5,3,2,3,5,6,4,3,2,5,2,3,4};
		int res = test.subarraySum(nums, 2);
		System.out.println(res);
	}

}
