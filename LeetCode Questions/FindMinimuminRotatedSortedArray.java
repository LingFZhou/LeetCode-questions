//2017-3-27
public class FindMinimuminRotatedSortedArray {
    public int findMin(int[] nums) {
    	if(nums.length == 0) return 0;
        int left = 0, right = nums.length-1;
        while(left<right){
        	if(left+1==right){
        		if(nums[left]>nums[right]) return nums[right];
        		else return nums[left];
        	}
        	int mid = left + (right-left)/2;
        	if(nums[left]>nums[right]&&nums[mid]>nums[right]) left = mid;
        	else right = mid;
        }
        return nums[left];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindMinimuminRotatedSortedArray test = new FindMinimuminRotatedSortedArray();
		int[] nums = {5,1,2,3,4};
		int res = test.findMin(nums);
		System.out.println(res);
	}

}
