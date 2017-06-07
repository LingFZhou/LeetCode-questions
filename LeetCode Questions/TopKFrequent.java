import java.util.*;

public class TopKFrequent {
	public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> result = new ArrayList();
        Hashtable ht = new Hashtable();
        
        Arrays.sort(nums);
        int count = 1;
        ht.put(nums[0], 1);
        for(int i = 1; i <= nums.length - 1; i++){
        	if(nums[i] == nums[i - 1]){
        		count ++;
        		ht.put(nums[i], count);
        	}
        	else if(nums[i] != nums[i - 1]){
        		count = 1;
        		ht.put(nums[i],count);
        	}
        }
        Set set = ht.entrySet();
        Map.Entry[] entries = (Map.Entry[])set.toArray(new Map.Entry[set.size()]); 
        Arrays.sort(entries,new Comparator(){
        	public int compare(Object arg0, Object arg1){
        		int key1 = Integer.parseInt(((Map.Entry) arg0).getValue().toString());
        		int key2 = Integer.parseInt(((Map.Entry) arg1).getValue().toString());
        		return ((Comparable) key2).compareTo(key1);
        	}
        });
        for(int i = 0; i <= k - 1; i++){
        	result.add((Integer) entries[i].getKey());
        	
        }
        return result;
    }
	public static void main(String[] args){
		TopKFrequent test = new TopKFrequent();
		int[] nums = {1,1,1,2,2,3};
		System.out.println(test.topKFrequent(nums, 2));
	}
}
