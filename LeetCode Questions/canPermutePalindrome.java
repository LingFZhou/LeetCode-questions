import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
//2017-1-30
public class canPermutePalindrome {
	
	public boolean CanPermutePalindrome(String s) {
//		Set<Character>set = new HashSet<Character>();
//		for (char c : s.toCharArray())  
//			if (set.contains(c)) set.remove(c);// If char already exists in set, then remove it from set
//			else set.add(c);// If char doesn't exists in set, then add it to set
//		return set.size() <= 1;
		char[] cs = s.toCharArray();
		int count = 1;
		HashMap<Character, Integer> map = new HashMap<>();
		Arrays.sort(cs);
		map.put(cs[0], 1);
		for(int i = 1; i < cs.length; i++){
			if(cs[i]==cs[i-1])
				map.put(cs[i], ++count);
			else {
				map.put(cs[i], 1);
				count = 1;
			}
		}
		int j = 0;
		int[] frecount = new int[map.size()];
		Set<Character> ch = map.keySet();
		for(Character c : ch){
			frecount[j++] = map.get(c)%2;
		}
		int cou = 0;
		for(int k = 0; k < frecount.length;k++){
			if(frecount[k]==1) cou++;
		}
		if(cou > 1) return false;
		else return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "carerac";
		canPermutePalindrome test = new canPermutePalindrome();
		System.out.println(test.CanPermutePalindrome(s));
		
		
	}

}
