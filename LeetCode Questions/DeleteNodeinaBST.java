//2017-3-25
public class DeleteNodeinaBST {
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){ val = x;}
	}
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;
        if(root.val>key) root.left = deleteNode(root.left,key);
        else if(root.val<key) root.right = deleteNode(root.right,key);
        else{
        	if(root.left == null) return root.right;
        	else if(root.right == null) return root.left;
        	else {
        		TreeNode temp = helper(root.right);
        		root.val = temp.val;
        		root.right = deleteNode(root.right, root.val);
        	}
        }
        return root;
    }
    public TreeNode helper(TreeNode root){
    	while(root.left!=null) root = root.left;
    	return root;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
