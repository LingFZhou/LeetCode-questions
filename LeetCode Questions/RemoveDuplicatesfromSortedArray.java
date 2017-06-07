//2017-2-3
public class RemoveDuplicatesfromSortedArray {
	public int removeDuplicates(int[] nums) {
		int r = 0;
        if(nums.length == 0 ) return 0;
        if(nums.length == 1 ) return 1;
        for(int i = 0; i < nums.length - 1; i++){
        	if(nums[i] != nums[i+1]){
        		nums[r] = nums[i];
        		r++;
        	}
        }
        if(nums[nums.length-1] != nums[r]) nums[r] = nums[nums.length - 1];
        return r + 1 ;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicatesfromSortedArray test = new RemoveDuplicatesfromSortedArray();
		int[] nums = {1,1,2};
		int r = test.removeDuplicates(nums);
		System.out.println(r);
	}

}
