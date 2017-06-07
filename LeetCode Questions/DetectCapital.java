//2017-2-18
public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        String word2 = word;
        if(word=="") return false;
        if(word.charAt(0)-'a'<='z'-'a'&&word.charAt(0)-'a'>='a'-'a'){
        	word2 = word2.toLowerCase();
        	if(!word.equals(word2)) return false;
        }
        if(word.charAt(0)-'A'<='Z'-'A'&&word.charAt(0)-'A'>='A'-'A'){
        	if(word.length()>=2&&(word.charAt(1)-'A'<='Z'-'A'&&word.charAt(1)-'A'>='A'-'A')){
        		word2 = word2.toUpperCase();
        		if(!word.equals(word2)) return false;
        	}
        	if(word.length()>=2&&(word.charAt(1)-'a'<='z'-'a'&&word.charAt(1)-'a'>='a'-'a')){
        		word2 = word2.substring(1, word2.length());
        		word = word.substring(1, word.length());
        		word2 = word2.toLowerCase();
        		if(!word.equals(word2)) return false;
        	}
        }
        return true;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String m = "g";
		DetectCapital test = new DetectCapital();
		boolean n = test.detectCapitalUse(m);
		
		System.out.println(n);
	}

}
