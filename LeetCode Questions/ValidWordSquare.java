import java.util.*;
//2017-2-4
public class ValidWordSquare {
    public boolean validWordSquare(List<String> words) {
    	int maxlen = words.size();
        char[][] s = new char[maxlen][maxlen];
        for(int i = 0; i < words.size(); i++){
        	for(int j = 0; j < words.get(i).length(); j++){
        		if(j >= maxlen ) return false;
        		s[i][j] = words.get(i).charAt(j);
        	}
        }
        for(int i = 0; i < s.length; i++){
        	for(int j = 0; j < s.length; j++){
        		if(s[i][j] != s[j][i]) return false;
        	}
        }
        for(char c[] :s)
        	for(char cm :c)
        System.out.println(cm);
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidWordSquare test = new ValidWordSquare();
		List<String> words = new ArrayList();
		words.add("c");
		words.add("d");
		words.add("ef");
		
		boolean f = test.validWordSquare(words);
		System.out.println(f);
	}

}
