import java.util.*;
//2017-4-14
public class PalindromePermutationII {
    public List<String> generatePalindromes(String s) {
        List<Character> list = new ArrayList<>();
        List<String> res = new ArrayList<>();
        int odd = 0;
        String od = "";
        Map<Character,Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++){
        	map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        	odd+=map.get(s.charAt(i))%2==0?-1:1;
        }
        if(odd>1) return res;
        for(Map.Entry<Character, Integer> en:map.entrySet()){
        	char c = en.getKey();
        	int v = en.getValue();
        	if(v%2==1) od+=c;
        	for(int i = 0; i < v/2; i++) list.add(c);
        }
        int m = s.length();
        int[] used = new int[m];
        helper(list,od,new StringBuilder(),used,res);
       
        return res;
    }
    public void helper(List<Character> list, String od,
    		StringBuilder t,int[] used,List<String> res){
    	if(t.length()==list.size()){
    		res.add(t.toString()+od+t.reverse().toString());
    		t.reverse();
    		return;
    	}
    	for(int i = 0; i < list.size(); i++){
    		
    		if(used[i]==0){
    			used[i]=1;
	    		t.append(list.get(i));
	    		helper(list,od,t,used,res);
	    		t.deleteCharAt(t.length()-1);
	    		used[i]=0;
	    		while(i<list.size()-1&&list.get(i)==list.get(i+1))i++;
    		}
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromePermutationII test = new PalindromePermutationII();
		String s = "ababa";
		List<String> list = test.generatePalindromes(s);
		System.out.println(list);
	}

}
