import java.util.*;
//2017-2-21
public class RandomPickIndex {
    private int[] nums;
	public RandomPickIndex(int[] nums) {
        this.nums = nums;
    }
    
    public int pick(int target) {
        int[] nums = this.nums;
        List<Integer> list = new ArrayList();
        for(int i = 0; i < nums.length; i++){
        	if(nums[i]==target) list.add(i);
        }
        int index = (int)(Math.random()*list.size());
        int res = list.get(index);
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,3,3};
		RandomPickIndex test = new RandomPickIndex(nums);
		int res = test.pick(3);
		System.out.println(res);
	}

}
