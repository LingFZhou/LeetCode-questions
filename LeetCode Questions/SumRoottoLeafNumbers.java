//2017-3-22
public class SumRoottoLeafNumbers {
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){val = x;}
	}
    public int sumNumbers(TreeNode root) {
        return helper(root,0);
    }
    public int helper(TreeNode root, int init){
    	if(root == null) return 0;
    	if(root.left == null&&root.right == null) return init*10 + root.val;
    	else if(root.left == null&&root.right != null){
    		init = init*10+root.val;
    		return helper(root.right,init);
    	}
    	else if(root.left != null&&root.right == null){
    		init = init*10+root.val;
    		return helper(root.left,init);
    	}
    	else {
    		init = init*10+root.val;
    		return helper(root.right,init)+helper(root.left, init);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumRoottoLeafNumbers test = new SumRoottoLeafNumbers();
		TreeNode root = null;
//		TreeNode root = test.new TreeNode(1);
//		TreeNode node1 = test.new TreeNode(2);
//		TreeNode node2 = test.new TreeNode(3);
//		TreeNode node3 = test.new TreeNode(3);
//		TreeNode node4 = test.new TreeNode(3);
//		root.left = node1;
//		node1.right = node2;
//		root.right = node3;
//		node3.right = node4;
		int res = test.sumNumbers(root);
		System.out.println(res);
		
	}

}
