//2017-2-14
public class ClosestBinarySearchTreeValue {
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){ val = x;}
	}
	public int closestValue(TreeNode root, double target) {
		int min = 0;
        if(root.val > target){
            if(root.left == null ) min = root.val;
            else{
                if(root.left.val <= target) min = Math.abs(root.val-target) 
                		< Math.abs(closestValue(root.left,target)-target)?root.val:closestValue(root.left,target);
                else min = closestValue(root.left, target);
            }
        } 
        if(root.val < target){
            if(root.right == null ) min = root.val;
            else{
                if(root.right.val >= target)  min =  Math.abs(closestValue(root.right,target)-target)
                		< Math.abs(root.val-target)?closestValue(root.right,target):root.val;
                else min = closestValue(root.right, target);
            }
        }
        if(root.val == target) min = root.val;
        return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClosestBinarySearchTreeValue test = new ClosestBinarySearchTreeValue();
		TreeNode root = test.new TreeNode(2);
		TreeNode root2 = test.new TreeNode(1);
		TreeNode root3 = test.new TreeNode(3);
		TreeNode root4 = test.new TreeNode(4);
		root.left = root2;
		root.right = root3;
		root3.right = root4;
		int n = test.closestValue(root, -2.00);
		System.out.println(n);
	}

}
