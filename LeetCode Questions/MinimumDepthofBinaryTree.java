//2017-2-15
public class MinimumDepthofBinaryTree {
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){ val = x;}
	}
    public int minDepth(TreeNode root) {
        int height = 1;
        if(root == null) return 0;
        height = help(root,height);
        return height;
    }
    public int help(TreeNode root, int height){
    	if(root.left == null&&root.right==null) return 1;
    	if(root.left == null&&root.right!=null) height = 1 + help(root.right,height);
    	if(root.left != null&&root.right==null) height = 1 + help(root.left,height);
    	if(root.left != null&&root.right!=null) height = 1+Math.min(help(root.left,height), help(root.right,height));
    	return height;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinimumDepthofBinaryTree test = new MinimumDepthofBinaryTree();
		TreeNode root = test.new TreeNode(2);
		TreeNode root1 = test.new TreeNode(2);
		TreeNode root2 = test.new TreeNode(2);
		root.right = root1;
		//root1.left = root2;
		int res = test.minDepth(root);
		
		System.out.println(res);
		
	}

}
