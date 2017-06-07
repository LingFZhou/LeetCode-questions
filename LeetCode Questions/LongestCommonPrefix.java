//2017-2-21
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String res = "";
        if(strs.length == 0) return res;
        int len = strs[0].length();
        int index = 0;
        for(int i = 0; i < len; i++){
        	char c = strs[0].charAt(i);
        	for(int j = 1; j < strs.length; j++){
        		if(i>=strs[j].length()) return res;
        		else if(strs[j].charAt(i)!=c) return res;
        	}
        	res += c;
        	
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestCommonPrefix test = new LongestCommonPrefix();
		String[] strs ={"aa","a"};
		String res = test.longestCommonPrefix(strs);
		System.out.println(res);
	}

}
