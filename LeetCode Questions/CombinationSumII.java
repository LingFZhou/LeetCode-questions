import java.util.*;
//2017-4-11
public class CombinationSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    	List<List<Integer>> list = new ArrayList<>();
    	List<Integer> lis = new ArrayList<>();
    	Arrays.sort(candidates);
    	helper(list,lis,candidates,target,0,0);
    	return list;
    }
    public void helper(List<List<Integer>> list, List<Integer> lis, int[] candidates,
    		int target,int sum, int index){
    	if(sum==target) {list.add(lis); return;}
    	if(sum>target) return;
    	for(int i = index; i < candidates.length;i++){
    		sum+=candidates[i];
    		lis.add(candidates[i]);
    		helper(list,new ArrayList(lis),candidates,target,sum,i+1);
    		lis.remove(lis.size()-1);
    		sum-=candidates[i];
    		while(i<candidates.length-1&&candidates[i]==candidates[i+1]) i++;
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CombinationSumII test = new CombinationSumII();
		int[] candidates = {10, 1, 2, 7, 6, 1, 5};
		List<List<Integer>> list = test.combinationSum2(candidates, 8);
		System.out.println(list);
	}

}
