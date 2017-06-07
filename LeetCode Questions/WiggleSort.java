import java.util.Arrays;
//2017-2-5
public class WiggleSort {
    public void wiggleSort(int[] nums) {
//    	for(int i=0;i<nums.length;i++)
//            if(i%2==1){
//               if(nums[i-1]>nums[i]) swap(nums, i);
//            }else if(i!=0 && nums[i-1]<nums[i]) swap(nums, i)
        int[] nums1 = new int[nums.length];
        int[] nums2 = new int[nums.length];
        Arrays.sort(nums);
        for(int i = nums.length - 1; i >= 0; i--){
        	nums1[nums.length - i - 1] = nums[i];
        }
       
        for(int i = 0, j = 0; j <nums.length; i++, j += 2){
        	nums2[j] = nums[i];
        	if(j != nums.length - 1)
        	nums2[j + 1] = nums1[i];
        	
        }
        for(int i = 0; i < nums.length; i++){
        	nums[i] = nums2[i];
        }
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WiggleSort test = new WiggleSort();
		int[] nums = {1,5,4,6,3};
		test.wiggleSort(nums);
		for(int n : nums) System.out.println(n);
	}

}
