import java.util.*;
//2017-4-9
public class LetterCombinationsofaPhoneNumber {
    public List<String> letterCombinations(String digits) {
        String[] map = {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        LinkedList<String> list = new LinkedList<>();
        if(digits.length()==0) return list;
        list.add("");
        for(int i = 0; i < digits.length(); i++){
        	int m = digits.charAt(i)-'0';
        	while(list.peek().length()==i){
        		String t = list.remove();
        		for(char c:map[m].toCharArray()) list.add(t+c);
        	}
        }
        return list;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LetterCombinationsofaPhoneNumber test = new LetterCombinationsofaPhoneNumber();
		String digits = "";
		List<String> res = test.letterCombinations(digits);
		System.out.println(res);
	}

}
