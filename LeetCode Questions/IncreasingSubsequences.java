import java.util.*;
//2017-3-28
public class IncreasingSubsequences {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        helper(new ArrayList<Integer>() , 0, nums, res);
        System.out.println(res);
        return res;
    }
    public void helper(List<Integer> list, int index, int[] nums,List<List<Integer>> res){
    	if(list.size()>1) res.add(new ArrayList<Integer>(list));
    	Set<Integer> set = new HashSet<>();
    	for(int i = index; i<nums.length;i++){
    		if(set.contains(nums[i])) continue;
    		if(list.size()==0||nums[i]>=list.get(list.size()-1)){
    			list.add(nums[i]);
    			set.add(nums[i]);
    			helper(list,i+1,nums,res);
    			list.remove(list.size()-1);
    		}
    	}
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4 6 7 8 9
		IncreasingSubsequences test = new IncreasingSubsequences();
		int[] nums = {4,2,8,7,7,9};
		test.findSubsequences(nums);
	}

}
