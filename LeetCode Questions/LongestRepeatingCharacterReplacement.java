//2017-2-21
public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int start = 0, maxcount = 0, maxlength = 0;
        int[] count = new int[26];
        for(int end = 0; end < s.length(); end++){
        	maxcount = Math.max(maxcount, ++count[s.charAt(end)-'A']);
        	while(end-start+1-maxcount>k){
        		count[s.charAt(start)-'A']--;
        		start++;
        	}
        	maxlength = Math.max(maxlength, end-start+1);
        }
        return maxlength;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestRepeatingCharacterReplacement test = new LongestRepeatingCharacterReplacement();
		String s = "ABAA";
		int res = test.characterReplacement(s, 0);
		System.out.println(res);
	}

}
