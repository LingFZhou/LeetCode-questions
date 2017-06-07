
public class IsSubsequence {
	public boolean isSubsequence(String s, String t) {
		if(s.length() == 0) return true;
		if(s.length() != 0 && t.length() == 0) return false;
		char[] cs = new char[s.length()];
		char[] ct = new char[t.length()];
		boolean flag = true;
		int r = 0;
		cs = s.toCharArray();
		ct = t.toCharArray();
		for(int i = 0; i <= s.length() - 1; i++){
			for(int j = r; j <= t.length() - 1; j++){
				if(cs[i] == ct[j]) {
					r = j + 1;
					break;
				}
				else if(cs[i] != ct[j] && j == t.length() - 1) flag = false;
			}
			
		}
		return flag;
	}
	public static void main(String[] args){
		IsSubsequence test = new IsSubsequence();
		System.out.println(test.isSubsequence("abc", "ahbgdc"));
	}
}
