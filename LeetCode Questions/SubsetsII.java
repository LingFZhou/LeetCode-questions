import java.util.*;
//2017-4-1
public class SubsetsII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
    	List<List<Integer>> list = new ArrayList<>();
    	List<Integer> lis = new ArrayList<>();
    	Arrays.sort(nums);
    	helper(nums,0,lis,list);
    	List<List<Integer>> res = new ArrayList<>();
    	for(List<Integer> i : list){
    		if(!res.contains(i)) res.add(i);
    	}
    	return res;
    }
    public void helper(int[] nums, int index,List<Integer>lis, List<List<Integer>> list){
    	if(index<=nums.length) {list.add(lis);}
    	
    	for(int i = index; i < nums.length; i++){
    		lis.add(nums[i]);
    		helper(nums,i+1,new ArrayList<>(lis),list);
    		lis.remove(lis.size()-1);
    		
    		
    	}
    	return;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubsetsII test = new SubsetsII();
		int[] nums = {4,4,4,1,4};
		List<List<Integer>> list = test.subsetsWithDup(nums);
		System.out.println(list);
	}

}
