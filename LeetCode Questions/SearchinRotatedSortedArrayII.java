//2017-4-11
public class SearchinRotatedSortedArrayII {
	public boolean search(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        while(left<right){
        	while(nums[left]==nums[right]&&left<right) left++;
        	int mid = left + (right-left)/2;
        	if(nums[mid]>nums[right]) left = mid+1;
        	else right = mid;
        }
        int ro = left;
        left = 0; right = nums.length-1;
        while(left<=right){
        	int mid = left + (right-left)/2;
        	int mi = (mid+ro)%nums.length;
        	if(nums[mi]==target) return true;
        	if(nums[mi]>target) right=mid-1;
        	else left = mid+1;
        }
        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchinRotatedSortedArrayII test = new SearchinRotatedSortedArrayII();
		int[] nums = {2,2,2,0,2,2};
		boolean res = test.search(nums, 0);
		System.out.println(res);
	}

}
