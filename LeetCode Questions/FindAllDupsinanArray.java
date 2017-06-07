import java.util.*;
//2017-2-6
public class FindAllDupsinanArray {
	public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list2 = new ArrayList();
        HashSet<Integer> list = new HashSet();
        if(nums.length == 0) return list2;
        
        list.add(nums[0]);
        for(int i = 1; i < nums.length; i++){
        	if(list.contains(nums[i])) list2.add(nums[i]);
        	list.add(nums[i]);
        }
        
        return list2;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindAllDupsinanArray test = new FindAllDupsinanArray();
		int[] nums = {1,2,3,4,2,3,1,4};
		List<Integer> list = test.findDuplicates(nums);
		for(int n : list) System.out.println(n);
	}

}
