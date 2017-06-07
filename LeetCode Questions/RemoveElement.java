//2017-2-3
public class RemoveElement {
	public int removeElement(int[] nums, int val) {
        int r = 0;
        for(int i = 0; i < nums.length; i++){
        	if(nums[i] != val){
        		nums[r] = nums[i];
        		r++;
        	};
        }
        return r;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveElement test = new RemoveElement();
		int[] nums = {2,4};
		int val = 2;
		int r = test.removeElement(nums, val);
		System.out.println(r);
	}

}
