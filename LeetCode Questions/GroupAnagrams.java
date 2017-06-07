import java.util.*;
//2017-3-29
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
    	List<List<String>> res = new ArrayList<>();
    	Map<String,ArrayList<String>> map = new HashMap<>();
    	for(String s: strs){
    		char[] c = s.toCharArray();
    		Arrays.sort(c);
    		String st = "";
    		for(char ch : c) st+=ch;
    		if(!map.containsKey(st)) map.put(st, new ArrayList<String>());
    		map.get(st).add(s);
    	}
    	res.addAll(map.values());
    	return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
		GroupAnagrams test =  new GroupAnagrams();
		List<List<String>> res = test.groupAnagrams(strs);
		System.out.println(res);
		
	}

}
