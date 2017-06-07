//2017-4-11
public class SearchinRotatedSortedArray {
    public int search(int[] nums, int target) {
    	int left = 0, right = nums.length-1;
        while(left<right){
        	int mid = left + (right-left)/2;
        	if(nums[mid]>nums[right]) left = mid+1;
        	else right = mid;
        }
        int ro = left;
        left = 0; right = nums.length-1;
        while(left<=right){
        	int mid = left + (right-left)/2;
        	int mi = (mid+ro)%nums.length;
        	if(nums[mi]==target) return mi;
        	if(nums[mi]>target) right=mid-1;
        	else left = mid+1;
        }
        return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchinRotatedSortedArray test = new SearchinRotatedSortedArray();
		int[] nums = {2,2,2,0,2,2};
		int res = test.search(nums, 2);
		System.out.println(res);
	}

}
