import java.util.Arrays;
//2017-2-8
public class ThreeSumSmaller {
    public int threeSumSmaller(int[] nums, int target) {
        Arrays.sort(nums);
        int count = 0;
        for(int i = 0; i<nums.length-2;i++){
        	int left = i + 1;
        	int right = nums.length-1;
        	while(left<right){
	        	if(nums[i] + nums[left]+nums[right] < target){
	        		count+=right-left;
	        		left++;
	        	}
	        	else right--;
        	}
        }
        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreeSumSmaller test = new ThreeSumSmaller();
		int[] nums = {-2,0,1,3};
		int re = test.threeSumSmaller(nums, 2);
		System.out.println(re);
	}

}
