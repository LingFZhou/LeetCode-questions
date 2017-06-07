import java.util.ArrayList;
//2017-2-2
public class ReverseVowelsofaString {
    public String reverseVowels(String s) {
    	StringBuilder sb = new StringBuilder();
    	
    	StringBuilder sr = new StringBuilder();
    	for(int i = 0; i < s.length(); i++){
    		if(s.charAt(i) == 'a'||s.charAt(i) == 'e'||s.charAt(i) == 'i'
    				||s.charAt(i) == 'o'||s.charAt(i) == 'u'||s.charAt(i) == 'A'
    				||s.charAt(i) == 'E'||s.charAt(i) == 'I'
    				||s.charAt(i) == 'O'||s.charAt(i) == 'U')
    		sb.append(s.charAt(i));
    	}
    	sb.reverse();
    	int j = 0;
    	for(int i = 0; i < s.length(); i++){
    		if(!(s.charAt(i) == 'a'||s.charAt(i) == 'e'||s.charAt(i) == 'i'
    				||s.charAt(i) == 'o'||s.charAt(i) == 'u'||s.charAt(i) == 'A'
    				||s.charAt(i) == 'E'||s.charAt(i) == 'I'
    				||s.charAt(i) == 'O'||s.charAt(i) == 'U'))
    		sr.append(s.charAt(i));
    		else {
    			sr.append(sb.charAt(j));
    			j++;
    		}
    	}
    	return sr.toString();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseVowelsofaString test = new ReverseVowelsofaString();
		String s = "aA";
		String r = test.reverseVowels(s);
		
		
		System.out.println(r);
	}

}
