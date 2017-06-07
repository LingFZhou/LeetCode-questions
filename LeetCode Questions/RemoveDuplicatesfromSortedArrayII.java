import java.util.*;
//2017-3-26
public class RemoveDuplicatesfromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int n: nums){
        	if(i<2||n>nums[i-2])
        		nums[i++] = n;
        }
        return i;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicatesfromSortedArrayII test = new RemoveDuplicatesfromSortedArrayII();
		int[] nums = {1,1,1,2};
		int res = test.removeDuplicates(nums);
		System.out.println(res);
	}

}
