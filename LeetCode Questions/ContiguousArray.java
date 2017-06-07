import java.util.*;
//2017-4-2
public class ContiguousArray {
    public int findMaxLength(int[] nums) {
    	Map<Integer,Integer> map = new HashMap<Integer, Integer>();
    	map.put(0, -1);
    	for(int i = 0; i < nums.length; i++){
    		if(nums[i]==0) nums[i] = -1;
    	}
    	int curmax = 0;
    	int sum = 0;
    	for(int i = 0; i < nums.length; i++){
    		sum += nums[i];
    		if(map.containsKey(sum)) curmax = Math.max(curmax, i-map.get(sum));
    		else map.put(sum, i);
    	} 
    	return curmax;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
