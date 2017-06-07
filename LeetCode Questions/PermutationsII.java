import java.util.*;
//2017-4-3
public class PermutationsII {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int[] use = new int[nums.length];
        helper(list,new ArrayList<Integer>(),nums,0,use);
        return list;
    }
    public void helper(List<List<Integer>> list, List<Integer> lis,
    		int[] nums, int index,int used[]){
    	if(lis.size()==nums.length){ list.add(lis); return;}
    	for(int i = 0; i<nums.length;i++){
    		if(used[i]==0){
	    		used[i] = 1;
	    		lis.add(nums[i]);
	    		helper(list,new ArrayList<Integer>(lis),nums,index+1,used);
	    		lis.remove(lis.size()-1);
	    		used[i] = 0;
	    		while(i<nums.length-1&&nums[i]==nums[i+1]) i++;
    		}
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PermutationsII test = new PermutationsII();
		int[] nums = {1,3,2};
		List<List<Integer>> res = test.permuteUnique(nums);
		System.out.println(res);
	}

}
