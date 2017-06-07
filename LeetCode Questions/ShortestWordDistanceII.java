import java.util.*;
//2017-3-19
public class ShortestWordDistanceII {
	HashMap<String,List<Integer>> map = new HashMap<>();
    public ShortestWordDistanceII(String[] words) {
        for(int i = 0; i < words.length; i++){
        	if(map.containsKey(words[i])) map.get(words[i]).add(i);
        	else if(!map.containsKey(words[i])){
        		List<Integer> lis = new ArrayList<>();
        		lis.add(i);
        		map.put(words[i], lis);
        	}
        }
    }
    
    public int shortest(String word1, String word2) {
    	int min = Integer.MAX_VALUE;
		for(Integer i1:map.get(word1))
			for(Integer i2:map.get(word2))
				min = Math.min(min, Math.abs(i1-i2));
		return min;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"practice", "makes", "perfect", "coding", "makes"};
		ShortestWordDistanceII test = new ShortestWordDistanceII(words);
		int res = test.shortest("practice", "makes");
		System.out.println(res);
	}

}
