import java.util.*;
//2017-4-9
public class MissingRanges {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
    	List<String> res = new ArrayList<>();
    	if(nums.length==0){
    		if(lower==upper){ res.add(upper+""); return res;}
    		else {res.add(lower+"->"+upper); return res;}
    	}
    	for(int i = 0; i < nums.length; i++){
    		if(i==0){
    			if(lower==nums[i]) {}
    			else if(lower+1<nums[i]) res.add(lower+"->"+(nums[i]-1));
    			else if(lower+1==nums[i]) res.add(lower+"");
    		}
    		while(i+1<nums.length)
				if((nums[i]+1==nums[i+1])||(nums[i]==nums[i+1])) i++;
				else break;
    		if(i==nums.length-1){
    			if(upper==nums[i]) {}
    			else if(nums[i]+1<upper) res.add((nums[i]+1)+"->"+upper);
    			else if(upper==nums[i]+1) res.add(upper+"");
    		}
    		if(i+1<nums.length){
    			if(nums[i]+2==nums[i+1]) res.add((nums[i]+1)+"");
    			else if(nums[i]+2<nums[i+1]) res.add((nums[i]+1)+"->"+(nums[i+1]-1));
    			
    		}	
    	}
    	return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MissingRanges test = new MissingRanges();
		int[] nums = { 1,1,2};
		List<String> res = test.findMissingRanges(nums, 0, 99);
		System.out.println(res);
	}

}
