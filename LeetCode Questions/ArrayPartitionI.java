import java.util.Arrays;
//2017-4-22
public class ArrayPartitionI {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i < nums.length/2; i++){
        	sum+=nums[2*i];
        }
        return sum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayPartitionI test = new ArrayPartitionI();
		int[]nums = {1,4,2,3};
		int sum = test.arrayPairSum(nums);
		System.out.println(sum);
	}

}
