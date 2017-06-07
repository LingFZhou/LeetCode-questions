import java.util.Stack;
//2017-2-11
public class DecodeString {
    public String decodeString(String s) {
    	 Stack<Integer> count = new Stack<>();
         Stack<String> result = new Stack<>();
         result.push("");
         int i = 0;
         while(i < s.length()){
         	if(Character.isDigit(s.charAt(i))){
         	    int start = i;
                 while(Character.isDigit(s.charAt(i+1))) i++;
                 count.push(Integer.parseInt(s.substring(start, i + 1)));	
         		
         	}
         	else if(s.charAt(i) == '[') result.push("");
         	else if(s.charAt(i) == ']') {
         		String str = result.pop();
         		int m = count.pop();
         		StringBuilder temp = new StringBuilder();
         		for(int k = 0; k < m; k++) temp.append(str);
         		result.push(result.pop() + temp.toString());
         	}
         	else result.push(result.pop()+ s.charAt(i));
         	i++;
             }  
         return result.pop();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
