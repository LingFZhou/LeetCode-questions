import java.util.*;
//2017-3-29
public class GroupShiftedStrings {
    public List<List<String>> groupStrings(String[] strings) {
    	List<List<String>> res = new ArrayList<>();
    	Map<String, ArrayList<String>> map = new HashMap<>();
    	//Arrays.sort(strings);
    	for(String s: strings){
    		String st = "";
    		for(int i = 1; i < s.length(); i++)
    			st+= String.format("%2d", (s.charAt(i)-s.charAt(i-1)+26)%26);
    		if(!map.containsKey(st)) map.put(st, new ArrayList<String>());
    		map.get(st).add(s);	
    	}
    	res.addAll(map.values());
    	return res;

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GroupShiftedStrings test = new GroupShiftedStrings();
		String[] strings = {"abc", "bcd", "acef", "xyz", "az", "ba", "a", "z"};
		List<List<String>> res = test.groupStrings(strings);
		System.out.println(res);
	}

}
