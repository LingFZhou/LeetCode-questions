import java.util.Arrays;
//2017-5-13
public class ShortestUnsortedContinuousSubarray {
    public int findUnsortedSubarray(int[] nums) {
    	if(nums.length==0||nums.length==1) return 0;
        int[] num = new int[nums.length];
        for(int i = 0; i < nums.length; i++) num[i] = nums[i];
        Arrays.sort(num);
        int start = -1;
        int end = -2;
        for(int i = 0; i < nums.length; i++){
        	if(num[i]!=nums[i]){
        		start = i;
        		break;
        	}
        }
        for(int j = nums.length-1; j >=0; j--){
        	if(num[j]!=nums[j]){
        		end = j;
        		break;
        	}
        }
        return end-start+1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShortestUnsortedContinuousSubarray test = new ShortestUnsortedContinuousSubarray();
		int[] nums = {2,3,3,4,8, 9, 15};
		System.out.println(test.findUnsortedSubarray(nums));
	}

}
