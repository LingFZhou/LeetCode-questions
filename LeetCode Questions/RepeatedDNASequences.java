import java.util.*;
//2017-4-22
public class RepeatedDNASequences {
    public List<String> findRepeatedDnaSequences(String s) {
    	HashMap<String, Integer> map = new HashMap<>();
    	List<String> list = new ArrayList<>();
    	
        if(s.length()<11) return list;
        for(int i = 0; i <= s.length()-10;i++){
        	String t = s.substring(i,i+10);
        	map.put(t, map.getOrDefault(t, 0)+1);
        }
        for(String st: map.keySet()){
        	if(map.get(st)>1) list.add(st);
        }
        return list;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RepeatedDNASequences test = new RepeatedDNASequences();
		String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
		List<String> list = test.findRepeatedDnaSequences(s);
		System.out.println(list);
	}

}
