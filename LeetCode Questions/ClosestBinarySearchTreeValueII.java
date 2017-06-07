import java.util.*;
//2017-3-10
public class ClosestBinarySearchTreeValueII {
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){val = x;}
	}
    public List<Integer> closestKValues(TreeNode root, double target, int k) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        int n1 = helper(root,target,true,s1);
        int n2 = helper(root,target,false,s2);
        List<Integer> res = new ArrayList<>();
        while(k-->0){
        	if(s1.empty()) res.add(s2.pop());
        	else if(s2.empty()) res.add(s1.pop());
        	else if(Math.abs(s1.peek()-target)<Math.abs(s2.peek()-target)) res.add(s1.pop());
        	else if(Math.abs(s1.peek()-target)>=Math.abs(s2.peek()-target)) res.add(s2.pop());
        }
        return res;
    }
    public int helper(TreeNode root, double target, boolean inver, Stack<Integer> st){
    	if(root == null) return 0;
    	int in1 = helper(inver?root.left:root.right,target,inver,st);
    	if((inver&&root.val>target)||(!inver&&root.val<=target)) return 0;
    	st.push(root.val);
    	int in2 = helper(inver?root.right:root.left,target,inver,st);
    	return 0;
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
