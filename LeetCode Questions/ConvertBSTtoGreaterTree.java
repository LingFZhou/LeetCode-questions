import java.util.Stack;

public class ConvertBSTtoGreaterTree {
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){val = x;}
	}
    public TreeNode convertBST(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        root.val += helper(root);
        st.push(root);
        st.push(root.left);
        st.push(root.right);
        while(!st.empty()){
        	TreeNode rn = st.pop();
        	TreeNode ln = st.pop();
        	TreeNode rtn = st.pop();
        	rn.val = rn.val+helper(rn);
        	
        }
        return root;
    }
    public int helper(TreeNode root){
    	if(root == null||root.right == null) return 0;
    	return calsum(root.right);
    }
    public int calsum(TreeNode root){
    	if(root==null) return 0;
    	return root.val+calsum(root.left)+calsum(root.right);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
