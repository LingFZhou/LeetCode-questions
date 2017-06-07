//2017-2-14
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int i = 0;
        if((x%10==0&&x!=0)||x<0) return false;
        while(i<x){
        	i = i*10+x%10;
        	x/=10;
        }
        return (i==x||i/10==x);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromeNumber test = new PalindromeNumber();
		boolean flag = test.isPalindrome(11);
		System.out.println(flag);
	}

}
