import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
//2017-2-8
public class SortCharactersByFrequency {
    public String frequencySort(String s) {
    	char[] cs = s.toCharArray();
    	HashMap<Character, Integer> map = new HashMap<>();
    	for(char c : cs) map.put(c, map.getOrDefault(c, 0)+1);
    	PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
    			new Comparator<Map.Entry<Character,Integer>>() {
    				@Override
    				public int compare(Map.Entry<Character, Integer> a, 
    						Map.Entry<Character, Integer> b){
    					return b.getValue() - a.getValue();
    				}
		});
    	pq.addAll(map.entrySet());
    	StringBuilder re = new StringBuilder();
    	while(!pq.isEmpty()){
    		Map.Entry e = pq.poll();
    		for(int i = 0; i < (int)e.getValue(); i++){
    			re.append(e.getKey());
    		}
    	}
    	return re.toString();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
