import java.util.Stack;
//2017-2-14
public class BalancedBinaryTree {
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){ val = x;}
	}
	//recursive
//	int depth (TreeNode *root) {
//        if (root == NULL) return 0;
//        return max (depth(root -> left), depth (root -> right)) + 1;
//    }
//
//    bool isBalanced (TreeNode *root) {
//        if (root == NULL) return true;
//        
//        int left=depth(root->left);
//        int right=depth(root->right);
//        
//        return abs(left - right) <= 1 && isBalanced(root->left) && isBalanced(root->right);
//    }
    public boolean isBalanced(TreeNode root) {
        Stack <TreeNode> st = new Stack();
        if(root == null) return true;
        if(root.left!=null&&root.right!=null){
        	st.push(root.left);
            st.push(root.right);
        }
        else return Math.abs(help(root.left,0)-help(root.right,0))<=1;
        
        TreeNode left;
        TreeNode right;
        boolean flag = true,flag2 = true;
        while(!st.isEmpty()){
        	right = st.pop();
        	left = st.pop();
        	if(Math.abs(help(left,0)-help(right,0))>1) return false;
        	if(left.left!=null&&left.right!=null){
        		st.push(left.left);
        		st.push(left.right);
        	}
        	if(left.left==null||left.right==null) 
        		flag = Math.abs(help(left.left,0)-help(left.right,0))<=1;
        	if(right.left!=null&&right.right!=null){
        		st.push(right.left);
        		st.push(right.right);
        	}
        	if(right.left==null||right.right==null) 
        		flag2 = Math.abs(help(right.left,0)-help(right.right,0))<=1;
        	if(flag == false||flag2==false) return false;
        }
        return true;
    }
    public int help(TreeNode root, int height){
    	if(root == null) return -1;
    	height =1 + Math.max(help(root.left, height),help(root.right,height));
    	return height;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BalancedBinaryTree test = new BalancedBinaryTree();
		TreeNode root = test.new TreeNode(1);
		TreeNode root1 = test.new TreeNode(2);
		TreeNode root2 = test.new TreeNode(2);
		TreeNode root3 = test.new TreeNode(3);
		TreeNode root4 = test.new TreeNode(3);
		TreeNode root5 = test.new TreeNode(4);
		TreeNode root6 = test.new TreeNode(4);
		
		
		root.left = root1;
		root.right = root2;
		root1.right = root3;
		root2.right = root4;
//		root3.left = root5;
		root4.right  = root6;
		//root2.left = root6;
		boolean flag = test.isBalanced(root);
		System.out.println(flag);
	}

}
