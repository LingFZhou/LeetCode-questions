import java.util.*;
//2017-4-23
public class OnethreetwoPattern {
	public boolean find132pattern(int[] nums) {
        int[] arr = Arrays.copyOf(nums, nums.length);
        for(int i = 1; i < nums.length; i++){
        	arr[i] = Math.min(arr[i-1], nums[i-1]);
        }
        for(int j = nums.length-1, top = nums.length; j>=0; j--){
        	if(nums[j]<arr[j]) continue;
        	else {
        		while(top<nums.length&&arr[top]<=arr[j]) top++;
        		if(top<nums.length&&nums[j]>arr[top]) return true;
        		arr[--top] = nums[j];
        	}
        }
        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OnethreetwoPattern test = new OnethreetwoPattern();
		int[] nums ={-2,1,-2};
		boolean res = test.find132pattern(nums);
		System.out.println(res);
	}

}
