import java.util.*;
//2017-4-3
public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    	List<List<Integer>> list = new ArrayList<>();
    	Arrays.sort(candidates);
    	helper(list,candidates,new ArrayList<Integer>(),0,target,0);
    	return list;
    	
    }
    public void helper(List<List<Integer>> list, int[] candidates,
    		List<Integer> lis, int index, int target,int sum){
    	if(sum==target) list.add(lis);
    	for(int i = index; i< candidates.length;i++){
    		lis.add(candidates[i]);
    		sum+=candidates[i];
    		if(sum<=target) helper(list,candidates,new ArrayList<Integer>(lis),i,target,sum);
    		sum-=candidates[i];
    		lis.remove(lis.size()-1);
    	}
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CombinationSum test = new CombinationSum();
		int[] candidates = {2,3,6,7};
		List<List<Integer>> list = test.combinationSum(candidates, 6);
		System.out.println(list);
	}

}
