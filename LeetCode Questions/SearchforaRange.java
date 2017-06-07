//2017-4-20
public class SearchforaRange {
    public int[] searchRange(int[] nums, int target) {
    	int[] res = new int[2];
    	res[0]=-1;
    	res[1]=-1;
    	if(nums.length==0) return res;
    	if(nums.length==1){
    		if(nums[0]==target) return new int[]{0,0};
    		else return res;
    	}
        int left = 0, right = nums.length-1;
        while(left<right){
        	int mid = left + (right- left)/2;
        	if(nums[mid]<target) left = mid+1;
        	else right = mid;
        }
        if(nums[right]==target) res[0] = right;
        int left1 = 0, right1 = nums.length-1;
        while(left1<right1){
        	int mid = left1 + (right1- left1)/2;
        	if(nums[mid]>target) right1 = mid;
        	else left1 = mid+1;
        }
        if(nums[left1]==target) res[1] = left1;
        else if(left1>=1&&nums[left1-1]==target) res[1] = left1-1;
        return res;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchforaRange test = new SearchforaRange();
		int[] nums = {2,2};
		int[] res = test.searchRange(nums, 2);
		for(int i : res) System.out.println(i);
	}

}
