import java.util.Arrays;
//2017-1-31
public class MinMoves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,4,7};
		Arrays.sort(nums);
		int count = 0;
		for(int n : nums) count += n-nums[0];
		System.out.println(count);
	}

}
