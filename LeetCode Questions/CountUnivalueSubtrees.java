//2017-2-21
public class CountUnivalueSubtrees {
	private int count;
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x;}
	}
    public int countUnivalSubtrees(TreeNode root) {
        count = 0;
        boolean f = helper(root);
        return count;
    }
    public boolean helper(TreeNode root){
    	if(root == null) return true;
    	boolean left = helper(root.left);
    	boolean right = helper(root.right);
    	if(left&&right){
    		if(root.left!=null&&root.val!=root.left.val) return false;
    		if(root.right!=null&&root.right.val!=root.val) return false;
    		count++;
    		return true;
    	}
    	return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
