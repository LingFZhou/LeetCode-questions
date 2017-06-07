//2017-3-16
public class HouseRobberIII {
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){val = x;}
	}
//	if (root == null) {
//        return new int[]{0, 0};
//    } else {
//        int[] maxVal = new int[2];//maxVal[0] store the max value without robing current node, maxVal[1] store the max value with robing current node,
//        int[] leftMax = dpRob(root.left);
//        int[] rightMax = dpRob(root.right);
//        maxVal[0] = Math.max(leftMax[0], leftMax[1]) + Math.max(rightMax[0], rightMax[1]);
//        maxVal[1] = leftMax[0] + rightMax[0] + root.val;
//        return maxVal;
//    }
//	return Math.max(maxVal[0], maxVal[1]);
    public int rob(TreeNode root) {
        return helper(root);
    }
    public int helper(TreeNode root){
    	if(root==null) return 0;
    	int sumroot = 0, sumleaf = 0;
    	if(root.left!=null&&root.right!=null){
    		sumroot = root.val+helper(root.left.left)+helper(root.left.right)
    		+helper(root.right.left)+helper(root.right.right);
    		sumleaf = helper(root.left)+helper(root.right);
    		return Math.max(sumroot, sumleaf);
    	}
    	else if(root.left!=null&&root.right==null){
    		sumroot = root.val+helper(root.left.left)+helper(root.left.right);
    		sumleaf = helper(root.left);
    		return Math.max(sumroot, sumleaf);
    	}
    	else if(root.left==null&&root.right!=null){
    		sumroot = root.val+helper(root.right.left)+helper(root.right.right);
    		sumleaf = helper(root.right);
    		return Math.max(sumroot, sumleaf);
    	}
    	else return root.val;
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HouseRobberIII test = new HouseRobberIII();
		TreeNode root = test.new TreeNode(3);
		TreeNode node1 = test.new TreeNode(4);
		TreeNode node2 = test.new TreeNode(5);
		TreeNode node3 = test.new TreeNode(1);
		TreeNode node4 = test.new TreeNode(3);
		TreeNode node5 = test.new TreeNode(1);
		root.left = node1;
		root.right = node2;
		node1.left = node3;
		node1.right = node4;
		node2.right = node5;
		int res = test.rob(root);
		System.out.println(res);
		
	}

}
