import java.util.Stack;

public class ConstructBinaryTreefromString {
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){val = x;}
	}
    public TreeNode str2tree(String s) {
    	if(s.length()==0) return null;
    	int n = s.charAt(0)=='-'?-1:1;
    	s = s.charAt(0)=='-'?s.substring(1):s;
    	if(s.length()==1){
    		TreeNode res = new TreeNode(n*(s.charAt(0)-'0'));
    		return res;
    	}
    	TreeNode res = new TreeNode(n*(s.charAt(0)-'0'));
        Stack<Character> sc = new Stack<>();
        sc.push(s.charAt(1));
        int end = 0;
        for(int i = 2; i<s.length(); i++){
        	if(s.charAt(i)=='(') sc.push(s.charAt(i));
        	else if(s.charAt(i) == ')') sc.pop();
        	if(sc.empty()){
        		end = i;
        		break;
        	}
        }
        System.out.println(s.substring(2,end));
        //System.out.println(s.substring(end+2,s.length()-1));
        res.left = str2tree(s.substring(2,end));
        if(end+2>s.length()-1) res.right = null;
        else res.right = str2tree(s.substring(end+2,s.length()-1));
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructBinaryTreefromString test = new ConstructBinaryTreefromString();
		String s = "51(232)(243)";
		TreeNode res = test.str2tree(s);
		res.left = null;
	}

}
