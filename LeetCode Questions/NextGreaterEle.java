//2017-2-4
public class NextGreaterEle {
	public int[] nextGreaterElement(int[] findNums, int[] nums) {
		int[] result = new int[findNums.length];
        for(int i =0; i < findNums.length; i++){
        	boolean flag = true;
        	for(int j = 0; j < nums.length; j ++){
        		
        		if(nums[j] == findNums[i]){
        			for(int k = j + 1; k < nums.length; k ++){
        				if(nums[k] > nums[j]) {
        					flag = false;
        					result[i] = nums[k];
        					break;
        				}
        			}
        		}
        		
        	}
        	if(flag == true) result[i] = -1;
        }
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NextGreaterEle test = new NextGreaterEle();
		int[] findNums = {2,4};
		int[] nums = {1,2,3,4};
		int[] result = test.nextGreaterElement(findNums, nums);
		for(int i : result) System.out.println(i);
	}

}
