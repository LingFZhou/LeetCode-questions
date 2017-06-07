//2017/2/2
public class PathSumIII {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	public int findpath(TreeNode N, int sum){
		if(N == null) return 0;
		int path = 0;
		if(N.val == sum) path++;
		path += findpath(N.left, sum - N.val);
		path += findpath(N.right, sum - N.val);
		return path;
	}
	public int pathSum(TreeNode root, int sum) {
		if(root == null) return 0;
		return findpath(root,sum) + pathSum(root.left,sum) + pathSum(root.right,sum);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PathSumIII test = new PathSumIII();
		int sum = 8;
		TreeNode root = test.new TreeNode(8);
		root.left = test.new TreeNode(5);
		root.left.left = test.new TreeNode(3);
		int m = test.pathSum(root, sum);
		System.out.println(m);
	}

}
