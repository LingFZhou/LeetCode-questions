import java.util.*;
//2017-5-16
public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
    	List<List<Integer>> list = new ArrayList<>();
    	int[] used = new int[nums.length];
    	helper(nums,new ArrayList(),list,used);
    	return list;
    	
    }
    public void helper(int[] nums, List<Integer> lis,List<List<Integer>> list, int[] used){
    	if(lis.size()==nums.length){
    		list.add(lis);
    		return;
    	}
    	for(int i = 0; i < nums.length; i++){
    		if(used[i]==0){
    			used[i] = 1;
    			lis.add(nums[i]);
    			helper(nums,new ArrayList(lis),list,used);
    			lis.remove(lis.size()-1);
    			used[i]=0;
    			
    		}
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Permutations test = new Permutations();
		int[]nums = {1,2,3};
		System.out.println(test.permute(nums));
	}

}
