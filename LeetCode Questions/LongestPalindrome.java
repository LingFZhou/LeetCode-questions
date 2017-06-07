import java.util.Arrays;

public class LongestPalindrome {
	public int longestPalindrome(String s) {
		char[] c = s.toCharArray();
		Arrays.sort(c);
		int le = c.length;
		int counter = 0;
		boolean flag = true;
		int i = 0;
		if(le == 1) return 1;
		while(i<le-1){
			if(c[i]==c[i+1]){
				counter += 2;
				i += 2;
			}
			else if(c[i] != c[i+1]){
				i += 1;
				flag = false;
			}
		}
		
		if(flag == false)  counter += 1;
		if(flag == true) counter = le;
		return counter;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestPalindrome test = new LongestPalindrome();
		System.out.println(test.longestPalindrome("ccc"));
	}

}
