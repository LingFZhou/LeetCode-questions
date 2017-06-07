import java.util.*;
//2017-3-4
public class KdiffPairsinanArray {
    public int findPairs(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int res = 0;
        if(nums.length == 0||k<0) return 0;
        if(k==0){
        	HashMap<Integer,Integer> map = new HashMap<>();
        	for(int i = 0; i < nums.length;i++){	
        		map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        	}
        	for(Integer i:map.keySet())
        		if(map.get(i)>1) res++;
        	
        	return res;
        }
        for(int i = 0; i < nums.length;i++) set.add(nums[i]);
        for(Integer i : set){
        	int r1 = i-k;
        	int r2 = i+k;
        	if(set.contains(r1)) res++;
        	if(set.contains(r2)) res++;
        }
        return res/2;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KdiffPairsinanArray test = new KdiffPairsinanArray();
		int[] nums = {3, 1, 4,1, 5};
		int res = test.findPairs(nums, 2);
		System.out.println(res);
	}

}
