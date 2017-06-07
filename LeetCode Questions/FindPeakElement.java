//2017-3-19
public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        int left = 1, right = nums.length-2;
        while(left<right){
        	if(left+1==right){
        		if(nums[left]<nums[right]) return right;
        		return left;
        	}
        	int mid = left + (right-left)/2;
        	if(nums[mid]>nums[mid-1]&&nums[mid]>nums[mid+1]) return mid;
        	else if(nums[mid]<nums[mid+1]&&nums[mid-1]<nums[mid]) left = mid+1;
        	else right = mid-1;
        }
        return left;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindPeakElement test = new FindPeakElement();
		int[] nums = {-2,2,1,-1};
		int res = test.findPeakElement(nums);
		System.out.println(res);
	}

}
