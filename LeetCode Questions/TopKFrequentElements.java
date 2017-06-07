import java.util.*;
//2017-3-7
public class TopKFrequentElements {
    public List<Integer> topKFrequent(int[] nums, int k) {
    	PriorityQueue<List<Integer>> pq = new PriorityQueue<>((a, b) -> (b.get(1) - a.get(1)));
        HashMap<Integer,Integer> map = new HashMap<>();
        
        List<Integer> res = new ArrayList<Integer>();
        for(int i:nums)
        	map.put(i, map.getOrDefault(i, 0)+1);   
        
        for(Integer i:map.keySet()){
        	List<Integer> lis = new ArrayList<Integer>();
        	lis.add(i);
        	lis.add(map.get(i));
        	pq.add(lis);
        }
        for(int i = 0; i < k; i++) res.add(pq.poll().get(0));
        System.out.println(res);
        return res;
        
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TopKFrequentElements test = new TopKFrequentElements();
		int[] nums = {1,1,1,2,2,3};
		List<Integer> lis = test.topKFrequent(nums, 2);
	}

}
