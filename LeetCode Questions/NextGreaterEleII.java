//2017-2-4
public class NextGreaterEleII {
	public int[] nextGreaterElements(int[] nums) {
		int[] result = new int[nums.length];
        for(int i =0; i < nums.length; i++){
        	boolean flag = true;
        	for(int j = i + 1; j < nums.length; j++){
        		if(nums[j] > nums[i]) {
        			flag = false;
        			result[i] = nums[j];
        			break;
        		}
        	}
        	if(flag == true) {
        		for(int k = 0; k < i; k++){
        			if(nums[k] > nums[i]) {
            			flag = false;
            			result[i] = nums[k];
            			break;
            		}
        		}
        	}
        	if(flag == true) result[i] = -1;
        }
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NextGreaterEleII test = new NextGreaterEleII();
		int[] nums = {1,2,1};
		int[] result = test.nextGreaterElements(nums);
		for(int i : result) System.out.println(i);
	}

}
