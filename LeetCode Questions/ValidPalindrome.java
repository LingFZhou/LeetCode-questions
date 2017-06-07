//2017-2-28
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder ns = new StringBuilder();
        for(int i = 0; i < s.length(); i++)
        	if((s.charAt(i)<='z'&&s.charAt(i)>='a')||(s.charAt(i)<='9')&&s.charAt(i)>='0') 
        		ns.append(s.charAt(i));
        for(int i = 0, j = ns.length()-1;i<=j;i++,j--)
        	if(ns.charAt(i)!=ns.charAt(j)) return false;
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidPalindrome test = new ValidPalindrome();
		String s = "abba0";
		boolean f = test.isPalindrome(s);
		System.out.println(f);
	}

}
