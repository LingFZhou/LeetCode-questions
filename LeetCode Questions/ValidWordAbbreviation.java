//2017-2-26
public class ValidWordAbbreviation {
    public boolean validWordAbbreviation(String word, String abbr) {
        for(int i = 0,k=0;i < abbr.length();i++,k++){
        	char c = abbr.charAt(i);
        	if(c=='0') return false;
        	if(Character.isDigit(c)){
        		int j = i;
        		while(Character.isDigit(c)&&i<abbr.length()){
        			if(i<abbr.length()-1) c = abbr.charAt(++i);
        			else if(i == abbr.length()-1) i++;
        		}
        		int m = Integer.valueOf(abbr.substring(j, i));
        		k+=m;
        		if(i==abbr.length()&&k!=word.length()) return false;
        		i--;
        		k--;
        	}
        	else if(!Character.isDigit(c)){
        		if(k>word.length()-1) return false;
        		if(word.charAt(k)!=abbr.charAt(i)) return false;
        	}
        }
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ValidWordAbbreviation test = new ValidWordAbbreviation();
		String word = "a";
		String abbr = "01";
		boolean f = test.validWordAbbreviation(word, abbr);
		System.out.println(f);
	}

}
