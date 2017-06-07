//2017-2-2
public class PathSum {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	public boolean hasPathSum(TreeNode root, int sum) {
		
		if(root != null){
        	if(root.left == null && root.right == null) {
    	    	if(sum == root.val ) return true;
        	}
    		if(root.left != null||root.right!=null) 
    			return (hasPathSum(root.left, sum-root.val)
    					||hasPathSum(root.right, sum-root.val));
        }
        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PathSum test = new PathSum();
		TreeNode t = test.new TreeNode(1);
		int sum = 1;
		boolean flag = test.hasPathSum(t, sum);
		System.out.println(flag);
	}

}
