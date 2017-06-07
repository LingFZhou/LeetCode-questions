//2017-2-2
public class RepeatedSubstringPattern {
	public boolean repeatedSubstringPattern(String str) {
        for(int i = str.length()/2; i >= 1; i--){
        	if(str.length() % i == 0){
        		if(str.split(str.substring(0,i)).length == 0) return true;
        	}
        }
        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aba";
		String[] m = str.split("abab");
		RepeatedSubstringPattern test = new RepeatedSubstringPattern();
		boolean flag = test.repeatedSubstringPattern(str);
		
		System.out.println(flag);
	}

}
