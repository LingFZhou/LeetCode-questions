import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.*;
//2017-1-30
public class FindDisappearedNumbers {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> has = new HashSet<>();
		int[] nums = {3,1,3,3,1,1,1,3,4,7};
		List<Integer> arr = new ArrayList<>();
		Arrays.sort(nums);
		for(int i = 0; i < nums.length; i++){
			has.add(nums[i]);
		}
		for(int i = 0; i < nums.length; i++){
			if(!has.contains(i+1)) arr.add(i+1);
		}
		
		
		System.out.println(arr);
		
	}

}
