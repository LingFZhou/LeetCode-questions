import java.util.Stack;
//2017-3-14
public class BinaryTreeUpsideDown {
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){val = x;}
	}
//	if(root == null || root.left == null) {
//        return root;
//    }
//    
//    TreeNode newRoot = upsideDownBinaryTree(root.left);
//    root.left.left = root.right;   // node 2 left children
//    root.left.right = root;         // node 2 right children
//    root.left = null;
//    root.right = null;
//    return newRoot;
	
	
	
    public TreeNode upsideDownBinaryTree(TreeNode root) {
    	if(root == null) return null;
        Stack<TreeNode> left = new Stack<>();
        Stack<TreeNode> right = new Stack<>();
        left.push(new TreeNode(root.val));
        while(root.left!=null){
        	left.push(new TreeNode(root.left.val));
        	if(root.right==null) right.push(null);
        	else if(root.right!=null) right.push(new TreeNode(root.right.val));
        	root = root.left;
        }
        TreeNode res = left.peek();
        while(!right.empty()){
        	TreeNode nroot = left.pop();
        	nroot.left = right.pop();
        	nroot.right = left.peek();
        }
        return res;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
