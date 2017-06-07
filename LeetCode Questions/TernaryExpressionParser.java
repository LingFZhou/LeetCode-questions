import java.util.Stack;
//2017-3-4
public class TernaryExpressionParser {
    public String parseTernary(String expression) {
        Stack<Character> st = new Stack();
        String res = "";
        if(expression.length() == 0) return res;
        for(int i = expression.length()-1; i >= 0; i--){
        	char c = expression.charAt(i);
        	if(!st.isEmpty()&&st.peek()=='?'){
        		st.pop();
        		char c1 = st.pop();
        		st.pop();
        		char c2 = st.pop();
        		st.push(c=='T'?c1:c2);
        		
        	}
        	else st.push(c);
        }
        res += st.peek();
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
