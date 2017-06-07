import java.util.Stack;
//2017-2-22
public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack();
        for(int i = 0; i < s.length(); i++){
        	char c = s.charAt(i);
        	if(c == '('||c == '['||c == '{')
        		st.push(c);
        	if(c == ')'||c == ']'||c == '}'){
        		if(st.empty()) return false;
        		if(c==')'&&st.peek()!='(') return false;
        		if(c==']'&&st.peek()!='[') return false;
        		if(c=='}'&&st.peek()!='{') return false;
        		st.pop();
        	}
        	
        }
        if(!st.empty()) return false;
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidParentheses test = new ValidParentheses();
		String s = "";
		boolean f = test.isValid(s);
		System.out.println(f);
	}

}
