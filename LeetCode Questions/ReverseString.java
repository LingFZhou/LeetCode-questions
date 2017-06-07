
public class ReverseString {
	public String reverseString(String s){
		char[] cs = new char[s.length()];
		char[] rs = new char[s.length()];
		int j = 0;
		cs = s.toCharArray();
		for(int i = s.length() - 1; i >= 0; i--){
			rs[j] = cs[i];
			j++;
		}		
		String r = String.valueOf(rs);
		return r;
	}
	
	public static void main(String[] args){
		ReverseString test = new ReverseString();
		System.out.println(test.reverseString("hello"));
		
	}
}
