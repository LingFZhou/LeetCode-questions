//2017-3-27
public class KthLargestElementinanArray {
    public int findKthLargest(int[] nums, int k) {
    	if(nums.length == 0) return -1;
    	if(k>nums.length) return -1;
        int[] res = sort(nums,0,nums.length-1);
        return res[res.length-k];
    }
    public int[] sort(int[] nums,int low, int high){
    	int mid = low + (high-low)/2;
    	if(low<high){
    		sort(nums,low,mid);
    		sort(nums,mid+1,high);
    		merge(nums,low,mid,high);
    	}
    	return nums;
    }
    public void merge(int[] nums, int low, int mid, int high){
    	int[] temp = new int[high - low + 1];
    	int k = 0;
    	int i = low, j = mid+1;
    	while(i<=mid&&j<=high){
    		if(nums[i]<nums[j]) temp[k++] = nums[i++];
    		else temp[k++] = nums[j++];
    	}
    	while(i<=mid) temp[k++] = nums[i++];
    	while(j<=high) temp[k++] = nums[j++];
    	for(int m = low,n=0; m <= high; m++,n++) nums[m] = temp[n];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KthLargestElementinanArray test = new KthLargestElementinanArray();
		int[] nums = {2,1};
		int res = test.findKthLargest(nums, 1);
		System.out.println(res);
	}

}
