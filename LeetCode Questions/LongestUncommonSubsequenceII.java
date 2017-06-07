import java.util.*;
//2017-5-5
public class LongestUncommonSubsequenceII {
    public int findLUSlength(String[] strs) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(String st : strs){
        	for(String s:getsub(st)){
        		map.put(s, map.getOrDefault(s, 0)+1);
        	}
        }
        int res = -1;
        for(String s:map.keySet()){
        	if(map.get(s)==1) res = Math.max(res, s.length());
        }
        return res;
    }
    public Set<String> getsub(String s){
    	Set<String> res = new HashSet<>();
    	if(s.length()==0) {
    		res.add("");
    		return res;
    	}
    	Set<String> lis = getsub(s.substring(1));
    	res.addAll(lis);
    	for(String st:lis) res.add(s.charAt(0)+st);
    	return res;
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
