import java.util.*;
//2017-2-21
public class MaximumXORofTwoNumbersinanArray {
    public int findMaximumXOR(int[] nums) {
    	int mask = 0,max = 0;
        for(int i = 31; i>=0; i--){
        	mask = mask|1<<i;
        	Set<Integer> set = new HashSet<>();
        	for(int n:nums) set.add(n&mask);
        	int temp = max|1<<i;
        	for(int n:set){
        		if(set.contains(temp^n)){
        			max = temp;
        			break;
        		}
        	}
        	
        }
        return max;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
